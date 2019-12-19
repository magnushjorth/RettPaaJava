import easyIO.*;

class Sortering {
  public static void main (String[] args) {
    In tastatur = new In();
    Out skjerm = new Out();

    skjerm.out("Skriv inn to ord: ");
    String ord1 = tastatur.inLine();
    String ord2 = tastatur.inLine();

    if (ord1.compareTo(ord2) < 0) {
      skjerm.out(ord1 + "\n" + ord2);
    } else if (ord1.compareTo(ord2) > 0) {
      skjerm.out(ord2 + "\n" + ord1);
    } else {
      skjerm.out("Like");
    }
  }
}
