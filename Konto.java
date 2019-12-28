class Konto {
  private int nummer = 0;
  private int kontonummer, saldo;
  private String eier, adresse;

  Konto() {
    saldo = 0;
    bestemKontonummer();
  }

  Konto(String e, String adr, int s) {
    eier = e;
    adresse = adr;
    saldo = s;
    bestemKontonummer();
  }

  void bestemKontonummer() {
    nummer++;
    kontonummer = nummer;
  }

  void settInn(int innskudd) {
    saldo += innskudd;
  }

  boolean taUt(int uttak) {
    if (uttak > saldo)
      return false;
    return true;
  }

  boolean overforTilAnnenKonto(Konto tilKonto, int belop) {
    if (taUt(belop)) {
      tilKonto.settInn(belop);
      return true;
    } else {
      return false;
    }
  }

  int giSaldo() {
    return saldo;
  }

  String getEier() {
    return eier;
  }

  String getAdresse() {
    return adresse;
  }

  void setEier(String e) {
    eier = e;
  }

  void setAdresse(String a) {
    adresse = a;
  }
}
