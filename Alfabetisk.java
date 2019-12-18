import easyIO.*;

class Alfabetisk {
  public static void main (String[] args) {
    In tast = new In();
    Out skjerm = new Out();
    skjerm.out("Gi to navn: ");
    String s = tast.inWord();
    String t = tast.inWord();
    if (s.compareTo(t) < 0) {
      skjerm.out(s + "\n" + t);
    } else if (s.compareTo(t) > 0) {
      skjerm.out(t + "\n" + s);
    } else {
      skjerm.out("Like");
    }
  }
}
