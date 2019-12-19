class Utskrift2 {
  public static void main (String[] args) {
    Tall t = new Tall();
    System.out.println("Vi er i main-metoden");
    t.skriv();
    System.out.println("Vi er tilbake i main-metoden");
  }
}

class Tall {
  int k = 4;

  int treGanger() {
    int m = k * 3;
    return m;
  }

  void skriv() {
    System.out.println("Skriv kaller treGanger: " + treGanger());
  }
}
