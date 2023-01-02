package DSA.Chapter3Recursion;

import java.util.Scanner;

public class FirstIndexOfNumber {
    
    public static int firstIndex(int input[], int x , int startIndex) {
        //System.out.println(startIndex);
        if (startIndex == input.length) {
            return -1;
        }
        else if (input[startIndex] == x) {
            return startIndex ;
        }
        else {
            return firstIndex(input, x, startIndex + 1);
        }
    }

    public static int firstIndex(int input[], int x) {
        return firstIndex(input, x, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input[] = new int[n] ;
        for (int i = 0; i < n ; i++) {
            input[i] = sc.nextInt() ;
        }
        int x = sc.nextInt();
        System.out.println(firstIndex(input, x));
        sc.close();
    }
}
