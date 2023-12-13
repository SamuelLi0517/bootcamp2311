package Demointerface;

import java.util.Arrays;

public class StringQueue implements Addable, Pollable {

  private String[] queue;

  public StringQueue() {
    this.queue = new String[0];
  }

  @Override
  public void add(String s) {
    addTail(s);
  }

  @Override
  public String poll() {
    return pollHead();
  }

  public boolean isEmpty() {
    return this.queue.length == 0;
  }

  public void clear() {
    this.queue = new String[0];

  }

  @Override
  public String peek() {// read the head, not null
    return this.queue[0];
  }

  @Override
  public String pollHead() {
    if (this.queue.length == 0)
      return null;
    String head = this.queue[0];
    int idx = 0;
    String[] newQueue = new String[this.queue.length - 1];
    for (int i = 1; i < this.queue.length; i++) {
      newQueue[idx++] = this.queue[i];
    }
    this.queue = newQueue;
    return head;
  }


  private void addTail(String s) {
    String[] newQueue = new String[this.queue.length+ 1];
    int idx = 0;
    for (String str : this.queue) {
      newQueue[idx++] = str;
    }
    newQueue[newQueue.length - 1] = s;
    this.queue = newQueue;
  }

  @Override
  public String toString() {
    return Arrays.toString(this.queue);
  }

  public static void main(String[] args) {
    StringQueue sq = new StringQueue();
    sq.add("hello");
    sq.add("ABC");
    System.out.println(sq);
    System.out.println(sq.poll());
        System.out.println(sq);

  }
}
