package klasy_abstrakcyjne.zad_1;

public class Car extends Vehicle{
    public String type;

    public Car(Integer maxSpeed, String model, String type) {
        super(maxSpeed, model);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    String getSound() {
        return "brum, brum, brum, brum";
    }
}
