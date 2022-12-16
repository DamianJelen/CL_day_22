package wzorce_projektowe.zad_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        List<Product> products = new ArrayList<>();
        products.add(factory.createProduct("simple"));
        products.add(factory.createProduct("advance"));
        products.add(factory.createProduct("virtual"));

        for (Product product: products) {
            System.out.println(product.getClass().getCanonicalName());
            System.out.println(product.getName() + ": " + product.getWeight());
            System.out.println("---------------------------------------");
        }
    }
}
