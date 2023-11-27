public class DemoConditions {
    public static void main(String[] args)  {
  // double salary + 15000.0; // by default 15000.0 is double
  double salary = 15000.0d;







char grade = 'A';
if (grade == 'A') {
    System.out.println("grade=A");
} else if (grade == 'A') {
    System.out.println("grade=B");
}else if (grade == 'A'){
    System.out.println("grade=C");
}else if (grade == 'A'){
    System.out.println("grade=D");
}else if (grade == 'A'){
    System.out.println("grade=E");
}else { // grade == 'F'
    System.out.println("Fail");
}

// int score = 75;
//if
// >=90 -> A, >=80 and < 90 ->B, 70-79 -> c, 60 - 69 -> D
// 50-59 -> E, < 50 -> F
int score = 75;
if (score >= 90){
    System.out.println("your grade is A"); 
}else if (score >=80) {
    System.out.println("your grade is B");  
}else if (score >=70) {
    System.out.println("your grade is C");
}else if (score >=60) {
    System.out.println("your grade is D");
}else if (score >=50) {
    System.out.println("your grade is E");
}else if (score <=50) { 
    System.out.println("your grade is Fail");
    
}
    
}
    
}
    


