package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControllerMain {
    public Button btnRegister;
    public TextField txtEmail;
    public static int a = 10;
    public static Stage window;
    public static Scene scene2;
    public static ControllerListView controller;
    public ListView<String> listView;
    List emails = new ArrayList();
    public Label lblError;


    public ControllerMain() {
        System.out.println("hi");
        initializeListView();
    }

    public void btnRegisterClick() throws IOException {
        boolean success = getEmail();
        if(success) {
            lblError.setText("Email added");
            txtEmail.setText("");
            controller.init(null, null, listView, emails);

            window.setTitle("Emails list");
            window.setScene(scene2);
            window.show();
        } else {
            lblError.setText("Email invalid");
        }
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
}
