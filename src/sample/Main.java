package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Main extends Application {

    public static ListView<String> listView;

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Load layout from fxml files
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("layout1.fxml"));
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("layout2.fxml"));

        // Get controller instances
        ControllerMain controller1 = loader1.getController();
        ControllerListView controller2 = loader2.getController();

        // Define two scenes for the two layouts
        Scene scene1 = new Scene(loader1.load(), 500, 300);
        Scene scene2 = new Scene(loader2.load(), 500, 300);

        // initialize both controllers
        controller1.init(primaryStage, scene2, listView);
        controller2.init(primaryStage, scene1, listView);

        // Show main window - scene1
        primaryStage.setTitle("Register email");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
