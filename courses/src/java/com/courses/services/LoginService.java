/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.services;

import com.courses.criteria.UserManagement;
import com.courses.entity.User;
import com.sun.xml.ws.rx.rm.protocol.wsrm200702.SequenceAcknowledgementElement;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import org.apache.jasper.tagplugins.jstl.ForEach;

/**
 *
 * @author maxime
 */
@Stateless
@LocalBean
public class LoginService {

    @Inject
    private UserManagement userManager;
    
    public LoginService() {
        
    }

    public boolean loginValidation(String username, String password) {
        
        boolean isValid = false;
        
        List<User> userList = userManager.getUserList();
        
        for(final User user : userList){
            if(user.getUsername().equals(username)){
                if(user.getPassword().equals(password)){
                    isValid = true;
                }
            }
        }
        
        return isValid;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
