package week4gui_firstapp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.GroupLayout;

public class Week4GUI_FirstApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Button btn1 = new Button("Click me");
        //Group gp = new Group(btn1);
        
        Group gp = new Group();
        
        Scene sn = new Scene(gp, 1000, 1000);
        
        stage.setScene(sn);
        stage.setTitle("Our first GUI");
        stage.show();
        
    }
}