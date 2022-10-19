package Advance_Practice;

import java.util.Scanner;

public class HeronsFormula {
    double heronsformula () {
        double a,b,c,sp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the sides of triangle: ");
        a=s.nextDouble();
        b=s.nextDouble();
        c=s.nextDouble();

        sp = (a+b+c)/2;
        return Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
    }

}
