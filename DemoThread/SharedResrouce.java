package DemoThread;

public class SharedResrouce {
  
private boolean hasDate = false;// Shared Resource



// 1.both 2 thread starts at the same time
// 2. producer thread -> "synchronized produce" -> acqire the lock
// 3. Cosumer thread is waiting outside the door of "synchronized consume"
// 4. Producer thread -> producing the data -> notify (wake up other threads)
// 5. Producer thread -> wait() -> release the lock
// 6. Consumer thread -> get the lock -> get into "synchronized consume()"

// 1. waiting thread has to be notified by someone
// 2. synchronized instance method can only be accessed when the thread has the key (lock)

public synchronized void produce() throws InterruptedException {
while(!hasDate){
  System.out.println("produce -> self wait...");
  wait(); // Object.wait()notify()
}
System.out.println("Thred ID:" + Thread.currentThread().getId() + ";Producing data ...");
Thread.sleep(2000); // simulate produce process...
hasDate = true;
System.out.println("Produced Data");
notify(); // notify consumer thread to proceed
Thread.sleep(500);
}

public synchronized void consume() throws InterruptedException{
while(!hasDate){
  System.out.println("consume -> self wait...");
  wait(); // wait() control current Thread to sleep
}
System.out.println("Thred ID:" + Thread.currentThread().getId() + "Consuming data ...");
Thread.sleep(2000); // simulate produce process...
hasDate = false;
System.out.println("Consumed Data");
notify();
Thread.sleep(500);
}

public static void main(String[] args) {
  SharedResrouce sharedResrouce = new SharedResrouce();

  Runnable produceDate = () -> {
    while (true){
    try{
      sharedResrouce.produce();
    } catch (InterruptedException e){

    }
  }
  };

Runnable consumeDate = () -> {
while (true){
    try{
      sharedResrouce.consume();
    } catch (InterruptedException e){

    }
  }
  };






}

}
