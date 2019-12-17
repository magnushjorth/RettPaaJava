import easyIO.*;

class Primtallssjekker {
  public static void main (String[] args) {
    int[] primtall = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
    Out skjerm = new Out();
    In tastatur = new In();
    skjerm.out("Oppgi et heltall: ");
    int x = tastatur.inInt();
    int i = 0;
    boolean funnet = false;
    while (i < primtall.length && !funnet) {
      if (primtall[i] == x) {
        funnet = true;
      }
      i++;
    }
    if (funnet) {
      skjerm.outln(x + "ligger i posisjon: " + (i - 1));
    } else {
      skjerm.outln(x + "fins ikke i arrayen");
    }
  }
}
