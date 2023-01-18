package DSA.Chapter4Recursion2.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnSubsetsSumToK {
    public static int[][] subsetsSumK(int input[], int k) {
        int n = input.length;
        int comp = (int) Math.pow(2, n) - 1;

        int subset[][] = new int[comp][];

        subsets(input, subset, 0);
        ArrayList<ArrayList<Integer>> sub1 = new ArrayList<>();

        for (int i = 0; i < subset.length; i++) {
            int sum = 0;
            for (int j = 0; j < subset[i].length; j++) {
                sum = sum + subset[i][j];
            }
            if (sum == k) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int k1 = 0; k1 < subset[i].length; k1++)
                    temp.add(subset[i][k1]);

                sub1.add(temp);
            }

        }
        int subset1[][] = new int[sub1.size()][];
        for (int i = 0; i < sub1.size(); i++) {
            ArrayList<Integer> temp = sub1.get(i);
            subset1[i] = new int[temp.size()];
            for (int j = 0; j < temp.size(); j++) {
                subset1[i][j] = temp.get(j);
            }

        }

        return subset1;
    }

    static int subsets(int input[], int[][] out, int start) {
        if (start == input.length - 1) {
            out[0] = new int[1];
            out[0][0] = input[start];
            return 1;
        }

        int getSizeOfOut = subsets(input, out, start + 1);

        int c = getSizeOfOut + 1;
        out[getSizeOfOut] = new int[1];
        out[getSizeOfOut][0] = input[start];

        for (int i = 0; i < getSizeOfOut; i++) {

            out[c] = new int[out[i].length + 1];

            out[c][0] = input[start];
            for (int j = 0; j < out[i].length; j++) {
                out[c][j + 1] = out[i][j];

            }
            c++;
        }

        getSizeOfOut = c;
        return c;
    }

    static Scanner s = new Scanner(System.in);
    
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		int output[][] = subsetsSumK(input, k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}
