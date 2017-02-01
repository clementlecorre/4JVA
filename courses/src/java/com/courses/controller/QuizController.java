/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.controller;

import com.courses.criteria.QuestionManagement;
import com.courses.criteria.ResponsesManagement;
import com.courses.criteria.ViewManagement;
import com.courses.entity.Question;
import com.courses.entity.Responses;
import com.courses.entity.View;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author clement
 */
@ManagedBean
@SessionScoped
public class QuizController {

    @EJB
    private QuestionManagement qm;
    @EJB
    private ResponsesManagement rm;
    @EJB
    private ViewManagement vm;
    private List<Question> questionList;
    private String[] responseUser;
    private List<String[]> listResponseUser = new ArrayList<String[]>();
    private int coursesId = 0;

    public String[] getResponseUser() {
        return responseUser;
    }

    public void setResponseUser(String[] responseUser) {
        this.responseUser = responseUser;
        this.listResponseUser.add(responseUser);
    }

    public List<String[]> getListResponseUser() {
        this.listResponseUser.removeAll(listResponseUser);
        return listResponseUser;
    }

    public void setListResponseUser(List<String[]> listResponseUser) {
        this.listResponseUser = listResponseUser;
    }

    /**
     * Creates a new instance of QuizController
     */
    public QuizController() {
    }

    public void loadingQuestions() {
        questionList = this.qm.getQuestionListByCoursesId(this.coursesId);
    }

    public List<String> loadingResponses(int idQuesion) {
        List<Responses> responseList = this.rm.getResponsesListByQuestionId(idQuesion);
        List<String> response = new ArrayList<String>();
        for (Responses r : responseList) {
            response.add(r.getResponseText());
        }
        return response;
    }

    public String checkReponse(int idQuesion) {
        int NbValidate = 0, responsesTrue = 0;
        List<Responses> responseList = null;
        for (Question question : questionList) {
            responseList = this.rm.getResponsesListByQuestionId(question.getIdCourses());
            for (Responses responses : responseList) {
                if (responses.getIsTrue()) {
                            responsesTrue++;
                }
                for (String[] responseForQuestion : listResponseUser) {
                    for (String string : responseForQuestion) {
                        if (responses.getResponseText().equals(string)) {
                            if (responses.getIsTrue()) {
                                NbValidate++;
                            } 
                        }
                    }
                }
            }
        }
        Date date = new Date();
        Timestamp tt = new Timestamp(date.getTime());
        vm.updateQuiz(this.coursesId, tt, (NbValidate * 100) / responsesTrue );
        if (responsesTrue == NbValidate) {
            //setting rank
            return "Congratulation";
        } else {
            return "No correct :( you have " + (NbValidate * 100) / responsesTrue + "%";
        }
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public int getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(int coursesId) {
        this.coursesId = coursesId;
    }
}
