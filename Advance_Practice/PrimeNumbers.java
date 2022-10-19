package Advance_Practice;

import java.util.Scanner;

public class PrimeNumbers {
    void primenumbers(){
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        a=s.nextInt();
        b=s.nextInt();

        for (int i=a; i<=b; i++){
            int count=0;
            for (int j=2; j<=a; j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println(i);;
            }
            else {
                count=0;
            }
        }

        /*int a,i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        a=s.nextInt();

        for (i=2; i<=a; i++){
            if (a%i==0){
                break;
            }
        }
        if (a==i){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
        return 0;*/

    }
}
