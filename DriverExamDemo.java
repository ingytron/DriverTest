/**
   DriverExamDemo program
   COSC120 T2-2016
*/
import java.util.Scanner;

public class DriverExamDemo
{
   public static void main(String[] args) 
   {
      String input;                             // To hold keyboard input
      final int NUM_ANSWERS = 20;               // Number of answers
      char[] answers = new char[NUM_ANSWERS];   // Array to hold answers
      int[] missedQuestions;                    // Array to hold missed questions

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the user's answers to the questions.
      System.out.println("Enter your answers to the " +
                         "exam questions."); 
      for (int i = 0; i < answers.length; i++)
      {
         System.out.print("Question " + (i + 1) + ": ");
         input = keyboard.nextLine();
         answers[i] = input.charAt(0);
         
         // Validate the answer.
         while (!valid(answers[i]))
         {
            System.out.println("ERROR: Valid answers are " +
                               "a, b, c, or d.");
            System.out.print("Question " + (i + 1) + ": ");
            input = keyboard.nextLine();
            answers[i] = input.charAt(0);
         }
      }
      
      // Create a DriverExam object.
      DriverExam exam = new DriverExam(answers);
      
      // Get an array of the missed question numbers.
      missedQuestions = exam.questionsMissed();
      
      // Display a report.
      System.out.println("Correct answers: " + exam.totalCorrect());
      System.out.println("Incorrect answers: " + exam.totalIncorrect());
      
      if (exam.passed())
         System.out.println("You passed the exam.");
      else
         System.out.println("You failed the exam.");
      
      if (missedQuestions != null)
      {
         System.out.println("You missed the following questions:");
         for (int i = 0; i < missedQuestions.length; i++)
            System.out.print(missedQuestions[i] + " ");
      }
      System.out.println(" ");

   }
   
   /**
      The valid method validates a character as an
      answer for the test.
      @param c The character to validate.
      @return true if the argument is a, b, c, or d.
              false otherwise.
   */
   
   public static boolean valid(char c)
   {
      boolean status;
      
      if (c == 'a' || c == 'b' || c == 'c' || c == 'd')
         status = true;
      else
         status = false;
      
      return status;
   }
}
