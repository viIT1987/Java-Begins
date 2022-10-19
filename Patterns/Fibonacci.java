package Patterns;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        //FIBONACCI SERIES
        /*int x,a=0,b=1,c;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();

        for (int i=1; i<=x; i++){
            System.out.print(a+" ");
            c=a+b;
            b=a;
            a=c;
        }*/


        //TRIBONACCI SERIES

        int x,a=0,b=1,c=2,d;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();

        for (int i=1; i<=x; i++){
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
    }
}
