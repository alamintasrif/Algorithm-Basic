package Lab_Task_1;

import java.util.Scanner;

public class Solve_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array1_size, array2_size, i, key;
        int [] akash_array1, akash_array2;

        // array1
        System.out.println("Size of array1: ");
        array1_size = scanner.nextInt();
        System.out.println("Enter the array1 Number: ");
        akash_array1 = new int[array1_size];

        for (i=0; i<array1_size; i++){
            akash_array1[i] = scanner.nextInt();
        }

        // array2
        System.out.println("Size of array2: ");
        array2_size = scanner.nextInt();
        System.out.println("Enter the array2 Number: ");
        akash_array2 = new int[array2_size];

        for (i=0; i<array2_size; i++){
            akash_array2[i] = scanner.nextInt();
        }

        // merge
        int length = akash_array1.length + akash_array2.length;
        int[] akash_merge_array = new int[length];
        int position = 0;

        for (int element: akash_array1) {
            akash_merge_array[position] = element;
            position++;
        }

        for (int element: akash_array2) {
            akash_merge_array[position] = element;
            position++;
        }


        for (int j=1; j< akash_merge_array.length; j++){
            key = akash_merge_array[j];
            i = j-1;

            while (i>-1 && akash_merge_array[i]<key){
                akash_merge_array[i+1] = akash_merge_array[i];
                i = i-1;
            }

            akash_merge_array[i+1] = key;
        }

        System.out.println("After Insertion sort: ");
        for (int element: akash_merge_array) {
            System.out.print(element + " ");
        }

        int low, high, Xm, search, mid, counter = 0;
        boolean flag = false;
        low = 0;
        high = akash_merge_array.length - 1;
        System.out.println("\nEnter a search number ");
        search = scanner.nextInt();

        do {
            mid = (low + high)/2;
            Xm = akash_merge_array[mid];

            if (Xm < search){
                low = mid + 1;
            }else if (Xm > search){
                high = high - 1;
            }else {
                flag = true;
            }
        }while (low <= high && !flag);

        if (flag){
            for (i=0 ; i<akash_merge_array.length; i++) {
                if (akash_merge_array[i] == search){
                    counter++;
                }
            }
            System.out.println(search + " is found " + counter + " times in the array");
        }else {
            System.out.println("Not Found");
        }

    }
}
