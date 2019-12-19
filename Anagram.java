import easyIO.*;

class Anagram {
  public static void main (String[] args) {
    In tastatur = new In();
    Out skjerm = new Out();
    String ny = "";

    skjerm.out("Skriv inn et ord: ");
    String ord = tastatur.inLine();

    for (int x = ord.length() - 1; x <= ord.length() && x >= 0; x--) {
      char b = ord.charAt(x);
      ny += b;
    }
    if (ord.equalsIgnoreCase(ny)) {
      System.out.println("\"" + ord + "\" er et anagram");
    } else {
      System.out.println("\"" + ord + "\" er ikke et anagram");
    }
  }
}
