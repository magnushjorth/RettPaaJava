import easyIO.*;

class Alder {
  public static void main (String[] args) {
    In tastatur = new In();

    System.out.print("Skriv inn din alder: ");
    String sitat = tastatur.inLine();
    int alder = Integer.parseInt(sitat);

    alder += 1;
    System.out.println("Din alder er nå " + alder);
  }
}
