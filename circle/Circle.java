package circle;

import java.lang.*;

// Ex 2.2 Pg 55
public class Circle {
    private double radius = 50;
    private String colour = "green";

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea() {
        double pi = Math.PI;
        double area = pi * radius * radius;

        return area;
    }

    public double getCircumference() {
        double pi = Math.PI;
        double circumference = 2 * pi * radius;

        return circumference;
    }

    public String toString() {
        return "Circle details is as follows: \ncolour = " + colour + ", \nradius = " + radius + " \narea = " + this.getArea() + " \ncircumference = " + this.getCircumference();
    }
}
