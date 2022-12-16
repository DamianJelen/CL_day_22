package wzorce_projektowe.zad_2;

public class SimpleProduct implements Product {
    @Override
    public String getName() {
        return "Prosty produkt";
    }

    @Override
    public String getWeight() {
        return "Lekki";
    }
}
