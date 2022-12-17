package wzorce_projektowe.zad_4;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.setTitle("Some title");
        post.setContent("Some content");

        post.attach(new FacebookObserver());
        post.attach(new TwitterObserver());
        post.share();
    }
}
