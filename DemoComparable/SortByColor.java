package DemoComparable;

import java.util.Comparator;

public class SortByColor implements Comparator<Ball>{
  
@Override
public int compare(Ball b1, Ball b2){
  return b2.getColor().compareTo(b1.getColor());


}
}
