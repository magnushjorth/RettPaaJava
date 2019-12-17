class Maksverdi {
  public static void main (String[] args) {
    int[] tall = {1, 11, 7, 8, 4, 9, 3};
    int maks = tall[0];
    for (int i = 0; i < tall.length; i++) {
      if (maks < tall[i]) {
        maks = tall[i];
      }
    }
    System.out.println("Maksverdi: " + maks);
  }
}
