import easyIO.*;

class Identisk {
  public static void main (String[] args) {
    String svar = "To be or not to be";
    In tastatur = new In();

    System.out.print("Skriv inn Shakespare sitat: ");
    String sitat = tastatur.inLine();
    if (sitat.equalsIgnoreCase(svar)) {
      System.out.println("Gratulerer! Du gjettet riktig sitat.");
    } else {
      System.out.println("Beklager. Riktig sitat er:");
      System.out.println(svar);
    }
  }
}
