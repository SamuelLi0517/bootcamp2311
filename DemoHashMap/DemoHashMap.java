package DemoHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoHashMap {
  
public static void main(String[] args) {
  
List<String> strings = new ArrayList<>();

// Map:
// 1.  key value pair -> <key, value>
// 2. key must be unique
Map<String, Integer> ageBook = new HashMap<>();

// put()
ageBook.put("John", 20);
ageBook.put("John", 13);// Update 20 -> 13, because "John" is the key which exists in the map
ageBook.put("Mary", 3);// add a new entry

System.out.println(ageBook.size());// 2

for(Map.Entry<String, Integer> entry : ageBook.entrySet()){
  System.out.println(entry.getKey() + " " + entry.getValue());
}

// get()
System.out.println(ageBook.get("Mary")); // 3
System.out.println(ageBook.get("John")); // 13

Map<Integer, String> Ticket = new HashMap<>();
Ticket.put(90, "SAM");
Ticket.put(30, "SAM");
Ticket.put(477, "TOM");

System.out.println(Ticket.size());// 3

for(Map.Entry<Integer, String> entry : Ticket.entrySet()){
  System.out.println(entry.getKey() + " " + entry.getValue());
}

System.out.println(Ticket.get("SAM"));
System.out.println(Ticket.get(90));


// Map<String, Book>
//Map<String, Book>
// put book
// get book name


}



}
