package klasy_abstrakcyjne.zad_1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(150, "Lanos", "Compact");
        System.out.println(car.getMaxSpeed());
        System.out.println(car.getType());
        System.out.println(car.getModel());
        System.out.println(car.getSound());
        System.out.println(car.toString());

        Train train = new Train(200, "TGV", 500);
        System.out.println(train.toString());
    }
}
