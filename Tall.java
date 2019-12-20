class Tall {
  static int t;

  static void giVerdi(int v) {
    t = v;
  }

  static void okT(int okning) {
    t += okning;
  }

  public static void main(String[] args) {
    giVerdi(3);
    System.out.println("Test A t: " + t);
    okT(50);
    System.out.println("Test B t: " + t);
  }
}
