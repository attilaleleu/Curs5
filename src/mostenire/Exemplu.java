package mostenire;


public class Exemplu{
    public static void main(String[] args){

        Persoana p1 = new Persoana();
        Student st1 = new Student("Bogdan",25);

        p1.nume = "Alin";
        p1.varsta = 33;


        /*st1.nume = "Dorel";
        st1.varsta = 22;
        st1.facultate = "Babes Bolyai";*/

        System.out.println("nume: " + p1.nume + " varsta: " + p1.varsta);

        /*System.out.println("nume: " + st1.nume +" varsta: " + st1.varsta + " facultate: " +st1.facultate);*/


        st1.afiseaza();

    }
}