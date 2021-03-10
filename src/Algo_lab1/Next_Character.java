package Algo_lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Next_Character {
    public static void main(String[] args) {

        char[] alphabet = new char[] {
                'a','b','c','d','e','f','g','h','i',
                'j','k','l','m','n','o','p','q','r',
                's','t','u','v','w','x','y','z',' '
        };
        boolean[] replace = new boolean[alphabet.length];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Input : ");
        String input = scanner.nextLine().toLowerCase();

        Arrays.fill(replace, false);

        for (char c : input.toCharArray()) {
            int index = -1;
            for (int i=0; i<alphabet.length; i++) {
                if (alphabet[i] == c) {
                    index = i;
                    break;
                }
            }
            if (index >= 0) {
                replace[index] = true;
            }
        }

        for (int i=alphabet.length-1; i>=0; i--) {
            if (replace[i]) {
                input = input.replace(alphabet[i], alphabet[(i+1) % alphabet.length]);
            }
        }
        System.out.println("New character: " + input);
    }
}
