package DSA.Chapter3Recursion.Assignment;

import java.util.Scanner;

public class Multiplication {
    public static int multiplyTwoIntegers(int m, int n){
		if (n == 1) return m ;
		else return (m + multiplyTwoIntegers(m, n - 1)) ;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt() ;
        int n = sc.nextInt() ;
        System.out.println(multiplyTwoIntegers(m, n));
        sc.close();
    }
}
