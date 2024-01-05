package Demofunction;

@FunctionalInterface
public interface SuperConsumer<T, U, V> { // T, U, V can be diienent or same types

  void accept(T t, U u, V v);

  
}
