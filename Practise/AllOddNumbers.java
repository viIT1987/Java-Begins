package Practise;
import java.util.Scanner;

public class AllOddNumbers {
    public static void main(String[] args) {
        int a,b,count;

        Scanner Odd=new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        a= Odd.nextInt();

        System.out.println("Enter 2nd Number: ");
        b= Odd.nextInt();

        count=0;
        for (int i = a; i <= b; i++) {
            /* count++; */
            if (0 != i % 2) System.out.println(i);
        }
        //System.out.println(count);
    }
}
