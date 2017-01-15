/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.entity.metamodel;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 *
 * @author clement
 */

@StaticMetamodel(userEntity_.class)
class userEntity_ {
        public static volatile SingularAttribute<userEntity_, Integer> id;
        public static volatile SingularAttribute<userEntity_, String> username;
        public static volatile SingularAttribute<userEntity_, String> password;
        public static volatile SingularAttribute<userEntity_, String> email;
        public static volatile SingularAttribute<userEntity_, String> lastConnection;
        public static volatile SingularAttribute<userEntity_, String> created;
        
}
