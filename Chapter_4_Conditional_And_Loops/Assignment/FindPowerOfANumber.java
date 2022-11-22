package Assignment;

import java.util.Scanner;

public class FindPowerOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rep = sc.nextInt();
        int pow = 1 ;
        for (int i = 1 ; i <= rep; i++) {
            pow *= n ;
        }
        System.out.println(pow);
        sc.close();
    }
}
