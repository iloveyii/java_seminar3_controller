package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public Button btnRegister;
    public static int a = 10;
    public static Stage window;
    public static FXMLLoader loader2;

    public Controller() {
        System.out.println("hi");
    }

    public void btnRegisterClick() throws IOException {
        System.out.println("Btn clicked" + a);
        window.setTitle("Emails list");
        window.setScene(new Scene(loader2.load(), 500, 300));
        window.show();
    }

    public static void setList(int b) {
        a = b;
        System.out.println("Controller " + a);
    }

    public static void setWindowLoader(Stage w, FXMLLoader l2) {
        window = w;
        loader2 = l2;
    }
}
