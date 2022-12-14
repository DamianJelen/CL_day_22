package interfejsy.zad_2;

public class Main {
    public static void main(String[] args) {
        Moveable[] moveablesArr = new Moveable[3];
        moveablesArr[0] = new Cat();
        moveablesArr[1] = new Car();
        moveablesArr[2] = new Person();

        for (Moveable moveable: moveablesArr) {
            moveable.start();
        }
    }
}
