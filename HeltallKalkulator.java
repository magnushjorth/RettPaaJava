import easyIO.*;

class HeltallKalkulator {
  public static void main (String[] args) {
    In tastatur = new In();
    int tall = tastatur.inInt();
    int teller = 0;
    int forrige = 0;
    int sum;
    while (teller <= tall) {
      sum = teller + forrige;
      forrige = sum;
      System.out.println(teller + "   " + sum);
      teller++;
    }
  }
}
