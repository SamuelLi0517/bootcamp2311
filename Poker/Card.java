package Poker;

public class Card {

  private Rank rank;

  private Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  @Override
  public String toString() {
    return this.suit + " " + this.rank.getChar() + " ";
  }

}
