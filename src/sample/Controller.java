package sample;

import javafx.scene.control.Button;

public class Controller {
    public Button btnRegister;
    public static int a = 10;
    public Controller() {
        System.out.println("hi");
    }

    public void btnRegisterClick() {
        System.out.println("Btn clicked" + a);
    }

    public static void setList(int b) {
        a = b;
        System.out.println("Controller " + a);
    }
}
