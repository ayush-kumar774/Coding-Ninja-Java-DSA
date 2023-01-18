package DSA.Chapter3Recursion.Assignment2;

import java.util.Scanner;

public class RemoveX {
    public static String removeX(String input) {
        if (input.length() <= 1) {
            if (input.charAt(0) == 'x') {
                return "";
            } else
            return input;
        }
        if (input.charAt(0) == 'x') {
            input = input.substring(1);
            return removeX(input);
        }
        return input.charAt(0) + removeX(input.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(removeX(input));
        sc.close();
    }
}
