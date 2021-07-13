import java.util.*;
public class MonthDays
{
   public MonthDays()
   {
      int month;
      int year;   
   }
   public static void main(String[] args)
   {
      new MonthDays();
      
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Enter a month (1-12): ");
      int month = kb.nextInt();
      
      System.out.print("Enter a year: ");
      int year = kb.nextInt();
      
      System.out.println(getNumberOfDays(month, year));
   }
   public static String getNumberOfDays(int month, int year)
   {
      boolean leapYear;
      
      if(month == 2)
      {
         if(year % 100 == 0)
         {
            if(year % 400 == 0)
               leapYear = true;
            else
               leapYear = false;
         }
         else
         {
            if(year % 4 == 0)
               leapYear = true;
            else
               leapYear = false;
         }
         
         if(leapYear == true)
            return("29 days");
         else
            return("28 days");
         
      }
      else if(month == 4 || month == 6 || month == 9 || month == 11)
      {
         return("30 days");
      }
      else
      {
         return("31 days");
      }
      
         
   }
}