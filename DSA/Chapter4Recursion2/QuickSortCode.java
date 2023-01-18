package DSA.Chapter4Recursion2;

import java.util.Scanner;

public class QuickSortCode {
    static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
  
    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
  
        int i = (low - 1);
  
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void quickSort(int[] input, int startIndex, int endInedx) {
        if (startIndex < endInedx) {
            int partitionIndex = partition(input, startIndex, endInedx);
            quickSort(input, startIndex, partitionIndex - 1);
            quickSort(input, partitionIndex + 1, endInedx);
        }
    }

    public static void quickSort(int[] input) {
        quickSort(input, 0, input.length - 1);
    }
}
