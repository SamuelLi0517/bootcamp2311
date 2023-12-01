package App;

public class Cake {

  private int number;

  private String name;

  private String taste;

  public Cake(){

  }
  public Cake(String name) {
    this.name = name;

  }
  public Cake(String name,int number,String taste) {
    this.name = name;
    this.number=number;
    this.taste = taste;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  public void setNumber(int number) {
    this.number = number;
  }
   public void setTaste(String taste) {
    this.taste = taste;
  }
  public String getName() {
    return this.name;
  }
  public int getNumber() {
    return this.number;
  }
   public String getTaste() {
    return this.taste;

}
public static void main(String[] args) {
  Cake p1 = new Cake();
    p1.setName("Chocolate");
    p1.setNumber(1);
    p1.setTaste("Sweet");

    Cake p2 = new Cake();
    p2.setName("New York Cheese Cake");
    p2.setNumber(2);
    p2.setTaste("Acid");

    Cake p3 = new Cake();
    p3.setName("Tiramisu ");
    p3.setNumber(3);
    p3.setTaste("Sweet");

  System.out.println( p1.getName());
      System.out.println( p1.getNumber());
      System.out.println(p1.getTaste());

      System.out.println( p2.getName());
      System.out.println( p2.getNumber());
      System.out.println(p2.getTaste());

      System.out.println( p3.getName());
      System.out.println( p3.getNumber());
      System.out.println(p3.getTaste());
}
}