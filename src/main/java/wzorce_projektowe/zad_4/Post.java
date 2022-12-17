package wzorce_projektowe.zad_4;

public class Post implements Subject{
    private String content;
    private String title;

    public void share() {
        System.out.println("UPDATE OBSERVERS");
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        System.out.println("Attach observer");
        observer.update(getTitle());
    }

    @Override
    public void detach(Observer observer) {
        System.out.println("Detach observer" + this.getClass().getName());
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notify");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
