/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.services;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author maxime
 */
@Stateless
@LocalBean
public class register {

    public register() {
        
    }

    public boolean loginValidation(String username, String password) {
        
        boolean isValid = false;
        
        if(username.equals(password)){
            isValid = true;
        }
        System.out.println(username+ ' ' +isValid +' ' + password);
        return isValid;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}