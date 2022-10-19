package Patterns;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        //CHECK PRIME NUMBER
        /*int a,c=0;
        System.out.println("Enter a Number to check prime: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();

        for (int i=1; i<=a; i++){
            if (a%i==0 ){
                c++;
            }
        }
        if(c==2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }*/



        //COUNT NO. OF PRIME NUMBERS WITHIN GIVEN RANGE
        /*int a,b,c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a=s.nextInt();
        System.out.println("Enter Second Number: ");
        b=s.nextInt();

        for (int i=a; i<=b; i++){
            int count=0;
            for (int j=1; j<=b; j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                c++;
            }else {
                count=0;
            }
        }
        System.out.println(c);*/


        //PRINT ALL PRIME NUMBERS WITHIN RANGE
        int a,b,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a=s.nextInt();
        System.out.println("Enter Second Number: ");
        b=s.nextInt();

        for (int i=a; i<=b; i++) {
            for (j = 2; j <= i; j++) {
                if (i%j==0) {
                    break;
                }
            }
            if (i==j){
                System.out.print(i+" ");
            }
        }
    }
}
