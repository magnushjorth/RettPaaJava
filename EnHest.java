class EnHest {
  public static void main (String[] args) {
    String sitat = "En hest, mitt kongerike for en hest!";
    String søketekst = "en hest";
    char søketegn = ',';

    int tekstindeks = sitat.indexOf(søketekst);
    int tegnindeks = sitat.indexOf(søketegn);

    System.out.println(sitat);
    System.out.println("\"" + søketekst + "\"" + " starter ved indeks " + tekstindeks);
    System.out.println("'" + søketegn + "'" + " har indeks " + tegnindeks);
  }
}
