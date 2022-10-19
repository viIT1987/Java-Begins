package Practise;
import java.util.Scanner;

public class CoreJavaPractise {
    public static void main(String[] args) {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number");
        a=s.nextInt();
        if (a%2==0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
