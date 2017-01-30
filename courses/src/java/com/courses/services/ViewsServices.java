/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.services;

import com.courses.entity.View;
import java.sql.Timestamp;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
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
public class ViewsServices {

    @PersistenceContext(unitName = "courses")
    private EntityManager em;

    @Transactional
    public View createView(View view) {
        //Save responses Object to unitName
        this.em.persist(view);
        return view;
    }

    @Transactional
    public void updateDateCourses(int idCourses, Timestamp date) {

        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        // create update
        CriteriaUpdate<View> update = cb.createCriteriaUpdate(View.class);

        // set the root class
        Root e = update.from(View.class);
        update.set("dateView", date);
        update.where(cb.equal(e.get("idCourses"), idCourses));
        // perform update
        this.em.createQuery(update).executeUpdate();
    }

    @Transactional
    public void updateQuiz(int idCourses, Timestamp date, int percentQuiz) {

        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        // create update
        CriteriaUpdate<View> update = cb.createCriteriaUpdate(View.class);

        // set the root class
        Root e = update.from(View.class);
        update.set("dateQuiz", date);
        update.set("percentQuiz", percentQuiz);
        update.where(cb.equal(e.get("idCourses"), idCourses));
        // perform update
        this.em.createQuery(update).executeUpdate();
    }

    @Transactional
    public View getViewByCoursesId(int coursesID) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<View> query = cb.createQuery(View.class);
        Root e = query.from(View.class);
        query.where(cb.equal(e.get("idCourses"), coursesID));
        View v = this.em.createQuery(query).getSingleResult();
        return v;

    }
}
