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
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author clement
 */
@Entity
@Table(name = "Question")
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)
public class Question implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idQuestion;
    private int idCourses;
    private String questionText;

    public Question() {}
    
    public Question(int idCourses, String questionText) {
        this.idCourses = idCourses;
        this.questionText = questionText;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public int getIdCourses() {
        return idCourses;
    }

    public String getAnswerList() {
        return questionText;
    }

    public void setIdCourses(int idCourses) {
        this.idCourses = idCourses;
    }

    public void setAnswerList(String questionText) {
        this.questionText = questionText;
    }

}
