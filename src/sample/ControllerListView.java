package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerListView  implements Initializable {
    public Button btnBack;
    public ListView<String> listView;
    public static Stage window;
    public static Scene scene1;
    public static List b = new ArrayList();
    public List z = new ArrayList();


    public void transferMessage(List emails) {
        System.out.println("Message : " + emails.toString());

        for(int i = 0; i < emails.size(); i++) {
            System.out.println(emails.get(i));
            listView.getItems().add(emails.get(i).toString());
        }
    }

    public static void init(Stage w, Scene s1, ListView lv, List a)  {

        window = w;
        scene1 = s1;
        // listView = lv;
        System.out.println("Controller List");

        b = a;
        System.out.println(b);
        // w.setOnShown(e-> System.out.println("Scene shown" + e.toString()));

        if(w != null)
        System.out.println(w.getScene());
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
        // listView.getItems().addAll("a", "bbbb");
        System.out.println(b);
        if(window != null)
            System.out.println(window.getScene());

        System.out.println("I received message from main" + z.size());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
