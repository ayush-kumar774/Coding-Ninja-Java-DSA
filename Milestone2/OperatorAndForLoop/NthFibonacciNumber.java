package Milestone2.OperatorAndForLoop;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 1, second = 1 ;
        int fib ;
        for (int i = 3 ; i <= n ; i++)
        {
            fib = first + second ;
            first = second ;
            second = fib ;
        }
        System.out.println(second);
        sc.close();
    }
}
