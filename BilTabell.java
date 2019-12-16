import easyIO.*;

class BilTabell {
  public static void main (String[] args) {
    final int bredde = 12;
    Out skjerm = new Out();

    skjerm.out("Bilmerke", bredde);
    skjerm.out("Årsmodell", bredde, Out.CENTER);
    skjerm.outln("Reg.nr.", bredde);

    skjerm.outln("------------------------------");

    skjerm.out("Mercedes", bredde);
    skjerm.out(1999, bredde, Out.CENTER);
    skjerm.outln("UE65660", bredde);

    skjerm.out("Ford", bredde);
  	skjerm.out("1987", bredde, Out.CENTER);
  	skjerm.outln("ZE95523");

    skjerm.out("Toyota", bredde);
  	skjerm.out("2003", bredde, Out.CENTER);
  	skjerm.outln("DK53401");

    skjerm.outln("------------------------------");
  }
}
