package klasy_abstrakcyjne.zad_2;

public class Rectangle extends Shape {
    @Override
    public double calculateArea() {
        setArea(2 * 4);
        return getArea();
    }

    @Override
    public double calculateCircuit() {
        setCircuit(2 * 2 + 2 * 4);
        return getCircuit();
    }

    @Override
    public String toString() {
        return "Prostokąt o bokach 2 i 4 - pole = " + calculateArea() + ", obwód = " + calculateCircuit();
    }
}
