package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControllerMain  {
    public Button btnRegister;
    public TextField txtEmail;

    public static Stage window;
    public static Scene scene1;

    List emails = new ArrayList();
    public Label lblError;
    FXMLLoader loader2;

    @FXML
    public void btnRegisterClick() throws Exception {
        boolean success = getEmail();
        if(success) {
            lblError.setText("Email added");
            txtEmail.setText("");

            loader2 = new FXMLLoader(getClass().getResource("layout2.fxml"));
            Parent root = (Parent) loader2.load();

            // Get controller instances
            ControllerListView controller2 = loader2.getController();
            if(controller2 != null)
            controller2.transferMessage(emails, window, scene1);

            window.setTitle("Emails list");
            window.setScene(new Scene(root));
            window.show();
        } else {
            lblError.setText("Email invalid");
        }
    }

    public static void init(Stage w, Scene s1) {
        window = w;
        scene1 = s1;
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
