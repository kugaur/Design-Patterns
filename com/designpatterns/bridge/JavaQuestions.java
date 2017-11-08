package com.designpatterns.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for Java Questions
 */
public class JavaQuestions implements Question {

    private List<String> questions = new ArrayList<String>();
    private int current = 0;

    public JavaQuestions() {
        questions.add("What is class?");
        questions.add("What is an interface?");
    }

    @Override
    public String nextQuestion() {
        if (current <= questions.size() - 1) {
            return questions.get(++current);
        }
        return null;
    }

    @Override
    public String previousQuestion() {
        if (current > 0) {
            return questions.get(--current);
        }
        return null;
    }

    @Override
    public void newQuestion(String question) {
        questions.add(question);
    }

    @Override
    public void deleteQuestion(String question) {
        if (questions.contains(question)) {
            questions.remove(question);
        }
    }

    @Override
    public void displayQuestion() {
        System.out.println(questions.get(current));
    }

    @Override
    public void displayAllQuestions() {
        System.out.println(questions.toString());
    }

}
