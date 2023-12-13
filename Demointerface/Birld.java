package Demointerface;

public interface Birld {

void fly();

  default public String speak(){
    return "i can fly";
  }
}
