package DemoThread;

public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    StringBuffer sbf = new StringBuffer();
    sbf.append("hello").append("world");
    System.out.println(sbf.toString());// helloworld

// StringBuilder vs StringBuffer
// Runnable -> 2 Threads append "X" 1_000_000 times -> StringBuilder
// Runnable -> 2 Threads append "X" 1_000_000 times -> StringBuffer

Runnable appendStringBuilder = new Thread(() -> {
  for(int i = 0; i < 100_000; i++){
    sb.append("x");
  }
    });

   Runnable appendStringBuffer = new Thread(() -> {
      for(int i = 0; i < 100_000; i++){
        sb.append(("x"));
      }
        });


Thread worker1 = new Thread(appendStringBuilder);
Thread worker2 = new Thread(appendStringBuilder);

sb.setLength(0);
worker1.start();
worker2.start();

try{
  worker1.join();
  worker2.join();
}catch(InterruptedException e){
  

}

System.out.println(sb.length());


}
}
