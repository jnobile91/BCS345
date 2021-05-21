package javafinalexamq2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jnobi
 */
public class FXMLControllerController {

    @FXML
    private TextField num1;
    @FXML
    private TextField num2;
    @FXML
    private TextField num3;
    @FXML
    private TextField solutionText;
    
    


    @FXML
    private void calcAverage(ActionEvent event) {
        double x = Double.parseDouble(num1.getText());
        double y = Double.parseDouble(num2.getText());
        double z = Double.parseDouble(num3.getText());
        double average = (x + y + z) / 3;
        String averageStr;
        averageStr = Double.toString(average);
        solutionText.setText("The average is : " + averageStr);
    }
}
