class Personregister {
  public static void main(String[] args) {
    Person p1 = new Person("Per", 20);
    Person p2 = new Person("Guri", 21);

    p1.skrivData();
    p2.skrivData();
  }
}

class Person {
  String navn;
  int alder;

  Person(String n, int a) {
    navn = n;
    alder = a;
  }

  void skrivData() {
    System.out.println("Navn: " + navn);
    System.out.println("Alder: " + alder);
  }
}
