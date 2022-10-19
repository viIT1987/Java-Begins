package Advance_Practice;

import java.util.Scanner;

public class Rectangle {
    double rectangle(){
        double res,length, breath;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle: ");
        length=s.nextDouble();
        breath=s.nextDouble();

        res = (length * breath);
        return res;
    }
}
