package Algo_lab2;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0, search_number;

        int[] array = new int[6];

        System.out.println("Enter : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter search number: ");
        search_number = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {

            if (array[i] == search_number){
                N++;
            }

        }

        if (N > 0){
            System.out.println(search_number + " is found" + N + " times in your list");
        }

    }
}
