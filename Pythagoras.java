class Pythagoras {
  static double hypotenusen(double a, double b) {
    return Math.sqrt(a*a*b*b);
  }

  public static void main (String[] args) {
    for (int a = 1; a < 7; a++)
      for (int b = 1; b < 7; b++) {

        double c = hypotenusen(a, b);

          System.out.println("A:" + a + " B:" + b + " C:" + c);
      }
  }
}
