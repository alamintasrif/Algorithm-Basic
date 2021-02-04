package Algo_lab1;

import java.util.Scanner;

public class Loop_Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, i;
        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        for ( i=1; i<11 ; i++){
            System.out.println(number + " X " + i + " = " + number*i);
        }


    }
}
