package Algo_lab2;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1;
        double Xm, search;

        System.out.println("Size of Array: ");
        N1 = scanner.nextInt();
        double[] array = new double[N1];

        System.out.println("Enter : ");
        for (int i = 0; i < N1; i++) {
            array[i] = scanner.nextDouble();
        }

        System.out.println("Enter Search number: ");
        search = scanner.nextDouble();

        int low = 0, high = array.length, mid;
        boolean flag = false;

        if (low < high && !flag) {
            do {
                mid = (low + high) / 2;
                Xm = array[mid];

                if (Xm < search) {
                    low = mid+1;
                }else if (Xm > search){
                    low = mid-1;
                }else {
                    flag = true;
                }
            } while (low < high && !flag);
        }

        if (flag){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }
    }
}
