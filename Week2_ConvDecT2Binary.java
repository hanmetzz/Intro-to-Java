/*
   Hannah Metzler
   CSC242-01
   Week 2
   Importing a decimal number from user and converting and outputting binary
*/

import java.util.Scanner;
public class Week2_ConvDecT2Binary
{
    public static void main(String[] args) 
    {
      Scanner kb = new Scanner(System.in);
      
      int count = 8;
      int decNumber;
      int binaryNumber;
      int temp;
      int n = 8;
      
      int[] array = new int[8];
      
      System.out.print("Enter a decimal number from 0-2000000: ");
      decNumber = kb.nextInt();
      
      while(decNumber < 0 || decNumber > 2000000)
      {
         System.out.print("Enter a valid number: ");
         decNumber = kb.nextInt();
      }
      
      System.out.println("Decimal Number: " + decNumber);
      
      for(int i =0; decNumber > 0; i++)
      {
         array[i] = decNumber % 2;
         decNumber = decNumber / 2;
      }
      
      for(int i = 0; i < n / 2; i++)
      {
         temp = array[i];
         array[i] = array[n-1-i];
         array[n-1-i] = temp;
      }
      
      System.out.print("Binary Number: ");
      for(int i = 0; i < n; i++)
         System.out.print(array[i]); 
     
   
    } //ends main
}  //ends class