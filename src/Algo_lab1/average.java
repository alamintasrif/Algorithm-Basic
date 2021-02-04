package Algo_lab1;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float[]num = new float[5];
        float result = 0;

        System.out.printf("Enter five number :");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextFloat();
        }

        for (int i = 0; i < num.length; i++) {
            result = num[i] + result;
        }

        System.out.println("Average = " + result/5);
    }
}
