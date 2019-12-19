import easyIO.*;

class TallOversetter {
  public static void main (String[] args) {
    In tastatur = new In();
    Out skjerm = new Out();

    String[] sifre = {"null", "en", "to", "tre", "fire", "fem", "seks",
    "syv", "åtte", "ni"};

    skjerm.out("Skriv inn et tall: ");
    String tekst = tastatur.inLine();
    int tall = Integer.parseInt(tekst);

    System.out.println(tall + " : " + sifre[tall]);

  }
}
