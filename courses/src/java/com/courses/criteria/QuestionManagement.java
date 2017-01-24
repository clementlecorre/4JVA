/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.criteria;

import com.courses.entity.Question;
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
public class QuestionManagement {
@PersistenceContext(unitName = "courses")
	private EntityManager em;
	
        @Transactional
	public Question createQuestion(Question question) {
                //Save question Object to unitName
		this.em.persist(question);
		return question;
	}
        
        @Transactional
        public void deleteQuestion(int id) {
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		
		// create delete
		CriteriaDelete<Question> delete = cb.createCriteriaDelete(Question.class);
		
		// set the root class
		Root e = delete.from(Question.class);
		
		// set where clause
		delete.where(cb.lessThanOrEqualTo(e.get("id"), id));
		
		// perform update
		this.em.createQuery(delete).executeUpdate();
	}
        @Transactional
        public List<Question> getQuestionList() {
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		CriteriaQuery<Question> query = cb.createQuery(Question.class);
		Root e = query.from(Question.class);
		return this.em.createQuery(query).getResultList();
	}
         @Transactional
        public List<Question> getQuestionListByCoursesId(int coursesID) {
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		CriteriaQuery<Question> query = cb.createQuery(Question.class);
		Root e = query.from(Question.class);
                query.where(cb.greaterThanOrEqualTo(e.get("idCourses"), coursesID));
		return this.em.createQuery(query).getResultList();
	}
}
