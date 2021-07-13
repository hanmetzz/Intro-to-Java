import java.util.*;
import java.io.*;

public class MessageMapping{
   public static void main(String[] args){
      try{
         File f = new File("/Users/Hannah/Documents/messages.txt");
         
         Scanner inputFile = new Scanner(f);
         String lines[] = new String[20];
         String words[] = new String[100];
         String words2[] = new String [20];
         
         String line;
         int x = 0;
         int nextIndex = 0;
         
         while(x < 20) {
            line = (inputFile.nextLine());
            lines[x] = line;
            x++;
            
            StringTokenizer str = new StringTokenizer(line);
            int tokNum = str.countTokens();
            
            boolean contains = false;
               
               
               for(int j = 0 ; j < tokNum ; j++) {
               
                  String token = str.nextToken();
                  
                  for(int b = 0; b < 45; b++) {
                     if(words[b] == token) {
                  
                        words2[x] = words2[x] + j;
                        contains = true;
                     }
                  }
                  if(contains == false) {
                     words[nextIndex] = token;
                     words2[x] = words2[x] + nextIndex;
                     nextIndex++;
                  }
               
                              
            }
       
            
      }
       Scanner kb = new Scanner(System.in);
           
       System.out.println("Which line would you like to read? ");
       int lineNum = kb.nextInt();
       
       int length = words2[lineNum].length();
       
       for(int k = 0; k < length;k++) {
       
         char position = words2[lineNum].charAt(k);
         
         int a = Character.getNumericValue(position);
         
         System.out.print(words[a]);
       
       }
      }
      catch(FileNotFoundException ex){
         System.out.print("Error");
      }
      
      
      
      
    
      
      
   }
}