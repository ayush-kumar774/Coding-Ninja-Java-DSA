package DSA.Chapter3Recursion;

import java.util.Scanner;

public class LastIndexOfNumber {

    static Scanner sc = new Scanner(System.in);

    public static int lastIndex(int input[], int x) {
        return lastIndex(input, x, (input.length - 1)) ;
    }

    public static int lastIndex(int input[], int x, int index) {
        if (index == -1) {
            return -1;
        }
        else if (input[index] == x) {
            return index ;
        }
        else {
            return lastIndex(input, x, index - 1);
        }
    }

    public static int[] takeInput(){
		int size = sc.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = sc.nextInt();
		}
		return input;
	}

    public static void main(String[] args) {
        int[] input = takeInput();
		int x = sc.nextInt();
		System.out.println(lastIndex(input, x));
    }
}
