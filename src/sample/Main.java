package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Parent root = FXMLLoader.load(getClass().getResource("layout1.fxml"));
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("layout1.fxml"));
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("layout2.fxml"));
        Controller controller = loader1.getController();
        controller.setList(103);
        controller.setWindowLoader(primaryStage, loader2);

        primaryStage.setTitle("Register email");
        primaryStage.setScene(new Scene(loader1.load(), 500, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
