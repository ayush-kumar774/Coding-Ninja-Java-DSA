package Milestone2.Pattern2.Assignment;

import java.util.Scanner;

public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
        sc.close();
    }
}

