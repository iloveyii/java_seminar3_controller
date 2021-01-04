package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;

public class ControllerMain {
    public Button btnRegister;
    public static int a = 10;
    public static Stage window;
    public static Scene scene2;
    public static ControllerListView controller;
    public ListView<String> listView;


    public ControllerMain() {
        System.out.println("hi");
        initializeListView();
    }

    public void btnRegisterClick() throws IOException {


        // listView = new ListView<>();
        listView.getItems().addAll("AAA", "BBBB", "CCCCC");
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        System.out.println("Controller Main" );
        List a = listView.getItems();
        System.out.println(a);


        controller.init(null, null, listView, a);

        window.setTitle("Emails list");
        window.setScene(scene2);
        window.show();
    }

    public static void initializeListView() {
        // List View

    }

    public static void init(Stage w, Scene s2, ListView lv, ControllerListView c) {
        window = w;
        scene2 = s2;
        // listView = lv;
        controller = c;
    }
}
