package week3loopsmethodsdemo;

import java.util.Scanner;

public class Week3LoopsMethodsDemo {
    
    public static boolean chckPrm(int a)
        {
            for(int i = 2; i < a; i++)
            {
                if (a % i == 0)
                    return false;
            }
            return true;
        }

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Is 15 prime? " + chckPrm(15));
        System.out.println("Is 11 prime? " + chckPrm(11));
        System.out.println("Is 7 prime? " + chckPrm(7));
        
        // Find the sum of all prime numbers from 2 to n. Ask the user for n.
        System.out.println("Please enter a value for n: ");
        int n = scn.nextInt();
        int sum = 0;
        
        for (int i = 2; i <= n; i++)
        {
            if (chckPrm(i))
                sum = sum + i;
        }
        
        System.out.println("The sum of all prime numbers to n is: " + sum);


        
        /*
        int n = 5;
        
        while (n<=15)
        {
            n++;
            System.out.println(n);
        }
        */
        
        /* //Creates a square using a for loop within a for loop
        for (int i = 1; i < n; i++)
        {
            for (int col = 0; col < n; col++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        */
        
        /*
        for (int i = 0; i < n; i++)
        {
            
            
            
            
            if (i % 2 == 0)
                continue; // If the condition is met it will reiterate through the for loop instead of running the code underneath
                System.out.println("i = " + i);
            
        }
        */
    }
    
}
