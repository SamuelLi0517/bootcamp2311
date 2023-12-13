package Demointerface;

public class Taxi implements Vehicle {

  private int speed;

  private int capacity;

  public static final int MAX_SPEED = 100;

  public Taxi(){

  }

  private Taxi (int speed) {
    this.speed = speed;
  }

  //getter, setter
private Taxi(int speed, int capacity){

}

public static Taxi small(){
  return new Taxi(0, 4);
}


public static Taxi big(){
  return new Taxi(0, 5);
}

  public int getSpeed(){
    return this.speed;
  }


  public int getCapacity(){
    return this.capacity;
  }

  public void setCapcity(int capacity){
this.capacity = capacity;
  }
  
  // Method
  public boolean isOn(){
return this.speed > 0;
  }

  public boolean isStopped(){
return this.speed < 0;
  }

  public boolean isOverMaxSpeed(){
return this.speed <= 0;
  }
  
@Override // Let the compiler to validate the relationship of inheritance
public boolean start(){
  if (isOn())
  return false;
  this.speed = 10;
  return true;

}

@Override
public boolean stop(){
  if(isStopped())
  return false;
  this.speed = 0;
  return true;
}

@Override
public boolean accleratre(){
  if(isStopped())
  return false;
this.speed += 10;
if (isOverMaxSpeed())
this.speed = Taxi.MAX_SPEED;
return true;
}

@Override
public boolean
 brake(){
  if(isStopped())
  return false;
this.speed -= 10;
return true;
}

public static void main(String[] args) {
  Taxi t1 = Taxi.small();

}


}
