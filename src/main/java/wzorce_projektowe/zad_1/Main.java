package wzorce_projektowe.zad_1;

public class Main {
    public static void main(String[] args) {
        AppConfig appConfig1 = AppConfig.getInstance();
        AppConfig appConfig2 = AppConfig.getInstance();
        AppConfig appConfig3 = AppConfig.getInstance();
        AppConfig appConfig4 = AppConfig.getInstance();

        System.out.println(appConfig1);
        System.out.println(appConfig2);
        System.out.println(appConfig3);
        System.out.println(appConfig4);
    }
}
