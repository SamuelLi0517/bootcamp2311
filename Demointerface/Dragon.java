package Demointerface;

public class Dragon implements Human {
  
public static void main(String...args){
Dragon dragon = new Dragon();
System.out.println(dragon.speak());
dragon.fly();
dragon.run();
}

@Override
public void run() {
  System.out.println("i can run");
}

@Override
public void fly() {
  System.out.println("i can fly");
}

@Override
public String talk(){
  return "";
}

@Override
public String speak() {
  return "WoW";
  
}
}
