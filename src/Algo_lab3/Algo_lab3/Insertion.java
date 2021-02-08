package Algo_lab3.Algo_lab3;

import java.util.Scanner;

public class Insertion {

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = scan.nextInt();
        int a[] = new int[size];
        int temp;

        System.out.println("Enter Array Elements : ");
        for(int i=0; i<a.length; i++)
        {
            a[i] = scan.nextInt();
        }

        for(int i=0;  i<a.length; i++) {

            for (int j=1 ; j<a.length; j++){
                temp = a[i];
                i = j-1;

                while(i>0 && a[i]> temp) {
                    a[i+1] = a[i];
                    i = i-1;
                }
                a[i+1] = temp;
            }
        }

        System.out.print("Now the Array after Sorting is : ");
        for(int x : a)
        {
            System.out.print( x + "\t");
        }

    }

}
