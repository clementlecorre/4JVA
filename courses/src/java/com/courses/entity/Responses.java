/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author maxime
 */
@Entity
@Table(name = "Responses")
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)
public class Responses implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idResponse;
    private int idQuestion;
    private String responseText;  
    private Boolean isTrue;

    public Responses() {
    }

    public Responses(int idQuestion, String responseText, Boolean isTrue) {
        this.idQuestion = idQuestion;
        this.responseText = responseText;
        this.isTrue = isTrue;
    }

    public int getIdResponse() {
        return idResponse;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    public Boolean getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(Boolean isTrue) {
        this.isTrue = isTrue;
    }
    
    
}
