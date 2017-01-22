/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.criteria;

import com.courses.entity.User;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
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
	public User createUser(User user) {
                //Save user Object to unitName
		this.em.persist(user);
		return user;
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
		delete.where(cb.lessThanOrEqualTo(e.get("id"), id));
		
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
}
