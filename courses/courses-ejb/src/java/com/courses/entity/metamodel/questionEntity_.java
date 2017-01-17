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
@StaticMetamodel(questionEntity_.class)
public class questionEntity_ {
    public static volatile SingularAttribute<questionEntity_, Integer> idQuestion;
    public static volatile SingularAttribute<questionEntity_, Integer> idCourses;
    public static volatile SingularAttribute<questionEntity_, String> responseList;
}
