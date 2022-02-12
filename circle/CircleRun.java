package circle;

// Ex 2.3 Pg 55
public class CircleRun {
    public static void main(String[] args) {
        Circle circle1 = new Circle(23, "blue");
        Circle circle2 = new Circle(35, "purple");
        Circle circle3 = new Circle(92, "yellow");

        System.out.println("\nFirst Circle Object");
        System.out.println(circle1.toString());

        System.out.println("\nSecond Circle Object");
        System.out.println(circle2.toString());

        System.out.println("\nThird Circle Object");
        System.out.println(circle3.toString());
    }
}
