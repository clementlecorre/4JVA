/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.controller;

import com.courses.criteria.QuestionManagement;
import com.courses.entity.Question;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.json.JsonObject;
import jdk.nashorn.internal.objects.Global;
import jdk.nashorn.internal.parser.JSONParser;

/**
 *
 * @author clement
 */
@ManagedBean
public class QuizController {

    @EJB
    private QuestionManagement qm;
    private List<Question> q;
    private JsonObject questions;
    private int coursesId;
    JSONParser parser;
    
    /**
     * Creates a new instance of QuizController
     */
    public QuizController() {
    }
    
    public void loadingQuestions() {
        q = this.qm.getQuestionListByCoursesId(this.coursesId);    
        stringToJson("{ \"description\": \"faire sa\", \"questions\": [  [\"coucou\", \"0\"],  [\"coucou\", \"1\"] ]}");
    }

    public List<Question> getQ() {
        return q;
    }

    public void setQ(List<Question> q) {
        this.q = q;
    }

    public int getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(int coursesId) {
        this.coursesId = coursesId;
    }
    public void stringToJson(String jsonString) {
        this.parser = new JSONParser(jsonString, Global.instance(), true);
        this.questions = (JsonObject) this.parser.parse();
    }
}
