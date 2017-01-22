/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.courses.controller;

import com.courses.entity.User;
import com.courses.services.UserService;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

/**
 *
 * @author nainterceptor
 */
@ManagedBean
public class UserController {
    
    @EJB
    private UserService userService;
    
    private User user;
    
    private List<SelectItem> selectItems;
    
    
//    
//    public String create() {
//        userService.save(user);
//        return "manager_home?faces-redirect=true";
//    }

    public User getUser() {
        if(null == user) {
            user = new User();
        }
        
        return user;
    }

//    public List<SelectItem> getSelectItems() {
//        if(null == selectItems) {
//            selectItems = new ArrayList<SelectItem>();
//            for(User user : userService.getAll()) {
//                selectItems.add(new SelectItem(user, user.getUsername()));
//            }
//        }
//        
//        return selectItems;
//    }
}