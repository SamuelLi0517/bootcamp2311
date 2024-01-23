package DemoThread;

public class Calculator {
  
  private int x;

  private synchronized void decrease() {
this.x--;
  }
  // Multi-thread environment encounter atomic problem (read-write issue on share resource)
  // One of the approaches to solve is "synchronized"
  // When a thread accessing a "synchronized"

  public synchronized void increment(){
    this.x++;
  }

  public void increment2(){
    this.x++;
  }

public static void main(String[] args) {
  Calculator calculator = new Calculator();

  // Example 1: 
  Thread vincent = new Thread(() -> {
for(int i = 0; i < 100_000; i++){
  calculator.increment();
}
  });
 Thread oscar = new Thread(() -> {
  for( int i = 0; i < 100_000; i++){
    calculator.increment();
  }
 });

vincent.start();
oscar.start();

try {
  vincent.join();
  oscar.join();
} catch (InterruptedException e) {

}

System.out.println("calculator.x = " + calculator.x);

calculator.x = 0; // reset


  vincent = new Thread(() -> {
for(int i = 0; i < 100_000; i++){
  calculator.increment2();
}
  });
  oscar = new Thread(() -> {
  for( int i = 0; i < 100_000; i++){
    calculator.increment2();
  }
 });

 vincent.start();
 oscar.start();

 try{
  vincent.join();
  oscar.join();
 }catch(InterruptedException e){

 }
 System.out.println("calculator.x = " + calculator.x);

// Example 3: increment with syzchized and decrease with syzchized
calculator.x = 0;

  vincent = new Thread(() -> {
for(int i = 0; i < 100_000; i++){
  calculator.increment();
  if(i==95000)
  System.out.println(" + ");
}
  });
  oscar = new Thread(() -> {
  for( int i = 0; i < 100_000; i++){
          if(i==1)
  System.out.println(" ---- ");
    calculator.decrease();
      if(i==95000)
  System.out.println(" - ");

  }
 });

 vincent.start();
 oscar.start();

 try{
  vincent.join();
  oscar.join();
 }catch(InterruptedException e){

 }
 System.out.println("calculator.x = " + calculator.x);

}



}