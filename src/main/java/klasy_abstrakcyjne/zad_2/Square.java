package klasy_abstrakcyjne.zad_2;

public class Square extends Shape {
    @Override
    public double calculateArea() {
        setArea(Math.pow(2,2));
        return getArea();
    }

    @Override
    public double calculateCircuit() {
        setCircuit(4 * 2);
        return getCircuit();
    }

    @Override
    public String toString() {
        return "Kwadrat o boku 2 - pole = " + calculateArea() + ", obwód = " + calculateCircuit();
    }
}
