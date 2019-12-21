import easyIO.*;

class Poengmetode {
    public static void main(String[] args) {
	     In tastatur = new In();
	     double poeng = poengberegning(tastatur);
	     System.out.println("Hopperen fikk " + poeng + " poeng");
    }
    public static double poengberegning(In tastatur) {
	     double[] stilkarakterer = new double[5];
	     double tabellpunkt = 120;
	     double meterverdi = 1.8;
	     double lengde, poeng;
	     double stilpoeng = 0;
	     double lengdepoeng;
       double stilmin, stilmaks;

	     // leser inn hopplengde
	     System.out.print("Oppgi lengde : ");
	     lengde = tastatur.inDouble();
	     // beregner lengdepoeng
	     lengdepoeng = 60 + (lengde - tabellpunkt)*meterverdi;

	     // leser inn stilkarakterer og summerer dem samtidig
	     for (int i = 0; i < stilkarakterer.length; i ++) {
	        System.out.print("Dommer nr " + (i+1) + " : ");
	        stilkarakterer[i] = tastatur.inDouble();
	        stilpoeng = stilpoeng + stilkarakterer[i];
	     }
	     // finner minste stilpoeng
	     stilmin = stilkarakterer[0];
	     for (int i = 1; i < stilkarakterer.length; i++) {
	        if (stilmin > stilkarakterer[i]) stilmin = stilkarakterer[i];
	     }
 	     // finner st�rste stilpoeng
	     stilmaks = stilkarakterer[0];
	     for (int i = 1; i < stilkarakterer.length; i++) {
	        if (stilmaks < stilkarakterer[i]) stilmaks = stilkarakterer[i];
	     }
	     // trekker fra st�rste og minste i stilpoengene
	     stilpoeng = stilpoeng - stilmin - stilmaks;

	     // beregner totalpoeng
	     return stilpoeng + lengdepoeng;
   }
}
