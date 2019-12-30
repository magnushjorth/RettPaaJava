class B {
  A apek ;

    void kallA() {
		System.out.print(" kallA i B --");
		if (apek != null) apek.skrivUt();
		else
		System.out.println("FEIL:  apak == null");
	}


    void skrivUt() {
    	System.out.println(" Utskrift fra skrivUt i B,");
    }
}

class A {
	  B bpek ;

		void kallB() {
			System.out.print(" kallB i A --");
			if (bpek != null) bpek.skrivUt();
			else
			System.out.println("FEIL:  apak == null");
		}
	   void skrivUt() {
	    	System.out.println(" Utskrift fra skrivUt i A");
	    }
	}

class AB {

		public static void main ( String [] args) {

			A a1 = new A();
			B b1 = new B();
			a1.bpek = b1;
			b1.apek = a1;

			a1.skrivUt();
			a1.kallB();
			b1.skrivUt();
			b1.kallA();
		}
}
