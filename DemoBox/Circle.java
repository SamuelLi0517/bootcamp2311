package DemoBox;

import java.util.List;

public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return radius * radius * Math.PI;
  }

  public static void main(String[] args) {
    Circle yy = new Circle(9.0);

    Shape.add(List.of(new Circle(10.0)), yy);
// Shape.area3(new Circle(10.0));
 Shape.area3(List.of(new Circle(10.0),new Square(10.0)));
 Shape.area2(List.of(new Circle(10.0),new Square(10.0)));


    Square qwe = new Square(5.0);
    Shape.add(List.of(new Square(10.0)),  qwe);


  }



}
