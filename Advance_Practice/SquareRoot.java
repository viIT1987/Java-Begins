package Advance_Practice;

import java.util.Scanner;

public class SquareRoot {
    double squareroot(){
        double a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        a=s.nextInt();

        b=Math.sqrt(a);
        return b;
    }
}
