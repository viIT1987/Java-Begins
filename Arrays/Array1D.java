package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        //int arr[]={10,20,30,70,50,90};
        /*int arr[]=new int[5];
        System.out.println("Enter five elements: ");
        Scanner s=new Scanner(System.in);

        for (int i=0;i<5;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array elements:");
        for (int a : arr){
            System.out.println(a);
        }*/

        //int[] days = {1, 2, 3};
        //System.out.println(days[2]);

        int twoD[][] = new int[3][4];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                twoD[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
        }
    }
}
