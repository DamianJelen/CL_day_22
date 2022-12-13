package klasy_abstrakcyjne.zad_2;

public class Circle extends Shape {
    @Override
    public double calculateArea() {
        setArea(Math.round(Math.PI * Math.pow(3,2) * 100));
        return getArea() / 100;
    }

    @Override
    public double calculateCircuit() {
        setCircuit(Math.round(2 * Math.PI * 3 * 100));
        return getCircuit() / 100;
    }

    @Override
    public String toString() {
        return "Koło o promieniu 3 - pole = " + calculateArea() + ", obwód = " + calculateCircuit();
    }
}
