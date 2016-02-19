package mostenire;


public class Persoana {
    String nume;
    int varsta;

    Persoana(){
        //System.out.println("Constructor pers");
    }

    Persoana(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;

    }
}

class Student extends Persoana {
    //String facultate;

    Student(String nume, int v) {
        super(nume, v);
        //System.out.println("constructor student");

    }

    void afiseaza(){
        System.out.println("Persoana: "+ nume+ " varsta: " + varsta);
    }
}

