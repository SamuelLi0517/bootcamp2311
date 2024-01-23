package DemoThread;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class HashTableDemo {
  
  public static void main(String[] args) throws InterruptedException {
    // HashTable (thred safe) vs HashMap(non-thred safe)
    // put()

Hashtable<String, String> stringTable = new Hashtable<>();
stringTable.put("John", "English");
stringTable.put("John", "Maths");
System.out.println(stringTable.size());

Map<String, String> stringMap = new HashMap<>();

Runnable hashTablePut = () -> {
  for(int i = 0; i < 1_000_000; i++){
   stringTable.merge("x", "s", (oldVal, newVal) -> oldVal.concat((newVal)));
  }
 };

 Runnable  hashMapPut = () -> {
  for(int i = 0; i < 1_000_000; i++){
  stringTable.merge("x", "s", (oldVal, newVal) -> oldVal.concat((newVal)));
  }
 };

Thread worker1 = new Thread(hashTablePut);
   Thread worker2 = new Thread(hashTablePut);
worker1.start();
worker2.start();
worker1.join();
worker2.join();
System.out.println(stringTable.get("x").length());// 200000

worker1 = new Thread(hashMapPut);
worker2 = new Thread(hashMapPut);
worker1.start();
worker2.start();
worker1.join();
worker2.join();
System.out.println(stringMap.get("x").length());




  }
}
