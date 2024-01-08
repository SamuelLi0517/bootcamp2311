package DemoStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DemoStream {

  public static void main(String[] args) throws Exception {
    List<String> strings =
        new ArrayList<>(List.of("hello", "world", "vincent", "oscar"));
    List<String> result = new ArrayList<>();
    // filter out string with length <= 5,
    for (String s : strings) {
      if (s.length() > 5) {
        result.add(s);
      }
    }
    System.out.println(result);

    // stream()
    // list object can invoke stream() method
    List<String> result2 = strings.stream()//
        .filter(s -> s.length() > 5)// Predicate: "s -> s.length() > 5"
        .collect(Collectors.toList());
    System.out.println(result2);

    strings.stream()//
        .filter(s -> s.length() > 5)// Predicate: "s -> s.length() > 5"
        .map(e -> e.charAt(2)).forEach(e -> {
          System.out.println("result 3 : " + e);
        });



    List<Cat> cats = new ArrayList<>(
        List.of(new Cat("ABC", 2), new Cat("DEF", 3), new Cat("IJK", 1)));

    // stream(), name startsWith "D" && age < 2
    // ["IJK", ....]

    // Filter Cat, and return List<Cat>
    List<Cat> result3 = cats.stream()//
        .filter(e -> e.getName().startsWith("D") && e.getAge() < 2)//
        .collect(Collectors.toList());

    System.out.println(result3);

    // Filter Cat, and return List<String>
    // ["IJK", ....]
    List<String> catNames = cats.stream()//
        .filter(e -> e.getName().startsWith("I") && e.getAge() < 2)//
        .map(e -> e.getName())//
        .collect(Collectors.toList());

    System.out.println(catNames);

    // Convert List<Cat> to List <Dog>
    List<Dog> dogs = cats.stream()//
        .map(e -> {
          return new Dog(e.getAge());
        }).collect(Collectors.toList());

    System.out.println(dogs);

    List<Dog> dogs1 = cats.stream()//
        .filter(e -> {
          if (e.getAge() < 3)
            return true;
          return false;
        }).map(e -> {
          return new Dog(e.getAge());
        }).collect(Collectors.toList());

    List<Dog> dogs2 = new ArrayList<>();
    for (Cat cat : cats) {
      if (cat.getAge() < 3)

        dogs2.add(new Dog(cat.getAge()));
    }
    System.out.println("dogs = " + dogs2);

    List<Staff> staffs = new ArrayList<>(
        List.of(new Staff("John", 20000.0d), new Staff("John", 15000.0d)));

    double sum = 0.0d;
    for (Staff staff : staffs) {
      sum += staff.getSalary();
    }

    double max = -1;
    for (Staff staff : staffs) {
      if (staff.getSalary() > max)
        max = staff.getSalary();
    }
    System.out.println("max salary = " + max);

    // strem
    List<Double> total = staffs.stream() //
        .map(e -> e.getSalary())//
        .collect(Collectors.toList());// terminate opereation

    double sumOfSalary = staffs.stream()//
        .map(e -> e.getSalary())//
        .mapToDouble(d -> d)// intermediate operation
        .sum();// terminate opereation
    System.out.println("sumOfSalary = " + sumOfSalary);

    long countOfStaff = staffs.stream()//
        .map(e -> {// intermediate operation
          System.out.println("hello");
          return e;
        }).count(); // terminate opereation

    System.out.println("count=" + countOfStaff);

    // toSet()
    List<Cat> cats2 = new ArrayList<>(
        List.of(new Cat("DEF", 3), new Cat("DEF", 3), new Cat("IJK", 1)));
    Set<Cat> result4 = cats2.stream()//
        .collect(Collectors.toSet());

    System.out.println(result4);

    // distinct -> remove duplicated elements
    List<Cat> result5 = cats2.stream()//
        .distinct()//
        .filter(e -> e.getAge() >= 3)//
        .collect(Collectors.toList());
    System.out.println(result5);// [Cat(name=DEF, age=3)]

    // Prepare 2 customers, each of them has his own addresses
    List<Customer> customers = new ArrayList<>();
    Customer customer1 = new Customer();
    customer1.addAddress("Sample Address Line 1", "Sample Address Line 2");
    customer1.addAddress("ABCD EFG", "XYZ IJK");

    Customer customer2 = new Customer();
    customer2.addAddress("123456", "78910");

    customers.add(customer1);
    customers.add(customer2);

    // Retrieve all addresses from a list of customers
    List<Customer.Address> addresses = customers.stream()//
        .flatMap(c -> c.getAddresses().stream()) //
        .collect(Collectors.toList());

    System.out.println(addresses);

    List<List<Customer.Address>> listOfAddress = customers.stream() //
        .map(c -> c.getAddresses())// [[], [], [] ....]
        .collect(Collectors.toList());

    System.out.println(listOfAddress);

    // List<List<Integer>
    List<List<Integer>> integersList = new ArrayList<>(//
        List.of(//
            new ArrayList<>(List.of(1, 3, 5)), //
            new ArrayList<>(List.of(2, 4, 6))//
        ));

    System.out.println("After integersList : " + integersList);

    // List<Integer>
    List<Integer> integers = integersList.stream() //
        .flatMap(e -> e.stream())//
        .sorted((i1, i2) -> i2.compareTo(i1))//
        .collect(Collectors.toList());

    System.out.println(integers);

    // List<String>
    List<Cat> catList = new ArrayList<>(List.of(new Cat("Jenny", 14),
        new Cat("Karis", 8), new Cat("Andy", 14)));

    // Return a list of cat names, with age > 9, order by the age of cats,
    List<String> catNames2 = catList.stream() //
        .filter(c -> c.getAge() > 9)//
        .sorted((c1, c2) -> { //
          return c1.getAge() > c2.getAge() ? 1 : -1;
        }).map(c -> c.getName()).collect(Collectors.toList());

    System.out.println(catNames2);

    boolean hasKaris = catList.stream() //
        .anyMatch(e -> "Karis".equals(e.getName()));
    System.out.println(hasKaris);

    Map<Boolean, List<Cat>> catMap = catList.stream()
    .collect(Collectors.partitioningBy(cat -> cat.getAge() >= 10));

System.out.println(catMap);

// For-each
int x =100;
for (Cat cat : cats){
System.out.println(x);
x = 10;
}

int m = 0;
cats.stream()//
.forEach(e -> {
  System.out.println(e.getAge());
  // System.out.println(x); // error, No read operation on the variable outside the stream.
});

// sum up all cat's age
int sumUpAge = cats.stream() //
.mapToInt(e -> e.getAge())// make  sure getAge() is int
        .sum();//
System.out.println("sumUpAge = " + sumUpAge);

Stream<Cat> sc = Stream.of(new Cat("ABC", 9), new Cat("IJK", 10));
List<Cat> result11 = sc.filter(e -> e.getAge() >= 10).collect(Collectors.toList());

Stream<Cat> sc2 = Stream.ofNullable(null);// new ArrayList<>().stream()
sc2.forEach(e -> {
  System.out.println("hello");
});

//Stream<Cat> sc4 = Stream.of(null);
// error, you cannot pass null value into Stream.of() directly

Stream<Cat> sc3 = Stream.empty(); // similar to Stream.ofNullable(null); 



  }

 
  }

