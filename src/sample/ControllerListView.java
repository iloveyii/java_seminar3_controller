package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ControllerListView {
    public Button btnBack;
    public ListView<String> listView;
    public static Stage window;
    public static Scene scene1;
    public static List b = new ArrayList();

    public static void init(Stage w, Scene s1, ListView lv, List a) {

        window = w;
        scene1 = s1;
        // listView = lv;
        System.out.println("Controller List");
        b = a;
        System.out.println(b);

    }

    public void btnBackClick() throws IOException {
        /* window.setTitle("Register email");
        window.setScene(scene1);
        window.show();
        System.out.println("Controller 2"); */
        btnBack.setText("new");
        listView.getItems().addAll("a", "bbbb");
        System.out.println(b);
    }
}
