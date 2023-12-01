package App;

public class Pokemon {

  private int number;

  private String name;

  public Pokemon() {

  }

  public Pokemon(String name) {
    this.name = name;
  }
  public Pokemon(String name,int number) {
    this.name = name;
    this.number=number;
  }
  public void setName(String name) {
    this.name = name;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getName() {
    return this.name;
  }

  public int getNumber() {
    return this.number;
  }

public static void main(String[] args) {
    Pokemon p1 = new Pokemon();
    p1.setName("pikachu"  );
    p1.setNumber(1);

   System.out.println( p1.getName());
      System.out.println( p1.getNumber());
//
    Pokemon p2 = new Pokemon("ihiuh",2);
       System.out.println( p2.getName());
      System.out.println( p2.getNumber());


  }
}
