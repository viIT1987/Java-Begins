package Practise;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number: ");
        a=s.nextInt();

        while (a>0){
            b=a%10;
            System.out.print(b);
            a=a/10;
        }
    }
}
