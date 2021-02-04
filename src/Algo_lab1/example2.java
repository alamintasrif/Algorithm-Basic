package Algo_lab1;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {

        double marks;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        marks = scanner.nextDouble();


        if(marks ==4.00)
        {
            System.out.print("Outstanding");
        }else if(marks>=3.75 && marks<4.00)
        {
            System.out.print("Excellent");
        }else if(marks>=3.50 && marks<3.75)
        {
            System.out.print("Very Good");
        }else if(marks>=3.25 && marks<3.50)
        {
            System.out.print("Good");
        }else if(marks>=3.00 && marks<3.25)
        {
            System.out.print("Satisfactory");
        }else if(marks>=2.75 && marks<3.00)
        {
            System.out.print("Above Average");
        }else if(marks>=2.50 && marks<2.75)
        {
            System.out.print("Average");
        }else if(marks>=2.25 && marks<2.50)
        {
            System.out.print("Below Average");
        }else if(marks>=2.00 && marks<2.25)
        {
            System.out.print("Pass");
        }else
        {
            System.out.print("Fail");
        }

    }
}

