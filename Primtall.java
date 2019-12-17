class Primtall {
  public static void main (String[] args) {
    int[] primtall = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    int sum = 0;
    for (int element : primtall) {
      sum += element;
    }
    System.out.println("Summen av tallene er: " + sum);
  }
}
