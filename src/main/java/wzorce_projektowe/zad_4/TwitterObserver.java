package wzorce_projektowe.zad_4;

public class TwitterObserver implements Observer {
    @Override
    public void update(String title) {
        System.out.println("Twitter observer: " + title);
    }
}
