/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.courses.filters;

import com.courses.controller.LoginController;
import com.courses.entity.User;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.faces.context.FacesContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nainterceptor
 */
@WebFilter(urlPatterns={"/auth/*"})
public class UserFilter implements Filter {

    FilterConfig filterConfig = null;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        LoginController loginController = (LoginController) httpRequest.getSession().getAttribute("loginController");
        
        if(null != loginController) {
            User user = loginController.getLoggedUser();
            if(user instanceof User) {
                chain.doFilter(request, response);
                return;
            }
        }
        
        httpResponse.sendRedirect("/courses/index.xhtml");
    }

    @Override
    public void destroy() {
        
    }
    
    
    
}