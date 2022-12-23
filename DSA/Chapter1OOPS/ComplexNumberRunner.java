package DSA.Chapter1OOPS;
import java.util.Scanner;

class ComplexNumbers {
    int real ;
    int imaginary;

    ComplexNumbers first ;
    ComplexNumbers(int real, int imaginary) {
        this.real = real ;
        this.imaginary = imaginary;
    }

    void plus (ComplexNumbers second) {
        real += second.real;
        imaginary += second.imaginary;
    }

    void multiply(ComplexNumbers second) {
        int firsts = real * second.real;
        int outers = real * second.imaginary;
        int inners = imaginary * second.real;
        int lasts = (-1) * (imaginary * second.imaginary);
        real = firsts + lasts;
        imaginary = outers + inners;
    }

    void print() {
        System.out.println(real + " + i" + imaginary);
    }

} 

public class ComplexNumberRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        int choice = s.nextInt();

        if(choice==1)
        {
            // Add
            c1.plus(c2);
            c1.print();
        }
        else if(choice==2)
        {
            // Multiply
            c1.multiply(c2);
            c1.print();
        }
        else
        {
            s.close();
            return;
        }
        s.close();
    }
}
