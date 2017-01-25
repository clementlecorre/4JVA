/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.courses.controller;

import com.courses.entity.User;
import com.courses.criteria.UserManagement;
import java.sql.Timestamp;
import java.util.Date;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author maxime
 */
@ManagedBean
@SessionScoped
public class LoginController {
    
    @EJB
    private UserManagement um;
    private User user;
    
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
    
    private User loggedUser;
    
    public String login() {
        loggedUser = um.login(username, password);
        
        if(loggedUser != null){          
            FacesMessage msg = new FacesMessage("User logged");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            Date date = new Date();
            Timestamp tt = new Timestamp(date.getTime());
            loggedUser.setLastConnection(tt);
            um.updateUserProfil(loggedUser, loggedUser.getId());
            
            return "home.xhtml?faces-redirect=true";
        }else{
            FacesMessage msg = new FacesMessage("Failed to log");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
        
        username = null;
        password = null;
        
        return "login.xhtml";
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index.xhtml?faces-redirect=true";
    }
}