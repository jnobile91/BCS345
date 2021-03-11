package labprogram;

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      String userInput = scan.nextLine();
      while(!userInput.equals("done") && !userInput.equals("Done") && !userInput.equals("d") && !userInput.equals("D"))
      {
         char input[] = userInput.toCharArray();
         char[] inputReverse = new char[input.length];
      
         int j = 0;
         
         for (int i = (input.length - 1); i >= 0; i--)
         {
    
            inputReverse[j] = input[i];
            j++;
         }
         
         for (int i = 0; i < (inputReverse.length); i++)
         {
            System.out.print(inputReverse[i]);  
         }
         System.out.println();
         
         userInput = scan.nextLine();      }             
   }
}
