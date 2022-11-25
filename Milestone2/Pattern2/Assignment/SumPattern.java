package Milestone2.Pattern2.Assignment;

import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1 ;
        int sum = i ;

        while (i <= n) 
        {
            int t = 1 ;
            int j = 1 ;
            while (j <= i) 
            {
                if (t < i)
                {
                    System.out.print(t + "+");
                    t++ ;
                    j++ ;
                }
                else 
                {
                    System.out.print(t + "=" + sum);
                    j++;
                }
            }
            System.out.println();
            i++ ;
            sum = sum + i ;
        }

        sc.close();
    }
}
