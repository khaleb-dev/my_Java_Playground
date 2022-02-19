import java.lang.*;

// Ex 1.3 pg 40
public class PolynomialCalculator{
	public static void main(String[] args) {
		double a=5, b=6, c=1;

		double j = Math.sqrt(Math.pow(b, 2)-4*a*c);

		double z = 2*a;

		double x = ((-b)+j)/z;
		double y = ((-b)-j)/z;

		System.out.println("polynomail =5x\u00b2+6x+1=0"); 
		System.out.println("1st root = "+x);
		System.out.println("2nd root = "+y);  

	}
}