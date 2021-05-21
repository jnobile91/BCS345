/*
    Joseph Nobile
    Final Exam - 5/12/2021
    Calculate the average of 3 numbers
*/
package javaexamq2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController {

    @FXML
    private TextField num1;
    
    @FXML
    private TextField num2;
    
    @FXML
    private TextField num3;
    
    @FXML
    private Button avgButton;
    
    @FXML
    private Label solutionLabel;

    @FXML
    public void calcAVG(ActionEvent event) {
        
        // Converts text fields into type double
        double x = Double.parseDouble(num1.getText());
        double y = Double.parseDouble(num2.getText());
        double z = Double.parseDouble(num3.getText());
        
        // Initializes average variable
        double avg = (x + y + z) / 3;
        
        // Declares a string to eventually convert from double avg
        String calcAVG;
        
        // Converts double avg into string calcAVG
        calcAVG = Double.toString(avg);
        
        // Sets calculated average in the text box
        solutionLabel.setText("The average is : " + calcAVG);
    }
}