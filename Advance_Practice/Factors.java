package Advance_Practice;

import java.util.Scanner;

public class Factors {
    static int factors(){
        int a,count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number to fing the factors: ");
        a=s.nextInt();

        for (int i=1; i<=a; i++){
            if (a%i==0){
                count++;
            }
        }
        return count;
    }
}
