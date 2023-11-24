package DemoNestedloop;

public class DemoNestedloop {
  
  public static void main(String[] args){
    for (int i = 0; i < 5; i++){ // 0,1,2,3,4
System.out.println("*");
//System.out.print("*");
    }
// *****

//when i=0, j -> 0,1,2,3
//when i=1, j -> 0,1,2,3
//when i=2, j -> 0,1,2,3
//when i=3, j -> 0,1,2,3
//when i=4, j -> 0,1,2,3


for(int i = 0; i < 4; i++){
 // if(i != 42){
 // continue;
//}
  System.out.println("i" + i ); // i = 0

  for(int j = 0; j < 3; j++){
    //if(j>1){
      //break;
   // }

   if( i >1 && j >1){
    break;
   }
    System.out.println("i=" + i + ", j" + j);
  }
}

//Example
//i < 5
//j <4
//System.out.println();
//System.out.print();
for(int i = 0; i < 5; i++){// row (because you added println())
  for(int j = 0; j < 4 - i; j++){ // column -> variable length
    System.out.print("*");
    
  }
  System.out.println("*");
}
//****
//*** 
//**
//*
//

String str = "abcdefghijk";
// ++count
// nested loop, 4 character in a row
// abcd
// efgh
// ijk

for(int j = 0; j < str.length() ; j++){
System.out.print(str.charAt(j));
//if (++count % 4 == 0)
if((j + 1) % 4 ==0 || j == str.length() - 1){
System.out.println();
}
}


// Example
for(int i = 0; i < 4; i++){
for(int j = 0; j < 3; j++){
    // *** *** *** *** *** *** 
System.out.print("*");
 }
 System.out.print(" ");
}

int cnt = 0;
for(int i = 0; i < 6; i++){
  if(++cnt % 6 == 0){
System.out.println("*** ");
  }
}
  }

}

 
  

