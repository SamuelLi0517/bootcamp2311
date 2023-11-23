package DemoConditions.DemoSwitch;

public class DemoSwitch {
   public static void main(String[] args) {

     // if, else-if -> comparison and logical operators
  //switch: single value comparison (==)
  char vipGrade = 'G'; // G/S/N
  double discount = 0.0d; // Sliver(S) -> 10%, Gold(G) -> 20%
   switch (vipGrade){
    case 'G':
    discount += 0.01d;
    case 'S':
    discount += 0.01d;
    case 'N':
    System.out.println("discount=" + discount);


    // with break
    switch (vipGrade){
      case 'G':
    discount += 0.02d;
    break;
    case 'S':
    discount += 0.01d;
    break;
    case 'N':
    default: // other characters
    }

   }

 
    }
    
  


}
