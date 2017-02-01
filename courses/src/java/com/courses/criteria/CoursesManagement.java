/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.criteria;

import com.courses.entity.Courses;
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
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

/**
 *
 * @author clement
 */
@Stateless
@LocalBean
public class CoursesManagement {

        @PersistenceContext(unitName = "courses")
	private EntityManager em;
	
        @Transactional
	public Courses createCourses(Courses courses) {
                //Save courses Object to unitName
		this.em.persist(courses);
		return courses;
	}
        
        @Transactional
        public void deleteCourses(int id) {
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		
		// create delete
		CriteriaDelete<Courses> delete = cb.createCriteriaDelete(Courses.class);
		
		// set the root class
		Root e = delete.from(Courses.class);
		
		// set where clause
		delete.where(cb.equal(e.get("id"), id));
		
		// perform update
		this.em.createQuery(delete).executeUpdate();
	}
        
        public void updateCourses(Courses courses, int id) {
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		
		// create update
		CriteriaUpdate<User> update = cb.createCriteriaUpdate(User.class);
		
		// set the root class
		Root e = update.from(User.class);
		
		// set update and where clause
                update.set(e.get("label"), courses.getLabel());
                update.set(e.get("details"), courses.getDetails());
                update.set(e.get("rank"), courses.getRank());
                update.where(cb.equal(e.get("id"), id));
		// perform update
		this.em.createQuery(update).executeUpdate();
	}
        @Transactional
        public List<Courses> getCoursesList() {
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		CriteriaQuery<Courses> query = cb.createQuery(Courses.class);
		Root e = query.from(Courses.class);
		return this.em.createQuery(query).getResultList();
	}
        
        @Transactional
        public Courses getQuestionListByCoursesId(int coursesID) {
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		CriteriaQuery<Courses> query = cb.createQuery(Courses.class);
		Root e = query.from(Courses.class);
                query.where(cb.equal(e.get("idCourses"), coursesID));
                Courses c;
                c = this.em.createQuery(query).getSingleResult();
		return c;
	}
}