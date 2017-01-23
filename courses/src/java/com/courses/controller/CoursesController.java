/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.controller;

import com.courses.criteria.CoursesManagement;
import com.courses.entity.Courses;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author clement
 */
@ManagedBean
@SessionScoped
public class CoursesController {
    @Inject
    private CoursesManagement cm;
    private List<Courses> coursesList;
    private Courses c;
    private int coursesId;

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
    }
    
    
    public List<Courses> getCoursesList() {
        return coursesList =  this.cm.getCoursesList();
    }
    public CoursesController() { }
  
    
}
