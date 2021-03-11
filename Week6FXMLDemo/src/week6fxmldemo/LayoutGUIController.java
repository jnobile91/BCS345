package week6fxmldemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class LayoutGUIController {

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private TextArea txt1;

    @FXML
    void setTxt(ActionEvent event) {
        txt1.setText("Joe");
    }
}