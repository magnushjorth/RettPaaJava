import easyIO.*;

class LesBrukernavn {
  public static void main (String[] args) {
    In innfil = new In("Brukerinfo.txt");
    Out utfil = new Out("NyBrukerinfo.txt");

    while (!innfil.lastItem()) {
      String fnr = innfil.inWord();
      String brukernavn = innfil.inWord();
      String passord = innfil.inWord();

      utfil.out(brukernavn, 15);
      utfil.outln(fnr);
    }

    innfil.close();
    utfil.close();
  }
}
