package App;

public class Cake {

  private int cakeNumber;

  private String cakeName;

  private String taste;

  private String customerName;

  private double price;

  public Cake(){

  }
  public Cake(String cakeName) {
    this.cakeName = cakeName;

  }
  public Cake(String cakeName,int cakeNumber,String taste,String customerName,double price) {
    this.cakeName = cakeName;
    this.cakeNumber = cakeNumber;
    this.taste = taste;
    this.customerName = customerName;
    this.price = price;
  }
  
  public void setName(String cakeName) {
    this.cakeName = cakeName;
  }

  public void setNumber(int cakeNumber) {
    this.cakeNumber = cakeNumber;
  }
   public void setTaste(String taste) {
    this.taste = taste;
  }
  public void setcustomerName(String customerName) {
    this.customerName = customerName;
  }
  public String getName() {
    return this.cakeName;
  }
  public int getNumber() {
    return this.cakeNumber;
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