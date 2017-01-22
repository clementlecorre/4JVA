/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.criteria;

import com.courses.entity.Grades;
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
public class GradesManagement {

        @PersistenceContext(unitName = "courses")
	private EntityManager em;
	
        @Transactional
	public Grades createGrades(Grades grades) {
                //Save grades Object to unitName
		this.em.persist(grades);
		return grades;
	}
        
        @Transactional
        public void deleteGrades(int id) {
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		
		// create delete
		CriteriaDelete<Grades> delete = cb.createCriteriaDelete(Grades.class);
		
		// set the root class
		Root e = delete.from(Grades.class);
		
		// set where clause
		delete.where(cb.lessThanOrEqualTo(e.get("id"), id));
		
		// perform update
		this.em.createQuery(delete).executeUpdate();
	}
        @Transactional
        public List<Grades> getGradesList() {
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		CriteriaQuery<Grades> query = cb.createQuery(Grades.class);
		Root e = query.from(Grades.class);
		return this.em.createQuery(query).getResultList();
	}
}
