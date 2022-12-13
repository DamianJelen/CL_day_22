package klasy_abstrakcyjne.zad_1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(150, "Lanos", "Compact");
        Train train = new Train(200, "TGV", 500);

        Vehicle[] vehicle = {car, train};

        for (Vehicle veh : vehicle) {
            System.out.println(veh.toString());
            System.out.println("=============================");
        }
    }
}
