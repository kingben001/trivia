package com.company;

import java.util.Scanner;
import java.util.Scanner;
class Trivia {

    //Instance variables

    private String question; //trivia question

    private String answer; //trivia question answer

    //Accessor and mutator methods

    public String getQuestion() {

        return question;

    }

    public void setQuestion(String question) {

        this.question = question;

    }

    public String getAnswer() {

        return answer;

    }

    public void setAnswer(String answer) {

        this.answer = answer;

    }

}




class TriviaDriver {

    public static void main(String[] args) {

        //variables

        Trivia triviaProblem1 = new Trivia();

        Trivia triviaProblem2 = new Trivia();

        Scanner keyboard = new Scanner(System.in);

        String userAnswer1;

        String userAnswer2;

        //set instance variables

        triviaProblem1.setQuestion("What year was Abraham Lincoln inaugareted to office?");

        triviaProblem1.setAnswer("1861");

        triviaProblem2.setQuestion("What is the capital of New York?");

        triviaProblem2.setAnswer("Albany");

        //prompt for user input for the answer of problem 1

        System.out.println(triviaProblem1.getQuestion());

        userAnswer1 = keyboard.nextLine();

        //check and display whether user's answer was correct

        if (userAnswer1.equalsIgnoreCase(triviaProblem1.getAnswer())) {

            System.out.println("You are correct!");

        }

        else {

            System.out.println("You are incorrect");

        }

        //prompt for user input for the answer of problem 2

        System.out.println(triviaProblem2.getQuestion());

        userAnswer2 = keyboard.nextLine();

        //check and display whether user's answer was correct

        if (userAnswer2.equalsIgnoreCase(triviaProblem2.getAnswer())) {

            System.out.println("You are correct!");

        }

        else {

            System.out.println("You are incorrect");

        }

    }

}