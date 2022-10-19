package Practise;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int x,a,b,c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        a=s.nextInt();
        x=a;
        while (a>0){
            b=a%10;
            c=b+(c*10);
            a=a/10;
        }
        if (c==x){
            System.out.println("Palindrome.");
        }else {
            System.out.println("Not Palindrome.");
        }
    }
}
