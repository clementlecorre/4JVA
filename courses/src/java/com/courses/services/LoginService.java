/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.services;

import com.courses.criteria.UserManagement;
import com.courses.entity.User;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.xml.bind.DatatypeConverter;
import org.apache.xml.security.utils.Base64;

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
                if(user.getPassword().equals(this.base64Encode(password))){
                    isValid = true;
                }
            }
        }
        
        return isValid;
    }
    
     public static String base64Encode(String token) {
         return DatatypeConverter.printBase64Binary(token.getBytes());
    }

    public static String base64Decode(String token) {
       return new String(DatatypeConverter.parseBase64Binary(token));
    }
}
