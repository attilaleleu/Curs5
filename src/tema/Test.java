package tema;

/**
 * Created by leleluattila on 18/01/16.
 */
public class Test {
    public static void main(String[] args) {
        Instrument ins1 = new Pian("Pian", "Schimmel", 2, 230);
        Instrument ins2 = new Trompeta("Trompeta", "Bach", 1);

        ins1.afiseaza();
        ins2.afiseaza();

    }
}
