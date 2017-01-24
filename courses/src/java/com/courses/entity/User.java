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
@Table(name = "CoursesUser")
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private String email;
    private Timestamp lastConnection;
    private Timestamp created;
    
    public User() {}
    
    public User(String username, String password, String email, Timestamp lastConnection, Timestamp created) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.lastConnection = lastConnection;
        this.created = created;
    }

    
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Timestamp getLastConnection() {
        return lastConnection;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastConnection(Timestamp lastConnection) {
        this.lastConnection = lastConnection;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }
    
}
