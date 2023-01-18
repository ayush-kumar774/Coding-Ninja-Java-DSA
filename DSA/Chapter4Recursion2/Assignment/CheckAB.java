package DSA.Chapter4Recursion2.Assignment;

import java.util.Scanner;

public class CheckAB {
    public static boolean checkAB(String input) {
        boolean res = true;
        if (input.charAt(0) != 'a') {
            res = false;
        } 
        else {
            res = check(input);
        }
        return res ;
    }

    public static boolean check(String s) {

        if (s.length() == 0)
            return true;
        boolean res = false;
        if (s.charAt(0) == 'a') {
            if (s.length() == 1) {
                return true;
            } 
            else if (s.charAt(1) == 'a') {
                res = check(s.substring(1));
            } 
            else if (s.length() >= 3 && s.substring(1, 3).equals("bb")) {
                res = check(s.substring(2));
            } 
            else {
                return false;
            }
        } 
        else if (s.charAt(0) == 'b') {
            if (s.length() == 1) {
                return true;
            } 
            else if (s.charAt(1) == 'a') {
                res = check(s.substring(1));
            } 
            else {
                return false;
            }
        }
        return res;
    }

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
        s.close();
	}
}
