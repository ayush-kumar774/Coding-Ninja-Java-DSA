package DSA.Chapter3Recursion;

import java.util.Scanner;

public class CheckNumberInArray {

    public static boolean checkNumber(int input[], int x, int startIndex) {
        if (startIndex == input.length) return false ;
        else if (input[startIndex] == x) return true ;
        else return checkNumber(input, x, startIndex) ;
    }

    public static boolean checkNumber(int input[], int x) {
        return checkNumber(input, x , 0);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int input[] = new int[n] ;
        for (int i = 0 ; i < n ; i++) {
            input[i] = sc.nextInt();
        }
        int x = sc.nextInt() ;
        System.out.println(checkNumber(input, x));
        sc.close();
    }
}
