package com.designpatterns.bridge;

/**
 * Question Interface
 */
public interface Question {

    /**
     * Method to get next question.
     * 
     * @return Next Question
     */
    String nextQuestion();

    /**
     * Method to get previous question.
     * 
     * @return Previous Question
     */
    String previousQuestion();

    /**
     * Method to add a new question.
     * 
     * @param question Question
     */
    void newQuestion(String question);

    /**
     * Method to delete a question.
     * 
     * @param question Question
     */
    void deleteQuestion(String question);

    /**
     * Method to display current question.
     */
    void displayQuestion();

    /**
     * Method to display all questions.
     */
    void displayAllQuestions();
}
