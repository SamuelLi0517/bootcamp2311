package DemoBox;

public class Square extends Shape{
  
private double length;

public Square(double length){
  this.length = length;
}

@Override
public double area(){
  return Math.pow(length, 2);
}



}
