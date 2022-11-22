import java.util.*;

public class FahrenheitToCelsiusTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startFahrenheit = sc.nextInt();
        int endFahrenheit = sc.nextInt();
        int stepSize = sc.nextInt();
        int celsius;
            
        while(startFahrenheit <= endFahrenheit)
        {
            celsius = ( ( 5 * (startFahrenheit - 32 ) ) / 9 ) ;
            System.out.println ( startFahrenheit + " " + celsius ) ;
            startFahrenheit += stepSize;
        }
        sc.close();
    }
}
