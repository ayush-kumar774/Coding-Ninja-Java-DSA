package Milestone2.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangeNumberInAnArray {
    public static void arrange (int arr[], int n) {
        if (n <= 0) {
            return ;
        }
        int odd = (n % 2 == 0) ? (n - 1 ) : n ;
        int even = (n % 2 == 0) ? n : (n - 1) ;
        int temp = 1 , index = 0 ;
        while (temp <= odd) {
            arr[index] = temp ;
            temp += 2 ;
            index++ ;
        }
        temp = even ;
        while (temp > 0) {
            arr[index] = temp ;
            temp -= 2 ;
            index++ ;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            arrange(arr, n);
            printArray(arr);

            t -= 1;
        }
    }
}
