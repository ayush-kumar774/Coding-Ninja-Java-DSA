package DSA.Chapter3Recursion.Assignment2;

import java.util.Scanner;

public class ReplacePI {
    public static String replace(String input){
		String output = "";
        int size = input.length();
        for (int i = 0; i < size; ++i) {
            if (i + 1 < size && input.charAt(i) == 'p' && input.charAt(i + 1) == 'i') {
                output += "3.14";
                i++;
            }
            else {
                output += input.charAt(i);
            }
        }
        return output;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(replace(input));
        sc.close();
    }
}
