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
import javax.persistence.Table;

/**
 *
 * @author clement
 */
@Entity
@Table(name = "view")
public class view implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;   
    private int dateView;
    private int percent;
    
    public view(int dateView, int percent) {
        this.dateView = dateView;
        this.percent = percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
    
    public int getPercent() {
        return percent;
    }
    
    public void setDateView(int dateView) {
        this.dateView = dateView;
    }

    public int getDateView() {
        return dateView;
    }

    public int getId() {
        return id;
    }
}
