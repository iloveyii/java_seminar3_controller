package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public Button btnRegister;
    public static int a = 10;
    public static Stage window;
    public static Scene scene2;
    public static ListView<String> listView;


    public Controller() {
        System.out.println("hi");
        initializeListView();
    }

    public void btnRegisterClick() throws IOException {
        System.out.println("Btn clicked" + a);
        window.setTitle("Emails list");
        window.setScene(scene2);
        window.show();
    }

    public static void initializeListView() {
        // List View
        listView = new ListView<>();
        listView.getItems().addAll("AAA", "BBBB", "CCCCC");
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    public static void init(Stage w, Scene s2, ListView lv) {
        window = w;
        scene2 = s2;
        listView = lv;
    }
}
