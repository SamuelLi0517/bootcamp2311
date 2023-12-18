package Poker;

public enum Rank {

  RA('A'), //
  R2('2'), //
  R3('3'), //
  R4('4'), //
  R5('5'), //
  R6('6'), //
  R7('7'), //
  R8('8'), //
  R9('9'), //
  R10('0'), //
  JACK('J'), //
  QUEEN('Q'), //
  KING('K'),//
  ;

  char c;

  private Rank(char c) {
    this.c = c;
  }

  public String getChar() {
    return String.valueOf(this.c);
  }

}
