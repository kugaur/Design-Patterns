package com.designpatterns.bridge;

/**
 * Bridge Pattern Demo Class
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        QuestionFormat questions = new QuestionFormat("Java programming");
        questions.setQuestion(new JavaQuestions());

        questions.delete("What is Class?");
        questions.display();
        questions.newOne("What is inheritance?");
        questions.displayAll();
    }
}
