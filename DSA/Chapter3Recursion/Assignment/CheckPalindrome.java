package DSA.Chapter3Recursion.Assignment;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isStringPalindrome(String input) {
		if (input.length() <= 1) {
			return true;
		} else if (input.charAt(0) != input.charAt(input.length() - 1)) {
			return false;
		}
		return isStringPalindrome(input.substring(1, input.length() - 1));
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Is palindrome ? " + isStringPalindrome(input));
        sc.close();
    }
}
