import easyIO.*;

class LesTall {
  public static void main (String[] args) {
    In tastatur = new In();
    int a = tastatur.inInt();
    if (a < 5) {
      System.out.println("Tallet er mindre enn 5");
    }
  }
}
