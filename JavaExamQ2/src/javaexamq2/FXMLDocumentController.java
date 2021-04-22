/*
    Joseph Nobile
    Problem Solving Exam - 4/21/2021
    Calculate the GCD of 2 numbers
*/
package javaexamq2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController {

    @FXML
    private TextField num1;
    
    @FXML
    private TextField num2;
    
    @FXML
    private Button gcdButton;

    @FXML
    private TextField solutionBox;

    @FXML
    public void calcGCD(ActionEvent event) {
        
        // Converts text field 'num1' into data type int
        double d1 = Double.parseDouble(num1.getText());
        int x = (int)d1; 
        
        // Converts text field 'num2' into data type int
        double d2 = Double.parseDouble(num2.getText());
        int y = (int)d2; 
        
        int gcdOfXY = 0;
        
        // Loops through every value up to highest value of x and y
        for (int i = 1; i <= x && i <= y; i++) {
            
            // Checks to see if the remainder of x or y divided by i
            // is zero, then sets gcdOfXY to i. It will iterate through
            // the highest value of x or y and continue assigning
            // gcdOfXY to i until it achieves the GCD.
            if (x % i == 0 && y % i == 0) {
                gcdOfXY = i;
            }
        }
        
        // Declares a string to eventually convert from int gcdOfXY
        String calcGCD;
        
        // Converts int gcdOfXY into string calcGCD
        calcGCD = Integer.toString(gcdOfXY);
        
        // Sets calculated GCD in the text box
        solutionBox.setText("The GCD is : " + calcGCD);
    }
}