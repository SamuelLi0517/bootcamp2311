package DemoPriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;
import DemoQueue.SortByDesc;

public class DemoPriorityQueue {
  
public static void main(String[] args) {
  Queue<String> qs = new PriorityQueue<>(new SortByDesc());

qs.add("hello");
qs.add("a");
qs.add("x");

System.out.println(qs);


}
}
