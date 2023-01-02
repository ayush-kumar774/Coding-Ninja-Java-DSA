package DSA.Chapter3Recursion.Assignment;

import java.util.Scanner;

public class GeometricSum {
    public static double findGeometricSum(int k){
        if(k==0)
        {
            return 1;
        }
        return 1 + 0.5 * (findGeometricSum(k-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Geometric sum = " + findGeometricSum(k));
        sc.close();
    }
}
