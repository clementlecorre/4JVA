package com.courses.entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author clement
 */
@Entity
@Table(name = "ViewCourses")
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)
public class View implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;   
    private int idCourses;   
    private Timestamp dateView;
    private Timestamp dateQuiz;
    private int percentQuiz;
    
    public View() {}

    public View(int idCourses, Timestamp dateView, Timestamp dateQuiz, int percentQuiz) {
        this.idCourses = idCourses;
        this.dateView = dateView;
        this.dateQuiz = dateQuiz;
        this.percentQuiz = percentQuiz;
    }

    public View(int idCourses, Timestamp dateView) {
        this.idCourses = idCourses;
        this.dateView = dateView;
    }

    public View(int idCourses, Timestamp dateQuiz, int percentQuiz) {
        this.idCourses = idCourses;
        this.dateQuiz = dateQuiz;
        this.percentQuiz = percentQuiz;
    }
    
    public int getIdCourses() {
        return idCourses;
    }

    public void setIdCourses(int idCourses) {
        this.idCourses = idCourses;
    }
    
    public void setDateView(Timestamp dateView) {
        this.dateView = dateView;
    }

    public Timestamp getDateView() {
        return dateView;
    }

    public int getId() {
        return id;
    }
    
    public Timestamp getDateQuiz() {
        return dateQuiz;
    }

    public void setDateQuiz(Timestamp dateQuiz) {
        this.dateQuiz = dateQuiz;
    }

    public int getPercentQuiz() {
        return percentQuiz;
    }

    public void setPercentQuiz(int percentQuiz) {
        this.percentQuiz = percentQuiz;
    }
}
