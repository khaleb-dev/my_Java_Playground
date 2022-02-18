// Ex 1.1 pg 38
public class UnaryOperatorsExamples{
    public static void main(String args[]){
        int x=2;
        int y=5;
        
        System.out.println("The initial value of x is: "+ x);
        System.out.println("IN PRE-INCREMENT '++x', x is now: "+ ++x);
        System.out.println("IN POST-INCREMENT 'x++', x is still: "+ x++);
        System.out.println("and the incemented value of x is: "+ x);
        //decrement Operators
        System.out.println("The initial value of y is: "+ y);
        System.out.println("IN PRE-DECREMENT '--y, y is now: "+ --y);
        System.out.println("IN POST-DECREMENT 'y--', y is still: "+ y--); 
        System.out.println("and the decrease value of x is: "+ y);
    }
}