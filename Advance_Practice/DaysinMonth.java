package Advance_Practice;

import java.util.Scanner;

public class DaysinMonth {
    String daysinMonth(){
        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of Month: ");
        x=s.nextInt();

        if (x==1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==12){
            String str=("Number of Days = "+31);
            return str;
        } else if (x==4 || x==6 || x==9 || x==11) {
            String s1 = "Number of Days = " + 30;
            return s1;
        }else {
            String s2 = "Number of Days = " + 28;
            return s2;
        }
    }
}
