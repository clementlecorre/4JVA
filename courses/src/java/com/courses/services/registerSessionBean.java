/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author maxime
 */
@Stateless
@LocalBean
public class registerSessionBean {

    @EJB
    private register registerServerBean;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public Boolean businessMethod(String username, String password) {
        
        Boolean isValid = false;
        
        if(registerServerBean.loginValidation(username, password) == true){
            isValid = true;
        }
        return isValid;
    }
}
