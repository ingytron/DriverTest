// package DriverExam
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 A driver test sim by Ingrid Molloy
 I ran out of time on this one and the loop isn't working and neither is variable passing 

 */

public class DriverExam {
	
	// An array field to hold correct answers   
	public char[] quizAnswers = {
			'b', 'd', 'a', 'a', 'c', 'a', 'b', 'a', 'c', 'd', 'b', 'c', 
			'd', 'a', 'd', 'c', 'c', 'b', 'd', 'a'
			};

	// An array field to hold incorrect answers
    int[] missedQuestions; 
    // A boolean value to say whether or not the student passed
	boolean passed;
    // totalIncorrect: The total number of incorrectly answered questions
    int totalIncorrect = 0;
	// totalCorrect: The total number of correctly answered questions
    int totalCorrect = 0;
	
    public DriverExam(char[] answers) {
	    // this.answers = answers; // this doesn't seem to be working...

	} // ends constructor
	
    
    //////////////////////////  Evaluate supplied answers  //////////////////////////////

    // questionsMissed - A method which returns an int array containing incorrect answers
    public int[] questionsMissed() { // removed arg
    // public int[] questionsMissed(char[] answers) {
    // for (char i = 0; i <= answers.length; i++) {      	
       
        /* Not compiling when I keep the loop in there
		for (char i : answers) {	    	
	    	if (answers[i].equals(quizAnswers[i])) { 
	    	// if (answers(i).equals(quizAnswers(i))) { 
		    	continue;
		    	}
		    else {
		    	// push to array of incorrect 
		    	missedQuestions.add(i);
		    	}
	    	} // ends for loop */
	       	
	    // returning array missedQuestions
	    return missedQuestions;
    	
    } // ends questionsMissed class
     
    public int totalCorrect() { // removed arg
    // public int totalCorrect(int[] missedQuestions) {

	    if (missedQuestions == null){
	        totalCorrect = 20;
	    } else {
	    	totalCorrect = 20 - (missedQuestions.length);
	    
	    }
	return totalCorrect;
    }
    
    public int totalIncorrect() { // removed arg
    // public int totalIncorrect(int[] missedQuestions) {
	    if (missedQuestions == null){
	        totalIncorrect = 0;
	    } else {
	    	totalIncorrect = missedQuestions.length;
	    
	    }
	return totalIncorrect;
    }
    
    public boolean passed(){ // removed arg
    // public boolean passed(int totalCorrect){
    	passed = totalCorrect >= 10 ? true : false;
    	return passed;
    	
    }

} // ends DriverExam class


