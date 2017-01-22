package com.courses.entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author clement
 */
@Entity
@Table(name = "Question")
public class Question implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idQuestion;
    
//   @OneToOne
//   @JoinColumn(name="idCourses", table = "Courses")
    private int idCourses;    
    private String responseList;

    public Question() {}
    
    public Question(int idCourses, String responseList) {
        this.idCourses = idCourses;
        this.responseList = responseList;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public int getIdCourses() {
        return idCourses;
    }

    public String getResponseList() {
        return responseList;
    }

    public void setIdCourses(int idCourses) {
        this.idCourses = idCourses;
    }

    public void setResponseList(String responseList) {
        this.responseList = responseList;
    }

}
