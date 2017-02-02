/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.services;

import javax.ejb.Stateless;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author maxime
 */
@Stateless
public class Base64
{
    public static String base64Encode(String token) {
        return DatatypeConverter.printBase64Binary(token.getBytes());
    }

    public static String base64Decode(String token) {
       return new String(DatatypeConverter.parseBase64Binary(token));
    }
}
