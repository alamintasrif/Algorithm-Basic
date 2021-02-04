package Algo_lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;

        double[] array = new double[6];

        System.out.println("Enter : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j]){
                    N++;
                }
            }

            if (N != 0){
                System.out.println(array[i] + "\t" + N);
                N = 0;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
