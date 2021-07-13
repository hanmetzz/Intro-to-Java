/*
   CSC 142-002
   Date Submitted: 9/5/17
   Lab 1
   Hannah Metzler
*/
import java.util.Scanner;
public class Week1_GC
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      int total = 0;
      int high = 100;
      int low = 0;
      int score = 0;
      int i = 0;
      int currentLow = 100;
      int currentHigh = 0;
      double average;
      boolean b;
      String letterGrade;
      
      //input name
      System.out.print("Enter your name: ");
      String name = kb.nextLine();
      
      //input grades
      while(i <= 20)
         {
            
            System.out.print("Enter a test score: ");
            score = kb.nextInt();   
           
            
            //gradeValidation
            b = ValidateGrade(low, high, score);
            
               if(b == true)
                  {
                     total = total + score;
                     i++;
                  }   
               else
               {
                  i--;
                  System.out.println("Error. Enter A New Number.");
               }  
               
               //highs and lows
            if(score < currentLow)
               currentLow = score;
            else if(score > currentHigh)
               currentHigh = score;    
            
         }
      
      //calculate average   
      average = total / i;
      
      //calculate letter grade
      if(average >= 93)
         letterGrade = "A";
      else if(average < 93 && average >= 90)
         letterGrade = "A-";
      else if(average < 90 && average >= 87)
         letterGrade = "B+";
      else if(average < 87 && average >= 83)
         letterGrade = "B";
      else if(average < 83 && average >= 80)
         letterGrade = "B-";
      else if(average < 80 && average >= 77)
         letterGrade = "C+"; 
      else if(average < 77 && average >= 73)
         letterGrade = "C";
      else if(average < 73 && average >= 70)
         letterGrade = "C-";
      else if(average < 70 && average >= 67)
         letterGrade = "D+";
      else if(average < 67 && average >= 63)
         letterGrade = "D";
      else if(average < 63 && average >= 60)
         letterGrade = "D-";
      else
         letterGrade = "F";                                       
      
      //output calculations   
      System.out.println("Name: " + name + "\nAverage Test Score: " + average);
      System.out.println("Letter Grade: " + letterGrade);
      System.out.println("Grade High: " + currentHigh);
      System.out.println("Grade Low: " + currentLow);
      System.out.println("Number of Grades Entered: " + i);       
            
   } //ends main
   
   public static boolean ValidateGrade(int lowLimit,int highLimit,int inValue)
      {
         if(inValue >= lowLimit && inValue <= highLimit)
            return true;
         else
            return false;   
      } //ends ValidateGrade
      
}//ends class  


// input name
// loop and get 10 test scores
// validate the input
// calculate highest average and lowest
// output the name and the calculations