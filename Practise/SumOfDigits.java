package Practise;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int a,c=0,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        a=s.nextInt();

        while (a>0){
            b=a%10;
            c=c+b;
            a=a/10;
        }
        System.out.println(c);
    }
}
