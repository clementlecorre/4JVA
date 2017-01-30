/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courses.controller;

import com.courses.services.QuestionsServices;
import com.courses.services.AnswersServices;
import com.courses.services.ViewsServices;
import com.courses.entity.Question;
import com.courses.entity.Answers;
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
    private QuestionsServices qm;
    @EJB
    private AnswersServices am;
    @EJB
    private ViewsServices vm;
    private List<Question> questionList;
    private String[] answerUser;
    private List<String[]> listAnswerUser = new ArrayList<String[]>();
    private int coursesId = 0;

    public String[] getAnswerUser() {
        return answerUser;
    }

    public void setAnswerUser(String[] answerUser) {
        this.answerUser = answerUser;
        this.listAnswerUser.add(answerUser);
    }

    public List<String[]> getListAnswerUser() {
        this.listAnswerUser.removeAll(listAnswerUser);
        return listAnswerUser;
    }

    public void setListAnswerUser(List<String[]> listAnswerUser) {
        this.listAnswerUser = listAnswerUser;
    }

    /**
     * Creates a new instance of QuizController
     */
    public QuizController() {
    }

    public void loadingQuestions() {
        questionList = this.qm.getQuestionListByCoursesId(this.coursesId);
    }

    public List<String> loadingAnswers(int idQuesion) {
        List<Answers> answerList = this.am.getAnswersListByQuestionId(idQuesion);
        List<String> answer = new ArrayList<String>();
        for (Answers r : answerList) {
            answer.add(r.getAnswerText());
        }
        return answer;
    }

    public String checkAnswer(int idQuesion) {
        int cpt = 0, nbValid = 0;      
        
        // Get all Question for courses
        for(Question question : questionList){
            
            // Get all Answer for One question
            List<Answers> answers = this.am.getAnswersListByQuestionId(question.getIdQuestion());
            
            //For each answer for one question
            for(Answers answer : answers){
                int nbTrue = 0, nbFalse = 0, trueFound = 0; 
                
                for(Answers a : answers){
                    if(a.getIsTrue()){
                        trueFound++;
                    }
                }

                // If lenght < 0 no user answer
                if(listAnswerUser.get(cpt).length > 0){
                    
                    // For all user answers for question(cpt)
                    for(String an : listAnswerUser.get(cpt)){
                        
                        if(an.equals(answer.getAnswerText())){
                            if(answer.getIsTrue()){
                                nbTrue++;
                            }else{
                                nbFalse++;
                            }
                            
                        }
                    }
                    if(nbTrue == trueFound && nbFalse == 0){
                        nbValid++;
                    }
                }
            }
            cpt++;
        }
        

        Date date = new Date();
        Timestamp tt = new Timestamp(date.getTime());
        if(nbValid > 0){
            int percent = (nbValid * 100) / cpt;
            vm.updateQuiz(this.coursesId, tt, percent );
            this.listAnswerUser.clear();
            if (percent >= 80) {
                //setting rank
                return "Congratulation" + percent + "%";
            } else {
                return "No correct :( you have " + percent + "%";
            }
        }else{
            return "How you cannot have better than 0 ?";
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
