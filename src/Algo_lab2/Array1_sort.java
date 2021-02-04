package Algo_lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array1_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1, N2;
        ArrayList<Double> arrayList = new ArrayList<Double>();
        double answer;


        // Input for first array
        System.out.println("Size of Array 1: ");
        N1 = scanner.nextInt();
        for (int i=0; i<N1; i++){
            answer = scanner.nextDouble();
            arrayList.add(answer);
        }

        System.out.println("Size of Array 1: ");
        N2 = scanner.nextInt();
        for (int i=0; i<N2; i++){
            answer = scanner.nextDouble();
            arrayList.add(answer);
        }

        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i) + "\n");


    }
}
