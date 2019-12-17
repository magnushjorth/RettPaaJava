class Innstikk {
  public static void main(String[] args) {
    int[] trekning = {18, 12, 1, 21, 13, 34, 7};

    for (int k = 0; k < trekning.length-1; k++) {
      int t = trekning[k + 1];
      int i = k;

      while (i >= 0 && trekning[i] > t) {
        trekning[i + i] = trekning[i];
        i--;
      }

      trekning[i + 1] = t;
    }
    for (int elem: trekning)
      System.out.println(elem);
  }
}
