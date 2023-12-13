package Demointerface;

public interface Human extends Birld, Tiger {

  String speak();
  
  default public String talk(){
    return "i can speak ";
  }
}
