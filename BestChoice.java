import java.util.Scanner;

public class BestChoice
{
   public static void main(String[] args)
   {
      double dataUsage;
      double planSTotal = 35.0;
      double planMTotal = 50.0;
      double planLTotal = 70.0;
      
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Please input your estimated data usage per month: ");
      dataUsage = kb.nextDouble();
      
      if(dataUsage > 2)
         planSTotal = planSTotal + (15 * (dataUsage - 2));
      if(dataUsage > 4)   
         planMTotal = planMTotal + (15 * (dataUsage - 4));
      if(dataUsage > 8)
         planLTotal = planLTotal + (15 * (dataUsage - 8));   
      
      System.out.println("If you choose Plan S, you need to pay: " + planSTotal);
      System.out.println("If you choose Plan M, you need to pay: " + planMTotal);
      System.out.println("If you choose Plan L, you need to pay: " + planLTotal);
      
      if(planSTotal > planMTotal)
      {
         if(planMTotal > planLTotal)
            System.out.print("Best Choice: Plan L");
         else
            System.out.print("Best Choice: Plan M");
      }
      else if(planLTotal < planSTotal)
         System.out.print("Best Choice: Plan L");
      else   
         System.out.print("Best Choice: Plan S");                        
   }
}   