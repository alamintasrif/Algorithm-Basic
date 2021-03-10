package Greedy_Algorithm;

public class Coin_Change {
    public static int coinChangeGreedy(int[] coins, int n) {

        int result = 0;

        while (n != 0) {

            for (int i = coins.length - 1 ; i>=0 ; i--) {
                if (coins[i] <= n) {
                    n = n - coins[i];
                    System.out.println("Adding " + coins[i] + " tk note");
                    i++;

                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] coins = {1, 3, 4, 5, 10, 20, 50, 100, 500, 1000};
        int n = 46;

        int result = coinChangeGreedy(coins, n);

        System.out.println("You will give him " + result + " note");
    }
}

