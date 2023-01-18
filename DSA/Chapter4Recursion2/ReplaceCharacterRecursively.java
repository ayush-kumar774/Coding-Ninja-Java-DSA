package DSA.Chapter4Recursion2;

import java.util.Scanner;

public class ReplaceCharacterRecursively {

    public static String replaceCharacter2(String input, char c1, char c2) {
		if(input.length() == 1) return input;

        char x = input.charAt(0);

        if (input.charAt(0) == c1) {
            x = c2 ;
            input = c2 + input.substring(1);
        }

        return x + replaceCharacter(input.substring(1), c1, c2);
	}
    

    public static String replaceCharacter(String input, char c1, char c2, int index) {
		if (index == input.length())
			return "";

		if (input.charAt(index) == c1) {
			input = input.substring(0, index) + c2 + input.substring(index + 1);
		} 
		return input.charAt(index) + replaceCharacter(input, c1, c2, index + 1);
	}

	public static String replaceCharacter(String input, char c1, char c2) {
		return replaceCharacter(input, c1, c2, 0);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        System.out.println(replaceCharacter(input, a, b));
        sc.close();
    }
}
