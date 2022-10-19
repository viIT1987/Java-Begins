package Patterns;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter any two Numbers: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);

    }
}
