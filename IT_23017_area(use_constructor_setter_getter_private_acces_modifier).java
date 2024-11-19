///IT_23017
import java.util.Scanner ;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter the Radius :\n") ;
        Double radius = new Scanner(System.in).nextDouble() ;
        
        Circle circle1 = new Circle(radius);

        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area of Circle (using constructor): " + circle1.calculateArea());

        System.out.print("\nEnter new Radius :\n") ;
        
        radius = new Scanner(System.in).nextDouble() ;
        circle1.setRadius(radius);

        System.out.println("\nUpdated Radius: " + circle1.getRadius());
        System.out.println("Area of Circle (using setter): " + circle1.calculateArea());
    }
}
