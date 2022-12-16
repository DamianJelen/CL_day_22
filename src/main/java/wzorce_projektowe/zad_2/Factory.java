package wzorce_projektowe.zad_2;

public class Factory implements Creator {
    @Override
    public Product createProduct(String type) {
        Product product = null;
        if("simple".equals(type)) {
            product = new SimpleProduct();
        } else if ("advance".equals(type)) {
            product = new AdvancedProduct();
        } else if ("virtual".equals(type)) {
            product = new VirtualProduct();
        }
        return product;
    }
}
