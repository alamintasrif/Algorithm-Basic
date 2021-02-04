package Algo_lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1, N2, k = 0;
        double store;

        // Input for first array
        System.out.println("Size of Array 1: ");
        N1 = scanner.nextInt();
        double[] array1 = new double[N1];

        for (int i=0; i<N1; i++){
            array1[i] = scanner.nextDouble();
        }

        // Input for second array
        System.out.println("Size of Array 2: ");
        N2 = scanner.nextInt();
        double[] array2 = new double[N2];

        for (int i=0; i<N2; i++){
            array2[i] = scanner.nextDouble();
        }

        double[] array3 = new double[N1 + N2];

        for (int i=0; i<array3.length; i++){
            if (i < array1.length) {
                array3[i] = array1[i];
            }else {
                array3[i] = array2[k];
                k++;
            }
        }


        for (int i=0; i<array3.length; i++){
            for (int j=0; j<array3.length; j++) {

                if (array3[i] < array3[j]) {
                    store = array3[j];
                    array3[j] = array3[i];
                    array3[i] = store;
                }

            }
        }

        for (int i=0; i< array3.length; i++){
            System.out.println(array3[i]);
        }


    }
}
