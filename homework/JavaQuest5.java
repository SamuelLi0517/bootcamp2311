
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
int character = 0;

    // Use a loop to count the target of character in a String.
    // code here
int count[] = new int[26];
for (int i = 0; i < str.length(); i++){
  count[str.charAt(i)- 1]++;
  character = count[str.charAt(i)-1];
}
System.out.println(character);
    // if found, print "We found 3 character c in the String."
    // if not found, print "Not Found."
    // code here

  }
}