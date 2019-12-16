import easyIO.*;

class Pyramideformatering {
  public static void main (String[] args) {
    Out skjerm = new Out();
    int bredde = 10;

    skjerm.outln("a", bredde, Out.CENTER);
    skjerm.outln("a a", bredde, Out.CENTER);
    skjerm.outln("a b a", bredde, Out.CENTER);
    skjerm.outln("a c c a", bredde, Out.CENTER);
  }
}
