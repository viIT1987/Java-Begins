package Advance_Practice;

import java.util.Scanner;

public class Circle {
    double circle(){
        double a,res;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        a=s.nextDouble();

        res = (22 * a * a)/7;
        return res;

    }
}
