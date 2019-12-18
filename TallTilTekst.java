class TallTilTekst {
  public static void main (String[] args) {
    int i = 14;
    double pi = 3.1415;
    String s1 = "" + i; // Konkatenering
    String s2 = String.valueOf(pi); // Konvertering

    if (s2.indexOf(s1) >= 0) {
      System.out.print("Tallet " + pi);
      System.out.println( " innholder sifrene " + s1);
    }
  }
}
