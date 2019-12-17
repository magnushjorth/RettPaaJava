import easyIO.*;

class Omkrets2 {
  public static void main (String[] args) {
    int r = 1;
    double omkrets = 2 * 3.14 * r;
    while (omkrets <= 1000) {
      System.out.println("Omkrets av" + r + " er " + omkrets);
      r++;
      omkrets = 2 * 3.14 * r;
    }
  }
}
