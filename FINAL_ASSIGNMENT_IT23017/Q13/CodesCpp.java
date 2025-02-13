///it23017


package com.mycompany.codes.cpp;

import java.util.* ;
import java.util.Date;

class GeometricObject {
    String color;
    boolean filled;
    Date dateCreated;

    GeometricObject() {
        this("white", false);
    }

    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    boolean isFilled() {
        return filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}

class Circle extends GeometricObject {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this(radius, "white", false);
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    double getDiameter() {
        return 2 * radius;
    }

    void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and has radius " + radius);
    }
}

class Rectangle extends GeometricObject {
    double width;
    double height;

    Rectangle() {
        this(1.0, 1.0);
    }

    Rectangle(double width, double height) {
        this(width, height, "white", false);
    }

    Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class CodesCpp {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, "red", true);
        System.out.println("Circle 1:");
        System.out.println(circle1.toString());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        circle1.printCircle();

        Rectangle rectangle1 = new Rectangle(4.0, 6.0, "blue", false);
        System.out.println("\nRectangle 1:");
        System.out.println(rectangle1.toString());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
    }
}
