class Utskrift {
  public static void main (String[] args) {
    Skriver sk = new Skriver();
    System.out.println("Kari Ludt");
    sk.skrivUt();
    System.out.println("Per Olsen");
    sk.skrivUt();
  }
}

class Skriver {
  int alder = 0;

  void skrivUt() {
    alder = alder + 20;
    System.out.println("Alder: " + alder);
  }
}
