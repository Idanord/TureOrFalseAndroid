package com.example.will.trueorfalseandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends Activity {

    public TextView gameQuestions;
    public Button falseButton, trueButton;

    //calling from questions.java
    Questions mQuestions;
    int questionsLength;

    //array list from Item
    ArrayList<Item> questionsList;

    //set current question value
    int currentQuestion = 0;
    boolean winner = false;
    boolean lose = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameQuestions = (TextView) findViewById(R.id.gameQuestions);
        falseButton = (Button) findViewById(R.id.falseButton);
        trueButton = (Button) findViewById(R.id.trueButton);

        mQuestions = new Questions();
        questionsLength = mQuestions.myQuestions.length;

        questionsList = new ArrayList<>();

        //save all the questions in the list
        for(int i = 0; i < questionsLength; i++){
            questionsList.add(new Item(mQuestions.getQuestions(i), mQuestions.getAnswers(i)));
        }

        //shuffle the questions
        Collections.shuffle(questionsList);

        //start the game
        setQuetion(currentQuestion);

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkQuestion(currentQuestion)){
                    //correct - the game continues
                    currentQuestion++;
                    if(currentQuestion < questionsLength){
                        setQuetion(currentQuestion);
                    } else {
                        //game over - winner
                        winner = true;
                        endGame();
                    }
                } else {
                    //wrong = the game ends
                    lose = true;
                    endGame();
                }
            }
        });

        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkQuestion(currentQuestion)){
                    //correct - the game continues
                    currentQuestion++;
                    if(currentQuestion < questionsLength){
                        setQuetion(currentQuestion);
                    } else {
                        //game over - winner
                        winner = true;
                        endGame();
                    }
                } else {
                    //wrong = the game ends
                    lose = true;
                    endGame();
                }
            }
        });
    }

    //show questions on the screen
    private void setQuetion(int number){
        gameQuestions.setText(questionsList.get(number).getQuestion());
    }

    //check if the answer is right
    private boolean checkQuestion(int number){
        String answer = questionsList.get(number).getAnswer();
        return answer.equals("True");
    }

    //game over
    private void endGame(){
        if(winner){
            Toast.makeText(this, "Game Over! You Win!", Toast.LENGTH_SHORT).show();
            //finish();
        } else {
            Toast.makeText(this, "Game Over! You Lose!", Toast.LENGTH_SHORT).show();
            //finish();
        }
    }
}
