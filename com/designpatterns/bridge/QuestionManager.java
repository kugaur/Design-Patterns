package com.designpatterns.bridge;

/**
 * QuestionManager Class
 */
public class QuestionManager {

    private Question question;

    private String catalog;

    public QuestionManager(String catalog) {
        this.catalog = catalog;
    }

    public String next() {
        return question.nextQuestion();
    }

    public String previous() {
        return question.previousQuestion();
    }

    public void newOne(String quest) {
        question.newQuestion(quest);
    }

    public void delete(String quest) {
        question.deleteQuestion(quest);
    }

    public void display() {
        question.displayQuestion();
    }

    public void displayAll() {
        System.out.println("Question Paper: " + catalog);
        question.displayAllQuestions();
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
    
    public Question getQuestion() {
        return this.question;
    }
}
