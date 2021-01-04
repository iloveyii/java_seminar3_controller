package sample;

import javafx.fxml.FXML;
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

    @FXML
    public void initialize() {
        System.out.println("second");
    }

    public static void init(Stage w, Scene s1, ListView lv, List a)  {

        window = w;
        scene1 = s1;
        // listView = lv;
        System.out.println("Controller List");

        b = a;
        System.out.println(b);
        // w.setOnShown(e-> System.out.println("Scene shown" + e.toString()));



    }

    public void btnBackClick() throws IOException {
        /* window.setTitle("Register email");
        window.setScene(scene1);
        window.show();
        System.out.println("Controller 2"); */

        for(int i = 0; i < b.size(); i++) {
            System.out.println(b.get(i));
            listView.getItems().add(b.get(i).toString());
        }
        listView.getItems().addAll("a", "bbbb");
        System.out.println(b);
    }
}
