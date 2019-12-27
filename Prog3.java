class Prog3 {

    double x;

  void settX(double y) {
		double z = x;
		x = y;
	}

	void testSettX () {
		double a ;

		for (int i = 1; i <= 10000; i++) {
			a = i;
			settX(a);
		}
	}

  public static void main(String[] args) {

	Prog3 pek = new Prog3();
	pek.testSettX();

	System.out.println("Verdien av x etter 10 000 kall er: "+ pek.x);
   }
}
