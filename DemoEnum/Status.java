package DemoEnum;

public enum Status {
  
ORDERD('O'), //
SHIPPED('S'),// 
COMPLETED('C'),//
;

private char val;


private Status(char val){ // Status('O') -> Status 
  this.val = val;
}

public char getVal(){
  return this.val;
}





}
