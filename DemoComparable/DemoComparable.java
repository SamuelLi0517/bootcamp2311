package DemoComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparable {
  
public static void main(String[] args) {
  
  List<Student> students = new ArrayList<>();
   students.add(new Student(40, "Peter"));
  students.add(new Student(10, "John"));
  students.add(new Student(98, "Ann"));
  students.add(new Student(29, "John"));
// Ann 98 -> John 29 -> John 10 -> Peter 40
System.out.println(students); // 40,10,98,29

// Comparable
Collections.sort(students);
System.out.println(students);// 10,29,40,98

// Comparator
Collections.sort(students, new SortByscore());
System.out.println("SortByscore : "+ students);

Collections.sort(students, new SortByName());
System.out.println("students : "+students);



}
}
