package Algo_lab3.Algo_lab3;

import java.util.Scanner;

public class Selection {

    public static void main(String args[]) {
        int size, i, j, temp, small, index = 0, count=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        size = scan.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter Array Elements : ");
        for(i=0; i<size; i++)
        {
            arr[i] = scan.nextInt();
        }

        for(i=0; i<(size-1); i++) {
            small = arr[i];
            for(j=(i+1); j<size; j++)
            {
                if(small>arr[j])
                {
                    small = arr[j];
                    count++;
                    index = j;
                }
            }
            if(count!=0)
            {
                temp = arr[i];
                arr[i] = small;
                arr[index] = temp;
            }
            count=0;
        }

        System.out.print("Now the Array after Sorting is : ");
        for(i=0; i<size; i++)
        {
            System.out.print(arr[i]+ "  ");
        }
    }

}
