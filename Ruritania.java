import easyIO.*;

class Ruritania {
  public static void main (String[] args) {
    In tastatur = new In();
    int inntekt = tastatur.inInt();
    double skatt;
    if (inntekt < 10000) {
      skatt = inntekt * 0.10;
      System.out.println("Skatt: " + skatt);
    } else {
      skatt = 10000 * 0.10 + (inntekt - 10000) * 0.3;
      System.out.println("Skatt: " + skatt);
    }
  }
}
