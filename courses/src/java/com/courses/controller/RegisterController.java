/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.courses.controller;

import com.courses.entity.User;
import com.courses.criteria.UserManagement;
import com.courses.services.MD5Services;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author maxime
 */
@ManagedBean
@SessionScoped
public class RegisterController {
    
    @EJB
    private UserManagement um;
    private User user;
    
    public RegisterController(){
        user = new User();
    }
    
    public String register(){
        try{
            user.setPassword(MD5Services.HashedPaswword(user.getPassword()));
            
        }catch(Exception e){
            
        }
        if(um.createUser(user)){
            FacesMessage msg = new FacesMessage("Sucess !");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return "index.xhtml";
        }else{
            FacesMessage msg = new FacesMessage("Username already taken");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return null;
        }
        
        
    }
    
    public User getUser(){
        return user;
    }

}