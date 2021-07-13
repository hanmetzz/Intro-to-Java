import java.util.Scanner;

public class SuperMario
{
   public static void main(String[] args)
   {
      int HP;
      
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Enter HP Value: ");
      HP = kb.nextInt();
      
      HP = HP + 2;
      HP--;
      HP = HP * 2;
      HP++;
      
      System.out.print("Your Current HP: " + HP);   
   }
}