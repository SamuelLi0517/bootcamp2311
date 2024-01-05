package DemoStaticNestedClass;

import App.Calculator;

public final class DemoStaticNestedClass { // Outer Class

  public static class Calculator{ // nested Class

// attributes
    private int x;

    // constructor
  public Calculator(int x){
    this.x = x;
  }

    // instance method
    public void add(int y){
       this.x += y;
    }
  
public int getX(){
return this.x;
}

  
}
}