import java.util.Scanner;

// Ex 1.2 pg 39
public class LengthConverter {
    public static void main(String[] args) {        
        double x = 0.01;
        int z;

        System.out.println("Please enter unit of length in centimeters, cm: ");
        Scanner input = new Scanner(System.in);
        z = input.nextInt();
        
        System.out.println("Converting... ");

        double y = x*z;

        System.out.println("Length in cm = " + z);
        System.out.println("Length in m = " + y);   
    }
}