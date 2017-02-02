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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maxime
 */
@Entity
@Table(name = "Answers")
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)
@XmlRootElement
public class Answers implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAnswer;
    private int idQuestion;
    private String answerText;  
    private Boolean isTrue;

    public Answers() {
    }

    public Answers(int idQuestion, String answerText, Boolean isTrue) {
        this.idQuestion = idQuestion;
        this.answerText = answerText;
        this.isTrue = isTrue;
    }

    public int getIdAnswer() {
        return idAnswer;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public Boolean getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(Boolean isTrue) {
        this.isTrue = isTrue;
    }
    
    
}
