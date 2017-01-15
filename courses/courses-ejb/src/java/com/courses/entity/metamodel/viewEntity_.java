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
@StaticMetamodel(viewEntity_.class)
public class viewEntity_ {
    public static volatile SingularAttribute<viewEntity_, Integer> dateView;
    public static volatile SingularAttribute<viewEntity_, Integer> percent;
}
