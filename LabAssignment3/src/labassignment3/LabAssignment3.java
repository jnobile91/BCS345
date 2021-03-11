package labassignment3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LabAssignment3 extends Application {

    public static void main(String[] args) {
        launch(args);
    } 
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent gp = FXMLLoader.load(getClass().getResource("House.fxml"));
        
        Scene sn = new Scene(gp, 1000, 1000);
        stage.setTitle("A House");
        stage.setScene(sn);
        stage.show();
    }
}