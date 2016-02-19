package tema;

/**
 * Created by leleluattila on 18/01/16.
 */

public class Instrument {
    String nume;
    String marca;
    int portative;

    Instrument() {

    }

    Instrument(String nume, String marca, int portative) {
        this.nume = nume;
        this.marca = marca;
        this.portative = portative;
    }

    void afiseaza() {
        System.out.print("Numele instrumentului: " + nume + " " + marca + ". Se canta pe " + portative + " portative.");
    }
}

class Pian extends Instrument {
    int corzi;

    Pian(String nume, String marca, int portative, int corzi) {
        super(nume, marca, portative);
        this.corzi = corzi;
    }

    void afiseaza() {
        super.afiseaza();
        System.out.println(" Acest " + nume + " " + marca + " are " + corzi + " corzi.");
    }
}

class Trompeta extends Instrument {

    Trompeta(String nume, String marca, int portative) {
        super(nume, marca, portative);
    }

    void afiseaza() {
        super.afiseaza();
        System.out.println(" Instrument de suflat.");
    }
}