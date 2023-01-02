package DSA.Chapter3Recursion.Assignment2;

import java.util.Scanner;

public class StringToInteger {
    public static int convertStringToInt(String input){
		if (input.length() < 1) {
			return 0;
		}
		return input.charAt(input.length() - 1) - '0' + (10 * convertStringToInt(input.substring(0, input.length() - 1)));
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(convertStringToInt(input));
        sc.close();
    }

}
