package zadanie_2_2_kopia;

public class Square {

    double bok;

    //konstruktor
    public Square(double bok) {
        this.bok = bok;
    }

    //metoda obliczająca pole kwadrata
    double calculateArea() {
        return Math.pow(bok, 2);
    }


}
