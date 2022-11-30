package Milestone2.OperatorAndForLoop.Assignment;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int choice = sc.nextInt();
        if (choice == 1) {
            int sum = 0 ;
            for (int i = 1 ; i <= n ; i++) {
                sum += i ;
            }
            System.out.println(sum);
        }
        else if (choice == 2) {
            int mul = 1 ;
            for (int i = 1 ; i <= n ; i++) {
                mul *= i ;
            }
            System.out.println(mul);
        }
        else {
            System.out.println("-1");
        }
        sc.close();
    }
}
