/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.courses.services;

import com.courses.entity.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author maxime
 */
@Stateless
public class UserService {
    
//    @PersistenceContext
//    private EntityManager em;
//    
//    public User save(User user) {
//        em.persist(user);
//        return user;
//    }
//    
//    public List<User> getAll() {
//        return em.createQuery("SELECT c FROM User c").getResultList();
//    }
//
//    public Object findById(long id) {
//        return em.find(User.class, id);
//    }
}