import java.util.Scanner;

public class InternetSlang
{
   public static void main(String[] args)
   {
      String slang;
      
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Please input your online slang: ");
      slang = kb.nextLine();
      
      char firstChar = slang.charAt(0);
      
      switch(firstChar)
      {
         case 'a': 
            System.out.print("Ask Me Anything");
            break;
         case 'I':
            System.out.print("In My Opinion");
            break;
         case 'N':
            System.out.print("Not Safe For Work");
            break;
         case'T':
            System.out.print("Too Long; Didn't Read");
            break;
         case 'y':
            System.out.print("Your Mileage May Vary");
            break;
         case 'l':
            System.out.print("Laugh out Loud");
            break;
      }  //end switch                        
   }  //end main
}   //end class