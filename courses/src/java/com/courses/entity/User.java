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
@Table(name = "User")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private String email;
    private int lastConnection;
    private int created;
    
    public User(){
        
    }
    
    public User(String username, String password, String email, int lastConnection, int created) {
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

    public int getLastConnection() {
        return lastConnection;
    }

    public int getCreated() {
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

    public void setLastConnection(int lastConnection) {
        this.lastConnection = lastConnection;
    }

    public void setCreated(int created) {
        this.created = created;
    }
    
}
