package sample;

import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerListView  implements Initializable {
    public Button btnBack;
    public ListView<String> listView;
    public Stage window;
    public Scene scene1;


    public void transferMessage(List emails, Stage w, Scene s1) {
        System.out.println("Message : " + emails.toString());

        for(int i = 0; i < emails.size(); i++) {
            System.out.println(emails.get(i));
            listView.getItems().add(emails.get(i).toString());
        }
        window = w;
        scene1 = s1;
    }

    public void btnBackClick() throws Exception {

        if(window != null) {
            window.setScene(scene1);
            window.show();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {}
}
