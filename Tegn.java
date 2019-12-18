import easyIO.*;

class Tegn {
  public static void main (String[] args) {
    In tastatur = new In();
    System.out.print("Skriv inn et ord: ");
    String s = tastatur.inLine();
    char c = s.charAt(1);
    System.out.print("Tegnet med indek 1 i teksten\"");
    System.out.println(s + "\" er ´" + c + "´");
  }
}
