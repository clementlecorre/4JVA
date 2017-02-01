/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.controller;

import com.courses.criteria.CoursesManagement;
import com.courses.criteria.ViewManagement;
import com.courses.entity.Courses;
import com.courses.entity.View;
import static com.courses.entity.View_.dateView;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author clement
 */
@ManagedBean
@SessionScoped
public class CoursesController {
    @EJB
    private CoursesManagement cm;
    @EJB
    private ViewManagement vm;
    private List<Courses> coursesList;
    private Courses c;
    private int coursesId;
    private View view = null;

    public Courses getC() {
        return c;
    }

    public void setC(Courses c) {
        this.c = c;
    }

    public int getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(int coursesId) {
        this.coursesId = coursesId;
    }

    public void loadingCourses() {
        c = this.cm.getQuestionListByCoursesId(this.coursesId);
        View v = vm.getViewByCoursesId(this.coursesId);
        Date date = new Date();
        Timestamp tt = new Timestamp(date.getTime());
        View newview = new View(this.coursesId, tt);
        if (v == null ) {
            vm.createView(newview);
        } else {
            vm.updateDateCourses(this.coursesId, tt);
        }
        c.setDetails(c.getDetails().replaceAll("(\\\\r\\\\n|\\\\n)", "\\\n"));   
    }
    public String loadingViewedStatus(int coursesId) {
        view = vm.getViewByCoursesId(coursesId);
        if (view.getDateView() == null) {
            return "No";
        } else {
            return view.getDateView().toString();
        }

    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
    
    
    public List<Courses> getCoursesList() {
        return coursesList =  this.cm.getCoursesList();
    }
    public CoursesController() { }
    
    
}
