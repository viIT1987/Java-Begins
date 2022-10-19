package Practise;

import java.util.Scanner;

public class CharacterInput {
    public static void main(String[] args) {
        /*String a;
        System.out.println("Enter any Character of your choice: ");
        Scanner s = new Scanner(System.in);
        a= String.valueOf(s.next().charAt(0));
        System.out.println(a);*/

        char ch;
        Scanner s=new Scanner(System.in);
        ch = s.next().charAt(0);

        if (ch>='A' && ch<='Z'){
            System.out.println(Character.toLowerCase(ch));
        }
        else {
            System.out.println(Character.toUpperCase(ch));
        }
    }
}
