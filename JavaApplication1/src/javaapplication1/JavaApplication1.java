package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        double average = 0;
        
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Please enter a value for entry #" + (i+1));
            sum = sum+ sc.nextInt();
        }
        average = (double)sum/10;
        System.out.println("The average is " + average);
    }
    
}