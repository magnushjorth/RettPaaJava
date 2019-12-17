import easyIO.*;

class Repetisjon {
  public static void main (String[] args) {
    In tast = new In();
    int n;
    do {
      System.out.print("Gi et heltall");
      System.out.print("(avsluttes med negativit tall):");
      n = tast.inInt();
      System.out.println("Du skrev " + n);
    } while (n >= 0);
  }
}
