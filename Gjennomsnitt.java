class Gjennomsnitt {
  static double gjennomsnitt(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    int nysum;
    nysum = sum / a.length;
    return nysum;
  }

  public static void main (String[] args) {
    int[] primtall = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    double snitt = gjennomsnitt(primtall);
    System.out.println("Gjennomsnittet for Array: " + snitt);
  }
}
