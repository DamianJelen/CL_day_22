package wzorce_projektowe.zad_2;

public class VirtualProduct implements Product {
    @Override
    public String getName() {
        return "Wirtualny produkt";
    }

    @Override
    public String getWeight() {
        return "Nieznana";
    }
}
