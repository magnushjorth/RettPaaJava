class Prog1 {
  public static void main (String[] args) {
    ABC pek = new ABC(14);

    pek.dobbelt();
    pek.dobbelt();
    pek.skrivVerdi();
  }
}

class ABC {
  int verdi;

  ABC(int i) {
    verdi = i;
  }

  void dobbelt() {
    verdi += verdi;
  }

  void skrivVerdi() {
    System.out.println("Verdi: " + verdi);
  }
}
