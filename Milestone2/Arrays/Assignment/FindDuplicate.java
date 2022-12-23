package Milestone2.Arrays.Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDuplicate {

  public static int findUnique(int[] arr) {
    int n = arr.length;
    int ans = 0;
    int duplicateElement[] = new int[n];
    for (int i = 0; i < n; i++) {
      duplicateElement[i] = arr[i];
    }
    for (int i = 0; i < n; i++) {
      int counter = 0;
      for (int j = 0; j < n; j++) {
        if (duplicateElement[i] == arr[j]) {
          counter++;
        }
      }
      if (counter == 2) {
        ans = duplicateElement[i];
      }
    }

    return ans;
  }

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

  public static void main(String[] args) throws NumberFormatException, IOException {
    int t = Integer.parseInt(br.readLine().trim());

    while (t > 0) {

      int[] input = takeInput();
      System.out.println(findUnique(input));

      t -= 1;
    }
  }

}
