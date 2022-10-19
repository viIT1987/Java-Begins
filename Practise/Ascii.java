package Practise;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        char a;
        System.out.println("Enter any number to get ASCII value; ");
        Scanner s=new Scanner(System.in);
        a=s.next().charAt(0);
        int b= a;
        System.out.println(b);
    }
}
