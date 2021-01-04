package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class SecondController implements Initializable {
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

    @FXML
    public void btnBackClick() throws Exception {

        if(window != null) {
            window.setScene(scene1);
            window.show();
        }
    }

    @FXML
    private void btnRemoveClick() {
        ObservableList<String> emails;
        emails = listView.getSelectionModel().getSelectedItems();

        if(emails != null && emails.size() > 0) {
            try {
                for(String email : emails) {
                    System.out.println(email);
                    if(listView.getItems().contains(email)) {
                        listView.getItems().remove(email);
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {}
}
