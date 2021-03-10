package Greedy_Algorithm;

public class Bin_picking_problem {

    static int accommodate(int weight[], int n, int c)
    {
        int result = 0, bin_rem = c;

        for (int i = 0; i < n; i++) {

            if (weight[i] > bin_rem) {
                result++;
                System.out.println("bin created : " + weight[i]);
                bin_rem = c - weight[i];
            }
            else {
                bin_rem = bin_rem - weight[i];
                System.out.println("Picked : " + weight[i]);
            }

        }
        return result;
    }

    public static void main(String[] args)
    {
        int weight[] = { 4, 8, 1, 4, 2, 1 };
        int c = 10;
        int n = weight.length;
        System.out.println("We need " + accommodate(weight, n, c) +" bins to accommodate all items ");
    }
}
