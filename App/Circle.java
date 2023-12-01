package App;

public class Circle {

  private double radius;
// Empty Constructor
  public Circle(){

  }
// Argument Constructor
public Circle(double radius) {
  this.radius = radius;
}
// Getter
public double getRadius(){
  return this.radius;
}
// setter
public void setRadius(double radius){
  this.radius = radius;
}
public double diameter(){
  

}
public double area(){


}


// main - new a circle
public static void main(String[] args){
Circle circle = new Circle();// radius = 0.0
circle.setRadius(3.2d);
System.out.println(circle.getRadius());

Circle circle2 = new Circle(3.4d);
System.out.println(circle2.getRadius());// 3.4



}




}
