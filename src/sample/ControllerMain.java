package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControllerMain  {
    public Button btnRegister;
    public TextField txtEmail;
    public static int a = 10;
    public static Stage window;
    public static Scene scene2;
    public static ControllerListView controller;
    public ListView<String> listView;
    List emails = new ArrayList();
    public Label lblError;
    FXMLLoader loader2;



    @FXML
    public void btnRegisterClick() throws Exception {
        boolean success = getEmail();
        if(success) {
            lblError.setText("Email added");
            txtEmail.setText("");
            controller.init(window, scene2, listView, emails);


            loader2 = new FXMLLoader(getClass().getResource("layout2.fxml"));
            Parent root = (Parent) loader2.load();

            // Get controller instances
            ControllerListView controller2 = loader2.getController();
            if(controller2 != null)
            controller2.transferMessage(emails);

            Stage s = new Stage();
            s.setScene(new Scene(root));
            s.show();

            /*
            window.setTitle("Emails list");
            window.setScene(scene2);
            window.show(); */
        } else {
            lblError.setText("Email invalid");
        }
    }

    public static void init(Stage w, Scene s2, ListView lv, ControllerListView c) {
        window = w;
        scene2 = s2;
        // listView = lv;
        controller = c;
    }

    private boolean getEmail() {
        String email = txtEmail.getText();
        // Validate
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean valid = matcher.matches() ? true :false;

        System.out.println("Email valid : " + valid);
        if(valid) {
            emails.add(email);
            return true;
        }

        return false;
    }

    private void loadSceneAndSendMessage() {
        try {
            //Load second scene
            loader2 = new FXMLLoader(getClass().getResource("layout2.fxml"));
            //Get controller of scene2
            ControllerListView scene2Controller = loader2.getController();
            //Pass whatever data you want. You can have multiple method calls here
            if(scene2Controller != null) {
                emails.add("email added before message");
                scene2Controller.transferMessage(emails);
            }

            //Show scene 2 in new window
            window.setScene(new Scene(loader2.load(), 600, 300));
            window.setTitle("Second Window");
            window.show();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
