package interfejsy.zad_1;

public class UrlMain {
    public static void main(String[] args) {
        Url standardUrl = new StandardUrl();
        System.out.println(standardUrl.getParam("param1", "url_example?param1=99&param2=string"));

        Url extenderUrl = new ExtenderUrl();
        System.out.println(extenderUrl.getParam("param2", "url_example/param1.55/param2.byte"));
    }
}
