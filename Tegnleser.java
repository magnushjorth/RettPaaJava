import easyIO.*;

class Tegnleser {
  public static void main (String[] args) {
    In innfil = new In("minfil.txt");
    int antall = 0;

    while (!innfil.endOfFile()) {
      char tegn = innfil.inChar();
      System.out.print(tegn);
      antall++;
    }

    System.out.println("Antall tegn: " + antall);
  }
}
