package Demointerface;

public interface Tiger {

void run();

  default public String speak(){
    return "i can run";
  }

  
}
