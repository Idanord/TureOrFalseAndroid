package com.example.will.trueorfalseandroid;

/**
 * Created by Will on 4/8/2018.
 */

public class Item {

    private String question, answer;

    public Item(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
