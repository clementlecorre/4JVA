/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.criteria;

import com.courses.entity.User;
import com.courses.services.Base64;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

/**
 *
 * @author clement
 */
@Stateless
@LocalBean
public class UserManagement {

        @PersistenceContext(unitName = "courses")
	private EntityManager em;
	
        @Transactional
	public Boolean createUser(User user) {
                
            Boolean userCreated = false;
            
            CriteriaBuilder cb = this.em.getCriteriaBuilder();
            CriteriaQuery<User> query = cb.createQuery(User.class);
            Root e = query.from(User.class);

            query.where(cb.equal(e.get("username"), user.getUsername()));
            List<User> users = em.createQuery(query).getResultList();

            //If null username not taken
            if(users.isEmpty()){
                Date date = new Date();
                Timestamp tt = new Timestamp(date.getTime());
                user.setLastConnection(tt);
                user.setCreated(tt);
                //Save user Object to unitName
                this.em.persist(user);
                userCreated = true;
            }

            return userCreated;
	}
        
        @Transactional
        public void updateUserProfil(User user, int id) {
            CriteriaBuilder cb = this.em.getCriteriaBuilder();

            // create update
            CriteriaUpdate<User> update = cb.createCriteriaUpdate(User.class);

            // set the root class
            Root e = update.from(User.class);

            // set update and where clause
            update.set(e.get("username"), user.getUsername());
            update.set(e.get("password"), user.getPassword());
            update.set(e.get("email"), user.getEmail());
            update.set(e.get("lastConnection"), user.getLastConnection());
            update.where(cb.equal(e.get("id"), id));
            // perform update
            this.em.createQuery(update).executeUpdate();
	}
        
        @Transactional
        public void deleteUser(int id) {
            CriteriaBuilder cb = this.em.getCriteriaBuilder();

            // create delete
            CriteriaDelete<User> delete = cb.createCriteriaDelete(User.class);

            // set the root class
            Root e = delete.from(User.class);

            // set where clause
            delete.where(cb.equal(e.get("id"), id));

            // perform update
            this.em.createQuery(delete).executeUpdate();
	}
        
        @Transactional
        public List<User> getUserList() {
            CriteriaBuilder cb = this.em.getCriteriaBuilder();
            CriteriaQuery<User> query = cb.createQuery(User.class);
            Root e = query.from(User.class);
            return this.em.createQuery(query).getResultList();
	}
        
        @Transactional
        public List<User> getUserByUsername(String username) {
            CriteriaBuilder cb = this.em.getCriteriaBuilder();
            CriteriaQuery<User> query = cb.createQuery(User.class);
            Root e = query.from(User.class);

            query.where(cb.equal(e.get("username"), username));
            return this.em.createQuery(query).getResultList();
	}
        
        @Transactional
        public User login(String username, String password){
            
            String HashedPassword = null;
            // MD5 salt password
            try{
                HashedPassword = Base64.base64Encode(password);
            }catch(Exception e){
                
            }
            
            CriteriaBuilder cb = this.em.getCriteriaBuilder();
            CriteriaQuery<User> query = cb.createQuery(User.class);
            Root e = query.from(User.class);
            
            query.where(cb.equal(e.get("username"), username));
            List<User> users = em.createQuery(query).getResultList();
            if(users != null && password != null){
                for(User user:users){
                    if(user.getUsername().equals(username) && user.getPassword().equals(HashedPassword)){
                        return user;
                    }
                }
            }
            return null;
        }
}
