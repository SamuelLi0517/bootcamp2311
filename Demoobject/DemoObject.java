package Demoobject;

public class DemoObject {// extends Object implicitly

  public void run(){

  }
  
public static void main(String[] args) {
 
  // Example 1: new DemoObject()
  DemoObject do2 = new DemoObject();
Object o2 = do2;// upcast

System.out.println(o2.toString());
// compile time -> o2 is a object ref with the type of object. Able to itself method
// runtime must be Okay if we just ues upcast

// Example 2: new Object()
 Object o1 = new Object();
  System.out.println(o1.toString()); // java.lang.Object@7344699f
  DemoObject do1 = (DemoObject) o1;// downcast -> runtime error
// runtime -> once do1 found the object (new Object()), there is NO run() nethod.
// -> error

// compile time -> do1 is a object ref with the type of DemoObject. Able to call run().
do1.run();


// getClass()
DemoObject do3 = new DemoObject();
if (do3.getClass() == DemoObject.class){
  System.out.println("it is DemoObject class");
}

Class <?> clas = do3.getClass(); 
System.out.println(clas.getName()); // class DemoObject



// equals() hashcode()
String s1 = "hello";
String s2 = "abc";
System.out.println(s1 == s2); // check if same object?
System.out.println(s1.equals(s2));// check if same value?


}


}



































