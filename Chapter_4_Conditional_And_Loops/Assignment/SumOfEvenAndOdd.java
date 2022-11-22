package Assignment;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int even = 0 ;
        int odd = 0 ;
        for (int i = 0 ; i < str.length(); i++) {
            if (((int)(str.charAt(i)) - 48) % 2  == 0) {
                even += (int)((str.charAt(i)) - 48);
            }
            else {
                odd += (int)((str.charAt(i)) - 48);
            }
        }
        System.out.println(even + " " + odd);
        sc.close();
    }
}
