/* Hannah Metzler
   CSC142 Java II */

import java.util.Scanner;

public class DataAnalysis
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      double testScore = 0;
      double maxValue = 0;
      double minValue = 100;
      int loopCount = 0;
      double average = 0;
      
      while(testScore != -1)
      {
         
         loopCount ++;
         System.out.print("Input a Score: ");
         testScore = kb.nextDouble();
         
         if(testScore == -1)
            loopCount--;
         else   
         {
            if(testScore > maxValue)
               maxValue = testScore;
            if(testScore < minValue)
               minValue = testScore; 
         
            average = average + testScore;
          }     
      }
      average = average / loopCount;
      
      System.out.println("Average: " + average);
      System.out.println("Highest Score: " + maxValue);
      System.out.println("Lowest Score: " + minValue);  
   }
}   
