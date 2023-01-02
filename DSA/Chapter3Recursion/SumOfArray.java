/*
Sum of Array

Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces

Output Format :
Sum

Constraints :
1 <= N <= 10^3

Sample Input 1 :
3
9 8 9

Sample Output 1 :
26

Sample Input 2 :
3
4 2 1

Sample Output 2 :
7

*/
package DSA.Chapter3Recursion;

import java.util.Scanner;

public class SumOfArray {
    public static int sum(int input[] , int startIndex) {
        if (startIndex == input.length) return 0 ;
        int ans = input[startIndex] + sum (input, startIndex + 1 ) ;
        return ans ;
    } 
    public static int sum(int input[]) {
        return sum(input, 0) ;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            input[i] = sc.nextInt();
        }
        int sumOfElements = sum(input);
        System.out.println("Sum of elements = " + sumOfElements);
        sc.close();
    }
}
