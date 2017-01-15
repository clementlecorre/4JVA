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
@StaticMetamodel(coursesEntity_.class)
public class coursesEntity_ {
    public static volatile SingularAttribute<coursesEntity_, Integer> idCourses;
    public static volatile SingularAttribute<coursesEntity_, String> label;
    public static volatile SingularAttribute<coursesEntity_, Float> rank;
    public static volatile SingularAttribute<coursesEntity_, String> details;
}
