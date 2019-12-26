class Prog1 {

    public static void main(String[] args) {

	   ABC pek ;

		pek = new ABC();
		pek.i = 14;
		System.out.println("Verdien av \"i\" i pek-objektet er:" + pek.i);
		pek.dobbelt();
		pek.dobbelt();
		System.out.println("Verdien av \"i\" i pek-objektet er:" + pek.i);
   }
}
