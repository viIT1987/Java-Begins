package Patterns;

public class CharacterPattern {
    public static void main(String[] args) {
        /*char ch1='A';
        char ch2=66;
        ch2++;
        System.out.println(ch1);
        System.out.println(ch2);*/

        char ch='A';
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(ch+" ");

            }
            ch++;
            System.out.println();
        }
    }
}
