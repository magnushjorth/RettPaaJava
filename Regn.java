class Regn {
  public static void main
  (String[] param) {
    Beregn1 ber = new Beregn(param);
    System.out.println("Multiplisert: " + ber.mult());
    System.out.println("Adert: " + ber.add());
  }
}

class Beregn {
  private int tall1, tall2;
  public BeregnT (String [] par) {
    tall1 = Integer.parseInt(par[0]);
    tall2 = Integer.parseInt(par[1]);
  }
  public int mult () {
    return tall1 * tall2;
  }
  public int add () {
    return tall1 + tall2;
  }
}
