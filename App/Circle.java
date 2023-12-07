package App;

import java.math.BigDecimal;

public class Circle {

  private double radius;

  // Empty Constructor
  public Circle() {

  }

  // Argument Constructor
  public Circle(double radius) {
    this.radius = radius;
  }

  // Getter
  public double getRadius() {
    return this.radius;
  }

  // setter
  public void setRadius(double radius) {
    this.radius = radius;
  }

  // Instance methods
  public double diameter() {
    return this.radius * 2;

  }

  public double area() {
    // return this.radius * this.radius * 3.14;
    // Math library
    return Math.pow(this.radius, 2) * Math.PI;
  }

  // Sratic Method - Tool
  public static double area(double radius) {
    return BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(radius))
        .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    // radius * radius * Math.PI; // how to fix by BigDecimal?
  }

  // main - new a circle
  public static void main(String[] args) {
    Circle circle = new Circle();// radius = 0.0
    circle.setRadius(3.2d);
    System.out.println(circle.getRadius());

    Circle circle2 = new Circle(3.4d);
    System.out.println(circle2.getRadius());// 3.4

    double diameter1 = circle.diameter();
    double area1 = circle.area();
    System.out.println("Circle 1 diameter=" + diameter1);
    System.err.println("Circle 1 area=" + area1);

    // Pass by reference
    circle = circle2;

  }



}
