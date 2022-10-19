package datatypes;
import java.util.Scanner;

public class integertype {
    public static void main(String[] args) {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        a=s.nextInt();
        System.out.println(a*a);
    }
}
