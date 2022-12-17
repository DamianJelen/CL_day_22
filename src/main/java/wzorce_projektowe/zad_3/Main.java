package wzorce_projektowe.zad_3;

public class Main {
    public static void main(String[] args) {
        AtmApi atmApi = new AtmApi();
        atmApi.recharge();
        atmApi.getLoan();
    }
}
