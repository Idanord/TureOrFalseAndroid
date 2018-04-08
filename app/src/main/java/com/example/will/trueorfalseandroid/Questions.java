package com.example.will.trueorfalseandroid;

/**
 * Created by Will on 4/8/2018.
 */

public class Questions {

    public String myQuestions[] = {
            "Resident Evil started out as a first person shooter?",
            "Resident Evil Director's cut's opening scene was more violent than the " +
                    "original American release?",
            "Resident Evil is known in Japan as Biohazard?",
            "There was originally a cyborg designed for the original Resident Evil?",
            "Resident Evil was based off another game called Alone in the Dark?"
    };

    public String myAnswers[] = {
            "True, Resident Evil was set out to be a first person game. Though due to the" +
                    "limitations of the Playstation hardware at the time this idea was scrapped.",
            "False, the Director's cut of Resident Evil had the same opening as the " +
                    "original American release due to a translation error.",
            "True, in Japan Biohazard is the name of the Resident Evil franchise. It was" +
                    "changed in America because it was going to be had for Capcom to register the" +
                    "Biohazard name in the US.",
            "True, before we got the Resident Evil that we all know. There was a cyborg character" +
                    "in concept for the game by the name of Gelzer.",
            "False, Resident Evil was not based off of Alone in the Dark. The game was based off" +
                    "a game that was released in 1989 called Sweet Home. Though the fixed camera" +
                    "angles were based off Alone in the Dark."
    };

    public String getQuestions(int number){
        return myQuestions[number];
    }

    public String getAnswers(int number){
        return myAnswers[number];
    }
}
