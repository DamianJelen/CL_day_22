package klasy_abstrakcyjne.zad_1;

public class Train extends Vehicle {
    public int trackWidth;

    public Train(Integer maxSpeed, String model, int trackWidth) {
        super(maxSpeed, model);
        this.trackWidth = trackWidth;
    }

    public int getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }

    @Override
    String getSound() {
        return "Ciuch, ciuch, ciuch, ciuch";
    }
}
