package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Main extends Application {

    public ListView<String> listView;

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Load layout from fxml files
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("layout1.fxml"));

        // Get controller instances
        ControllerMain controller1 = loader1.getController();

        // Define two scenes for the two layouts
        Scene scene1 = new Scene(loader1.load(), 500, 300);

        // initialize both controllers
        controller1.init(primaryStage, scene1);

        // Show main window - scene1
        primaryStage.setTitle("Register email");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
