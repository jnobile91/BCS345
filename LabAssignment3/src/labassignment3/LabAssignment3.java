/*
Joseph Nobile
Lab Assignment #3
3/12/2021
*/
package labassignment3;

// Imports all necessary libraries.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LabAssignment3 extends Application {

    public static void main(String[] args) {
        // Launches the application.
        launch(args);
    } 
    
    @Override
    public void start(Stage stage) throws Exception {
        
        // Calls the FXML file that contains the info for the "House" image.
        Parent gp = FXMLLoader.load(getClass().getResource("House.fxml"));
        
        // Creates a new scene with dimensions 1000x1000.
        Scene sn = new Scene(gp, 1000, 1000);
        
        // Sets window title to "A House".
        stage.setTitle("A House");
        
        // Creates the stage using the previously defined scene "sn".
        stage.setScene(sn);
        
        // Launches stage.
        stage.show();
    }
}