package DSA.Chapter3Recursion;

import java.util.Scanner;

public class AllIndexesOfANumber {

    static Scanner sc = new Scanner(System.in);

    public static int[] allIndexes(int input[],int x, int start) {
		if (start == input.length) {
			int[] ans = new int[0];
			return ans;
		}
		int[] smallIndex = allIndexes(input, x,start + 1);

		if (input[start] == x) {
			int[] myAns = new int[smallIndex.length + 1];
			myAns[0] = start;
			for (int i = 0; i < smallIndex.length; i++) {
				myAns[i + 1] = smallIndex[i];
			}
			return myAns;
		} else {
			return smallIndex;
		}
	}

	public static int[] allIndexes(int input[], int x) {
		return allIndexes(input, x, 0);
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
		System.out.println(allIndexes(input, x));
    }
}
