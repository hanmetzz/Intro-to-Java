/*
   Hannah Metzler
   CSC242
   Week 9: Simulate Gates
*/

public class Week9_SimulatedGates
{
   public static void main(String[] args)
   {
      boolean x = true;
      boolean y = true;
      boolean z = true;
      
      
      PrintTable();
      
      PrintRow(!x,!y,!z);
      PrintRow(!x,!y,z);
      PrintRow(!x,y,!z);
      PrintRow(!x,y,z);
      PrintRow(x,!y,!z);
      PrintRow(x,!y,z);
      PrintRow(x,y,!z);
      PrintRow(x,y,z);
      
      
   }
   public static void PrintTable()
   {
      System.out.println("---------------------------------------------");
      System.out.println("| x | y | z | and A | Xor B | Xor C | and D |");
      System.out.println("|---|---|---|-------|-------|-------|-------|");

   }
   public static void PrintRow(boolean x, boolean y, boolean z)
   {
      boolean andA = (x&&z);
      boolean xorB = (andA ^ !y);
      boolean xorC = (!y ^ xorB);
      boolean andD = (xorC && !x);
      
      int intX = (x) ? 1:0;
      int intY = (y) ? 1:0;
      int intZ = (z) ? 1:0;
      
      int a = (andA) ? 1:0;
      int b = (xorB) ? 1:0;
      int c = (xorC) ? 1:0;
      int d = (andD) ? 1:0;
      
      System.out.println("| "+intX+" | "+intY+" | " +intZ+ " |  " +a+ "    |   " +b+ "   |   " +c+ "   |   " +d+ "   | ");
   }
}