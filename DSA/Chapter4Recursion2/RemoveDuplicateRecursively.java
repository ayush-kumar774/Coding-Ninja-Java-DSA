package DSA.Chapter4Recursion2;

import java.util.Scanner;

public class RemoveDuplicateRecursively {
    static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(removeConsecutiveDuplicates(input, 0));
    }

    public static String removeConsecutiveDuplicates(String input) {
        if (input.length() <= 1) return input ;
        if (input.charAt(0) == input.charAt(1)) return removeConsecutiveDuplicates(input.substring(1));
        else return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));
    }

    public static String removeConsecutiveDuplicates(String input, int index) {
        if (index == input.length()) return "";
		if (index == input.length() - 1) return input.charAt(index) + removeConsecutiveDuplicates(input, index + 1);
		if (input.charAt(index) == input.charAt(index + 1)) return removeConsecutiveDuplicates(input, index + 1);
		else return input.charAt(index) + removeConsecutiveDuplicates(input, index + 1);
    }
}
