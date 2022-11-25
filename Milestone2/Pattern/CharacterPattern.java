import java.util.Scanner;
public class CharacterPattern {
    // public static void pattern(int n)
    // {
    //     int start = 'A' ;
    //     for(int i = 1 ; i <= n ; i++)
    //     {
    //         start = start + i - 1;
    //         for (int j = 1 ; j <= i ; j++) {
    //             System.out.print((char)start);
    //             start = start + 1 ;
    //         }
    //         System.out.println();
    //         //start = start + 1;
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //pattern(n);
       int i = 1;
        
        while ( i <= n ) {
            int j = 1;
            int  Start = 'A' + i - 1 ;
            while (j <= i) {
                System.out.print((char)(Start));
                j++;
               Start++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
