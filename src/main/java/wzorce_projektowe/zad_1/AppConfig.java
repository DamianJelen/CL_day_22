package wzorce_projektowe.zad_1;
// Singleton
public class AppConfig {
    private static AppConfig INSTANCE;
    private AppConfig() {}
    public static synchronized AppConfig getInstance() {
        INSTANCE = INSTANCE == null ? new AppConfig() : INSTANCE;
        return INSTANCE;
    }
}
