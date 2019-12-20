class Variable {
  int k = 3;

  public static void main (String[] args) {
    Test t = new Test();
    int k = 2;
    t.skriv();
    System.out.println("c) main: t.k er:" + t.k); // 1
  }
}

class Test {
  int k = 1;
  void skriv() {
    System.out.println("a) verdien av t.k:" + k); // 1
    int k = 4;
    System.out.println("b) verdien av k:" + k); // 4
  }
}
