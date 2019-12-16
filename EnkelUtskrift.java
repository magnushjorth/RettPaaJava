import java.io.*;

class EnkelUtskrift {
  public static void main (String[] args) {
    try {
      PrintWriter f = new PrintWriter(new FileWriter("minfil.txt"));

    double pi = 3.14;
    boolean b = true;

    f.print("En linje ");
    f.println("med " + "tekst");
    f.println(pi + 14);
    f.println(b && false);

    f.close();
  } catch (IOException e) {
    System.out.println("Skriving til fil mislyktes!");
  }
  }
}
