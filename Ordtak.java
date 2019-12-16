import easyIO.*;

class Ordtak {
  public static void main (String[] args) {
    In tast = new In();
    Out skjerm = new Out();

    skjerm.out("Skriv inn et ordtak: ");
    String ordtak = tast.inLine();

    Out utfil = new Out("ordtak.txt", true);
    utfil.outln(ordtak);

    utfil.close();
  }
}
