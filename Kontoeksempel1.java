class Kontoeksempel1 {
  public static void main(String[] args) {
    int s = 500;

    Konto k1 = new Konto();

    k1.settInn(s);
    System.out.println("A: Min saldo er = " + k1.giSaldo());

    k1.settInn(1000);
    System.out.println("B: Min saldo er = " + k1.giSaldo());

    k1.settInn(44);
    System.out.println("C: Min saldo er = " + k1.giSaldo());
  }
}

class Konto {
  int saldo;

  void settInn(int innskudd) {
    saldo += innskudd;
  }

  int giSaldo() {
    return saldo;
  }
}
