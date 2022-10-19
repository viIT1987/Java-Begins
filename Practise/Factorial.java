package Practise;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int a,c=1;
        System.out.println("Enter the Number: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();

        for (int i=a;i>=1;i--){
            c=c*i;
        }
        System.out.println("Factorial of a is: "+c);
    }
}

