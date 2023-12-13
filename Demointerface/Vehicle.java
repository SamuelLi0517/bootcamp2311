package Demointerface;

public interface Vehicle { // "Vehicle" is an abstract word.
  
// interface has no instance variable
int x = 10;// implicitly final

// interface is a contract with behaviors (abstract methods)

// if a class implements an interface, it has to implement all its abstract methods
// (all or nothing)

boolean start();// implicitly "public abstract" method

boolean stop();

boolean accleratre();

boolean brake();

// After java 8
//default instance method
default boolean test(){
  return false;
}

public static void main(String[] args) {
  // x -> static?
  System.out.println(Vehicle.x);// 10
}

}
