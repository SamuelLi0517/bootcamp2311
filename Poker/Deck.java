package Poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {


  private Card[] cards;

  private Deck(int numberOfCards) {
    this.cards = new Card[numberOfCards];
    int idx = 0;
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        this.cards[idx++] = new Card(r, s);
      }
    }
  }

  public static Deck ofPocker() {
    return new Deck(52);
  }



  public void overhand() {
  }

  
  public void riffle() {

  }

  public static void main(String[] args) {
    Deck deck = Deck.ofPocker();
    deck.overhand();
    deck.overhand();
    deck.overhand();
    deck.overhand();
    deck.overhand();
    deck.overhand();

    System.out.println(Arrays.toString(deck.cards));
  }
}
