import easyIO.*;

class Produktet {
  public static void main (String[] args) {
    In tast = new In();
    Out skjerm = new Out();

    skjerm.out("Oppgi verdien til x: ");
    double x = tast.inDouble();

    skjerm.out("Oppgi verdien til y: ");
    double y = tast.inDouble();

    skjerm.outln("Produktet av x og y er " + (x * y));
  }
}
