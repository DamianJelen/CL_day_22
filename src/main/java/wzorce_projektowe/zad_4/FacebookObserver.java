package wzorce_projektowe.zad_4;

public class FacebookObserver implements Observer {
    @Override
    public void update(String title) {
        System.out.println("FB observer: " + title);
    }
}
