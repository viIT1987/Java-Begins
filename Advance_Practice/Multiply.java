package Advance_Practice;

import java.util.Scanner;

public class Multiply {
    void multiply(){
        int a,b=1;
        System.out.println("Enter the Number: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();

        System.out.println("Table of "+a+" is:");
        for (int i=1; i<=10; i++) {
            b=a*i;
            System.out.println(b);
        }
    }
}
