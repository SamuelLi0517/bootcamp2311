
public class JavaQuest5 {
  /**
   * 
   * When target = 'c', the expected output:
   * We found 3 character c in the String.
   * 
   * When target = 'z', the expected output:
   * Not Found.
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic
    char target1= 'z';
    int character = 0;
   int character1 = 0;
    // Use a loop to count the target of character in a String.
    // code hereint count[] = new int[26];
for(int i = 0; i < str.length(); i++){
if(str.charAt(i) == target){
character++;
} else if (str.charAt(i) == target1){

character1 ++;}
}




    // if found, print "We found 3 character c in the String."
    // if not found, print "Not Found."
    // code here
if( character > 0){
  System.out.println("We found " + character + " character " + target + " in the String.");
} else System.out.println("Not Found.");
if (character1 > 0){
  System.out.println("We found " + character1 + " character " + target1 + " in the String.");
} else System.out.println("Not Found.");
}



  }
