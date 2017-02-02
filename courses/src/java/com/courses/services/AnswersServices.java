/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.services;

import com.courses.entity.Answers;
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
public class AnswersServices {
@PersistenceContext(unitName = "courses")
	private EntityManager em;
	
        @Transactional
	public Answers createAnswers(Answers responses) {
                //Save responses Object to unitName
		this.em.persist(responses);
		return responses;
	}
        
        @Transactional
        public void deleteAnswers(int id) {
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		
		// create delete
		CriteriaDelete<Answers> delete = cb.createCriteriaDelete(Answers.class);
		
		// set the root class
		Root e = delete.from(Answers.class);
		
		// set where clause
		delete.where(cb.equal(e.get("idAnswer"), id));
		
		// perform update
		this.em.createQuery(delete).executeUpdate();
	}
        @Transactional
        public List<Answers> getAnswersList() {
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		CriteriaQuery<Answers> query = cb.createQuery(Answers.class);
		Root e = query.from(Answers.class);
		return this.em.createQuery(query).getResultList();
	}
        @Transactional
        public List<Answers> getAnswersListByQuestionId(int idQuestion) {
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		CriteriaQuery<Answers> query = cb.createQuery(Answers.class);
		Root e = query.from(Answers.class);
                query.where(cb.equal(e.get("idQuestion"), idQuestion));
		return this.em.createQuery(query).getResultList();
	}
}
