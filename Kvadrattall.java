class Kvadrattall {
  public static void main (String[] args) {
    int i = 1;
    int kvadrat = i * i;
    while (kvadrat <= 1000) {
      System.out.println("Kvadratet av " + i + " er " + kvadrat);
      i = i + 1;
      kvadrat = i * i;
    }
  }
}
