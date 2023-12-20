package DemoArrayList;

public class LinkedList {
  
  private Node head;

  public LinkedList(){

  }

  public void add(int value){
if(head == null){
head = new Node(value);
return;
  }

// while loop until, then setnext()
Node current = this.head;
while(current.next() != null){
  current = current.next();
}
current.setNext(new Node(value));
}

@Override
public String toString(){
  StringBuilder sb = new StringBuilder("LinkedList[");
  Node curNode = this.head;
  while (curNode != null){
    sb.append(curNode.getValue()).append(", ");
    curNode = curNode.next();
  }
  return sb.append("]").toString();
}

// remove(int value)
public void remove(int value){
  // Early Return
  if(this.head == null)
  return;
  if(this.head.getValue() == value){
    this.head = this.head.next();
  }
  Node curNode = this.head;
  while(curNode != null){
    if(curNode.getValue() == value){
      if(curNode.next() == null){
        curNode.prev().setNext(null);
      }
      curNode.prev().setNext(curNode.next());
    }
    curNode = curNode.next();
  }
}

public static void main(String[] args) {
  LinkedList l1 = new LinkedList();
System.out.println(l1.toString());
l1.add(3);
System.out.println(l1.toString());
l1.add(100);
System.out.println(l1.toString());
l1.remove(100);
System.out.println(l1.toString());
l1.remove(150);
System.out.println(l1.toString());
l1.remove(3);
System.out.println(l1.toString());
}












}


