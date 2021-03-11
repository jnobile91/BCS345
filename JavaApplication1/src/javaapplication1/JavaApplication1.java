package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 10, y = 20;
        while (y < 100)
        {
            x += y;
            y +=20;
        }
        System.out.print(x);
    }
    
}