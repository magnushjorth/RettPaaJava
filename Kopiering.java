import easyIO.*;

class Kopiering {
  public static void main (String[] args) {
    In innfil = new In("original.txt");
  	Out utfil = new Out("kopi.txt");

    while (!innfil.endOfFile()) {
               String linje = innfil.readLine();
               utfil.outln(linje);
          }

          innfil.close();
  	utfil.close();
  }
}
