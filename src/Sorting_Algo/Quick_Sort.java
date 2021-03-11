package Sorting_Algo;

public class Quick_Sort {
    int simulation(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low-1);

        for (int j=low; j<high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void sort(int arr[], int low, int high) {
        if (low < high) {
            int sm = simulation(arr, low, high);
            sort(arr, low, sm-1);
            sort(arr, sm+1, high);
        }
    }

    public static void main(String args[]) {
        System.out.println("Given Unsorted Array");
        int arr[] = { 10, 5, 20, 7, 18};
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int n=arr.length-1;
        Quick_Sort ob = new Quick_Sort();
        ob.sort(arr, 0,n);

        System.out.println("Ascending-sorted array");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
