package DSA.Chapter4Recursion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] input = takeInput();
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int x = Integer.parseInt(br.readLine().trim());
            System.out.println(binarySearch(input, x));

            t -= 1;
        }
    }

    public static int binarySearch(int[] arr, int x) {
    	return binarySearch(arr, 0, arr.length - 1 , x);
    }

    public static int binarySearch(int[] arr, int startIndex, int endIndex, int x) {
        if (endIndex >= startIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, startIndex, mid - 1, x);
                
            return binarySearch(arr, mid + 1, endIndex, x);
        }
        return -1;
    }
}
