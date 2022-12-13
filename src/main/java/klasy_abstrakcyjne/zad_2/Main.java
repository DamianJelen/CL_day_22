package klasy_abstrakcyjne.zad_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Rectangle());
        shapeList.add(new Square());
        shapeList.add(new Circle());

        for (Shape shape : shapeList) {
            System.out.println(shape.toString());
        }
    }
}
