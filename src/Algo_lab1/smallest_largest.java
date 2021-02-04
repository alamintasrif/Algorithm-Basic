package Algo_lab1;

import java.util.Scanner;

public class smallest_largest {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        float[]num = new float[10];

        System.out.printf("Enter five number :");
        for (int i = 0; i <num.length; i++) {
            num[i]=input.nextFloat();
        }

        float max=num[0];
        float min=num[0];

        for (int i = 1; i < 5; i++) {
            if( max<num[i]){
                max=num[i];
            }
            else if( min>num[i]){
                min=num[i];
            }
        }

        System.out.println("Maximum :"+max);
        System.out.println("Minimum :"+min);
    }
}
