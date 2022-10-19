package Practise;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        int a,p,c=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        a=s.nextInt();
        System.out.println("Enter the Power");
        p=s.nextInt();

        for (int i=1;i<=p;i++){
            c=c*a;
        }
        System.out.println("Result: "+c);
    }
}
