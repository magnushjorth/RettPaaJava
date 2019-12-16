import easyIO.*;

class Valutakalkulator {
  public static void main (String[] args) {
    In tast = new In();
    Out skjerm = new Out();

    skjerm.out("Oppgi kronebeløp: ");
    double x = tast.inDouble();

    double dollar;
    double pund;
    double svenske;

    dollar = x / 9.03;
    pund = x / 12.03;
    svenske = x / 0.96;

    System.out.println("USD: " + dollar + "\nEngelske pund: " + pund +
    "\nSvenske kroner: " + svenske);
  }
}
