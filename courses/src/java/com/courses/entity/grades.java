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
import javax.persistence.Table;

/**
 *
 * @author clement
 */
@Entity
@Table(name = "grades")
public class grades implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;
    private int dateExam;
    private int percent;

    public grades(int dateExam, int percent) {
        this.dateExam = dateExam;
        this.percent = percent;
    }

    public int getIdUser() {
        return idUser;
    }
    
    public int getDateExam() {
        return dateExam;
    }

    public int getPercent() {
        return percent;
    }
    

    public void setDateExam(int dateExam) {
        this.dateExam = dateExam;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
    
}