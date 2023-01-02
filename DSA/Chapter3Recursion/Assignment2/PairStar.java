package DSA.Chapter3Recursion.Assignment2;

import java.util.Scanner;

public class PairStar {
    public static String addStars(String str) {
		if (str.length() <= 1)
			return str;

		if (str.charAt(0) == str.charAt(1))
			return str.charAt(0) + "*" + addStars(str.substring(1));

		return str.charAt(0) + addStars(str.substring(1));
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(addStars(str));
        sc.close();
    }
}
