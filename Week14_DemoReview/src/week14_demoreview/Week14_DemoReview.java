package week14_demoreview;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Week14_DemoReview extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Label lbl = new Label("Lbl");
        lbl.setLayoutX(10);
        lbl.setLayoutY(30);
        
        Button btn = new Button("Click me");
        btn.setLayoutX(10);
        btn.setLayoutY(90);
        //btn.setOnAction((t) -> lbl.setText("Joe"));
        
        TextField tf = new TextField();
        tf.setLayoutX(10);
        tf.setLayoutY(190);
        
        btn.setOnAction((t) -> {
           try {
           int num = Integer.parseInt(tf.getText());
           lbl.setText("The number is: " + num);
           }
           catch(Exception e) {
               System.err.println("ERROR: Input is not an integer.");
           }
        });
        
        Group gp = new Group(lbl, btn, tf);
        Scene sn = new Scene(gp, 500, 300);
        stage.setScene(sn);
        stage.show();
    }
}

/*
class MyLstner implements EventHandler<ActionEvent> {
    
    @Override
    public void handle(ActionEvent t) {
        System.out.println("Joe");
    }
}
*/