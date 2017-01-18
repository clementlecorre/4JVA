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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author clement
 */
@Entity
@Table(name = "courses")
public class courses implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    private int idCourses;
    private String label;
    private float rank;
    private String details;

    public courses(String label, float rank, String details) {
        this.label = label;
        this.rank = rank;
        this.details = details;
    }

    public int getIdCourses() {
        return idCourses;
    }

    public String getLabel() {
        return label;
    }

    public float getRank() {
        return rank;
    }

    public String getDetails() {
        return details;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setRank(float rank) {
        this.rank = rank;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    

}
