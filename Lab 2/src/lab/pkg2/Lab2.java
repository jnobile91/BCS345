
package lab.pkg2;

import java.util.Scanner; 

public class Lab2 { 

     public static void 
      main(String[] args) { 

      Scanner input =  new Scanner(System.in); 

     // compute the circumference of a shape 

     // See sample output 

      System.out.println( 
     "I can compute the circumference of one of the followings: Rect, Square, or Triangle " 
     ); 
    
      System.out.print( 
     "Enter a shape: " 
     ); 

     String shape = input.nextLine().trim(); 
    
     int circum = 0; 
    
     int side1, side2, side3; 
    
     // Your code here
     if (shape.equalsIgnoreCase("rectangle"))
     {
         System.out.println("Enter length of side 1: ");
         side1 = input.nextInt();
         System.out.println("Enter length of side 2: ");
         side2 = input.nextInt();
         circum = (side1 * 2) + (side2 * 2);
     }
     else if (shape.equalsIgnoreCase("square"))
     {
         System.out.println("Enter length of side: ");
         side1 = input.nextInt();
         circum = (side1 * 4);
     }
     else if (shape.equalsIgnoreCase("triangle"))
     {
         System.out.println("Enter length of side 1: ");
         side1 = input.nextInt();
         System.out.println("Enter length of side 2: ");
         side2 = input.nextInt();
         System.out.println("Enter length of side 3: ");
         side3 = input.nextInt();
         circum = (side1 + side2 + side3);
     }
     else
     {
         System.out.println("Not a valid shape.");
     }
       
     // End of your code
     
      System.out.println( 
     "The circumference is : " 
      + circum); 
    

      input.close(); 
      } 
     }
