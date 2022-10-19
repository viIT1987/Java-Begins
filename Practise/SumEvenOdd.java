package Practise;

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        int a, count = 0;
        System.out.println("Enter any Number of your choice to get the sum of even or odd numbers: ");
        Scanner s = new Scanner(System.in);
        a=s.nextInt();

        if (a % 2 == 0) {
            for (int i = 0; i <= a; i=i+2) {
                count += i;
            }
        } else {
            for (int i = 1; i <= a; i=i+2) {
                count += i;
            }
        }
        System.out.println(count);
    }
}
