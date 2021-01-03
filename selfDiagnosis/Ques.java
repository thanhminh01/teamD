package com.company.SCSSelfDiagnosis;

import java.util.ArrayList;

public class Ques {
    private String question;
    private ArrayList<String> choices;

    public Ques(String question, String[] choices){
        this.question = question;
        this.choices = new ArrayList<String>();
        //Add choice into list of choices
        for (int i = 0; i < choices.length; i++){
            this.choices.add(choices[i]);
        }
    }
    public String getQuestion(){
        return question;
    }
    public ArrayList<String> getChoices(){
        return choices;
    }
}
