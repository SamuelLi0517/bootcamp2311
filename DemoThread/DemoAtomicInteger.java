package DemoThread;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomicInteger {
  
  AtomicInteger atmIn;

  public DemoAtomicInteger(){
    atmIn = new AtomicInteger();
  }

public static void main(String[] args) {
  DemoAtomicInteger demoAtomicInteger = new DemoAtomicInteger();
  int result = demoAtomicInteger.atmIn.incrementAndGet();
  System.out.println(result);// 1

  Runnable AtomicIncrement = () -> {
    for(int i = 0; i < 1_000_000; i++){
      demoAtomicInteger.atmIn.incrementAndGet();
    
    }
  };

  demoAtomicInteger.atmIn.set(0);// reset to 0
 Thread worker1 = new Thread(AtomicIncrement);
 Thread worker2 = new Thread(AtomicIncrement);

worker1.start();
worker2.start();

try{
  worker1.join();
  worker2.join();
}catch (InterruptedException e){

}

System.out.println(demoAtomicInteger.atmIn.get());




}




}
