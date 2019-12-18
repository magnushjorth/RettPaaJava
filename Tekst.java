import easyIO.*;

class Tekst {
  public static void main (String[] args) {
    In tastatur = new In();
    System.out.print("Skriv inn setning: ");
    String tekst = tastatur.inLine();

    int lenge = tekst.length();

    System.out.println("\"" + tekst + "\"" + " består av " + lenge + " tegn");
    System.out.println("Store bokstaver " + tekst.toUpperCase());

    System.out.println("Skriv inn to ord");
    String s1 = tastatur.inLine();
    String s2 = tastatur.inLine();

    if (s1.equals(s2)) {
      System.out.println("De er like");
    }
  }
}
