package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerListView {
    public Button btnBack;
    public static ListView<String> listView;
    public static Stage window;
    public static Scene scene1;

    public static void init(Stage w, Scene s1, ListView lv) {
        window = w;
        scene1 = s1;
        listView = lv;
    }

    public void btnBackClick() throws IOException {
        window.setTitle("Register email");
        window.setScene(scene1);
        window.show();
        System.out.println("Controller 2");
    }
}
