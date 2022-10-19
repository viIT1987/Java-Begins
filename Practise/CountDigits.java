package Practise;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        int a,count=0;
        System.out.println("Enter the Number: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();

        while (a>0){
            a=a/10;
            count++;
        }
        System.out.println(count);
    }
}
