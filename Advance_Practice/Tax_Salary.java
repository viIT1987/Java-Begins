package Advance_Practice;

import java.util.Scanner;

public class Tax_Salary {
    double tax(){
        double a,v=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        a=s.nextDouble();

        if (a>0 && a<=10000){
            v = ((a * 5) / 100);
        } else if (a>10000 && a<=20000) {
            v = 500 + (((a-10000) * 10) / 100);
        } else if (a>20000 && a<=50000) {
            v = 1500 + (((a-20000) * 20) / 100);
        } else if (a>50000 && a<=100000) {
            v = 7500 + (((a-50000) * 10) / 100);
        }
        return v;
    }
}
