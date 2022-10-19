package Practise;

import java.util.Scanner;

public class SumofNnumbers {
    public static void main(String[] args) {
        int a, count = 0;
        System.out.println("Enter any Number of your choice: ");
        Scanner s = new Scanner(System.in);
        a=s.nextInt();

        for (int i = 1; i <= a; i++) {
            count += i;
        }
        System.out.println(count);
    }
}
