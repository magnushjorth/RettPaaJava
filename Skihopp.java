import easyIO.*;

class Skihopp {
  public static void main(String[] args) {
  	In tastatur = new In();
  	double[] stilkarakterer = new double[5];
  	double tabellpunkt = 120;
  	double meterverdi = 1.8;
  	double lengde, poeng;
  	double stilpoeng = 0;
  	double lengdepoeng;
  	double stilmin, stilmaks;

  	System.out.print("Oppgi lengde : ");
  	lengde = tastatur.inDouble();

  	lengdepoeng = 60 + (lengde - tabellpunkt)*meterverdi;

  	for (int i = 0; i < stilkarakterer.length; i ++) {
  	    System.out.print("Dommer nr " + (i+1) + " : ");
  	    stilkarakterer[i] = tastatur.inDouble();
  	    stilpoeng = stilpoeng + stilkarakterer[i];
  	}

  	stilmin = stilkarakterer[0];
  	for (int i = 1; i < stilkarakterer.length; i++) {
  	    if (stilmin > stilkarakterer[i]) stilmin = stilkarakterer[i];
  	}

  	stilmaks = stilkarakterer[0];
  	for (int i = 1; i < stilkarakterer.length; i++) {
  	    if (stilmaks < stilkarakterer[i]) stilmaks = stilkarakterer[i];
  	}

  	stilpoeng = stilpoeng - stilmin - stilmaks;

  	poeng = stilpoeng + lengdepoeng;
  	System.out.println("Hopperen fikk " + poeng + " poeng");
  }
}
