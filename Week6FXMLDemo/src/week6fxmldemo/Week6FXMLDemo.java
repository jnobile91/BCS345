package week6fxmldemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Week6FXMLDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    } 
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent gp = FXMLLoader.load(getClass().getResource("LayoutGUI.fxml"));
        
        Scene sn = new Scene(gp, 500, 300);
        stage.setScene(sn);
        stage.show();
    }
}