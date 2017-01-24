/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.criteria;

import com.courses.entity.Responses;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

/**
 *
 * @author clement
 */
@Stateless
@LocalBean
public class ResponsesManagement {
@PersistenceContext(unitName = "courses")
	private EntityManager em;
	
        @Transactional
	public Responses createResponses(Responses responses) {
                //Save responses Object to unitName
		this.em.persist(responses);
		return responses;
	}
        
        @Transactional
        public void deleteResponses(int id) {
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		
		// create delete
		CriteriaDelete<Responses> delete = cb.createCriteriaDelete(Responses.class);
		
		// set the root class
		Root e = delete.from(Responses.class);
		
		// set where clause
		delete.where(cb.lessThanOrEqualTo(e.get("idResponse"), id));
		
		// perform update
		this.em.createQuery(delete).executeUpdate();
	}
        @Transactional
        public List<Responses> getResponsesList() {
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		CriteriaQuery<Responses> query = cb.createQuery(Responses.class);
		Root e = query.from(Responses.class);
		return this.em.createQuery(query).getResultList();
	}
}
