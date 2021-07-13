
import java.util.Scanner;
import java.util.Arrays;

public class Week6_UnscrambleCode
   {
      public static void main(String[] args) 
      {
         boolean itWorked;
         int idx=0; 
         int option = 1;
         final static String NULL_STRING = "NULL";
         final static char PRINTABLE_NULL_CHAR = '+';
         final static int MAX_STUDENTS = 100;
         
         static String INIT_DATA[] = {"Frank", "Erica", "Bubba", "BFrey", "Evan", "B-Lu", "Linney" };
         static String[] studentNames = new String[MAX_STUDENTS];
   
         String  s1;Scanner scan = new Scanner(System.in);
         InitArray();
         System.out.println("----- Initial Array -----");
         PrintTheArray();

         while ((option >= 1) && (option <= 3))
         {
            System.out.println("  SIMULATE ARRAYLIST METHODS");
            System.out.println("  --------------------------");
            System.out.println("  1. Preform remove()");
            System.out.println("  2. Perform add()");System.out.println("  3. IndexOf()");
            System.out.print   ("    Make a selection: ");
            option=scan.nextInt();
            
            if(option==2)
            {
               System.out.print ("Enter Name want to add to the list : ");
               s1=scan.next ();
               System.out.print ("Enter the index number from to place the name: ");
               idx=scan.nextInt();
               add(idx, s1);
               System.out.println("After add() method, array = ");
               PrintTheArray(); 
             }
             else if (option == 1)
             {//-- Testing the remove() method.
               System.out.print   ("What index number to remove (0-9): ");
               idx=scan.nextInt();itWorked=remove(idx);
               System.out.println("After REMOVE(), status returned = " + itWorked);
               PrintTheArray();
             }
             else if (option == 3)
             {
               System.out.print ("Enter the string searching for in the array: ");
               s1 = scan.next();
               idx = indexOf (s1);
               System.out.println("After add() method, array = ");
               PrintTheArray();
             } //ends else if
           }   //ends while
        }   //ends main
   private static void InitArray()
   {
      int i=0,numNames; 
      numNames = INIT_DATA.length;
      
      for (i = 0; i < MAX_STUDENTS; i++)
         if (i < numNames)studentNames[i] = INIT_DATA[i];
      else studentNames[i] = NULL_STRING;
      return;
   }  //ends init array
   private static int ArraySize()
   {
      int aSize = 0;
   
      while ((studentNames[aSize] != NULL_STRING) && (aSize < MAX_STUDENTS))
         aSize++;return aSize;
   }  //ends arraysize
   private static void add (int idxNum, String inStr)
   {
      int i, arrayLen;
      arrayLen = ArraySize();
      if ((idxNum >= arrayLen) || (idxNum < 0))
         idxNum = arrayLen;
      for (i = arrayLen; i > idxNum; i--)
         studentNames[i] = studentNames[i-1];
      studentNames[idxNum] = inStr;
      return;
   }  //ends add
   private static boolean remove (int idxNum)
   {
      boolean removeWorked = false;
      int idx = 0;
      int numEntries = 0;
      System.out.println ("Test remove() method.");
      numEntries = ArraySize();
      
      if ((idxNum >= 0) && (idxNum < numEntries))    
      {
         for (int i = idxNum; i < (numEntries-1); i++)
         {   
            studentNames[i] = studentNames[i+1];
            studentNames[numEntries-1] = NULL_STRING;
            removeWorked = true;
         }
         return removeWorked;
      }  //ends remove
   private static int indexOf (String searchStr)
   {
    int returnIdx = -1;;
    
    return returnIdx;
   }  //ends indexof

//-------------------------------------------------------------------
private static void PrintTheArray()
    { 
    int nullCounter = 0;
    int i; 
    
    //-- Loop thru entire array.
    for (i = 0; i < MAX_STUDENTS; i++) 
        if (studentNames[i] != NULL_STRING)
            {
            if (nullCounter > 0)
                {
                System.out.print (" (" + nullCounter + "), ");
                nullCounter = 0;
                }
            System.out.print (studentNames[i] + ", ");
            }
        else
            nullCounter++;  // number of blank array elements at end or array.
            
    //-- Instead of printing out all of the null chars, count them and
    //-- display a number of nulls
    if (nullCounter > 0)
        System.out.print (" [" + nullCounter + "]" + NULL_STRING + "s");
    System.out.printf(""); 
    }
    
}   // end-class
    
