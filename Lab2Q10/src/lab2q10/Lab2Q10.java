package lab2q10;

import java.util.Scanner;

public class Lab2Q10 {

    public static void printTicket(String x, int y, double z)
        {
            if (y <= 13)
            {
                z = 9.99;
            }
            else if ((y > 13) && (y < 65))
            {
                z = 19.99;
            }
            else if (y >= 65)
            {
                z = 12.99;
            }
            System.out.println("Your name is: " + x);
            System.out.println("Your age is: " + y);
            System.out.println("Your ticket price is: " + z);
        }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scn.nextLine().trim();
        System.out.println("Enter your age: ");
        int age = scn.nextInt();
        double ticket_Price = 0;
        
        printTicket(name, age, ticket_Price);

    }
}