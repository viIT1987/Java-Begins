package Practise;

import java.util.Scanner;

public class DayofaWeek {
    public static void main(String[] args) {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the day: ");
        a=s.nextInt();

        switch (a) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Sunday");
        }
    }
}
