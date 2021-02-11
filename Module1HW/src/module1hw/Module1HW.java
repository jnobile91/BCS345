/*
Joseph Nobile
Java Homework 1
2/10/2021
*/
package module1hw;

public class Module1HW {
    public static void main(String[] args)
    {
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
    }
    
}
