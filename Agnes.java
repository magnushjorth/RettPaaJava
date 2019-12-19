import easyIO.*;

class Agnes {
  public static void main (String[] args) {
    String agnes = "Agnes i senga";
    String ny = "";

    for (int x = agnes.length() - 1; x <= agnes.length() && x >= 0; x--) {
      char b = agnes.charAt(x);
      ny += b;
    }
    System.out.println(ny);

    In tastatur = new In();
    String ord = tastatur.inLine();
    System.out.println(ord.toUpperCase());
  }
}
