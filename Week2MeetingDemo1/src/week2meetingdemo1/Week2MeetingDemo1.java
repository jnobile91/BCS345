package week2meetingdemo1;

import java.util.Scanner;
import java.util.Random;

public class Week2MeetingDemo1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Random rdm = new Random();
        
        /*
        Data types
        int (32 bit)
        short (16 bit)
        double (64 bit)
        string
        char
        boolean
        float (32 bit)
        long
        8 bits = 1 byte
        */
        
        // System.out.print("Enter x: ");
        int x = rdm.nextInt(10); // 10 is the 'bound' in this instance. Will generate random numbers between 0-9
        int y = rdm.nextInt(6) + 4; // Random num between 4-9
      
        System.out.println("Result X (0-9): " + x);
        // System.out.println("Result Y (4-9): " + y);
        
        if (x == 5)
        {
            System.out.println("You got the number " + x + "!");
        }
        else
        {
            System.out.println("You did not get the number 5 :(");
        }
        
        x = 3;
        switch (x)
        {
            case 3:System.out.println("It is 3."); break;
            case 31:System.out.println("It is 31."); break;
            case 32:System.out.println("It is 32."); break;
            case 33:System.out.println("It is 33."); break;
            case 34:System.out.println("It is 34."); break;
            default:System.out.println("No match.");
        }
        
        for (int i = 0; i < 10; i++)
        {
            int r = rdm.nextInt(100) + 1;
            System.out.println(r);
        }
        
        // HOMEWORK FOR LOOP
        /*
        The first line initiates a for loop at 0.
        The loop runs until i < 101 (in this case we want to test the number 100).
        You can alternatively write the "check" as i <= 100.
        This increments the counter "i" by 1 to loop through the necessary numbers.
        */
        for (int i = 0; i < 101; i++)
        {
            /*
            The if statement runs for each value of i.
            Even numbers must be divisible by 2.
            The logic i % 2 == 0 ensures that there is no remainder, meaning it is even.
            If the number meets this criteria, it then prints the number.
            */
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }
        
        // Loop showing all odd numbers between 0 and 20
        for (int i = 0; i < 21; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }
        }
        
    }
}
