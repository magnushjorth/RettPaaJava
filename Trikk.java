import easyIO.*;

class Trikk {
  public static void main (String[] args) {
    In tastatur = new In();
    int alder = tastatur.inInt();
    if (alder < 12 || alder > 64) {
      System.out.println("Personen kan få reise med trikken til halv pris");
    } else {
      System.out.println("Personen har ikke krav på halv pris");
    }
  }
}
