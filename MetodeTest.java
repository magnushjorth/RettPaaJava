class MetodeTest {
  static void m1(int k) {
    System.out.println("Metoden M1 før kallet, k: " + k);
    k -= 1;
    m2(k);
    System.out.println("Metode M1 etter kallet, k: " + k);
  }

  static void m2(int k) {
    System.out.println("Metoden M2 før kallet, k: " + k);
    k -= 1;
    m3(k);
    System.out.println("Metode M2 etter kallet, k: " + k);
  }

  static void m3(int k) {
    System.out.println("Metoden M3 før kallet, k: " + k);
    k -= 1;
    m4(k);
    System.out.println("Metode M3 etter kallet, k: " + k);
  }

  static void m4(int k) {
    System.out.println("Metoden M4 før kallet, k: " + k);
    k -= 1;
    if (k > 0) m1(k);
    System.out.println("Metode M4 etter kallet, k: " + k);
  }

  public static void main (String[] args) {
    m1(10);
  }
}
