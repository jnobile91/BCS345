package labassignment4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LayoutGUIController {
    
    private String currentArthOp ="DEFAULT";
    private String operand1 = "0";
    
    @FXML
    private TextField txt1;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2; 

    @FXML
    private Button btn3;
    
    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;
    
    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;
    
    @FXML
    private Button addBtn;

    @FXML
    private Button minusBtn;

    @FXML
    private Button multBtn;

    @FXML
    private Button divBtn;

    @FXML
    private Button eqBtn;
    
    @FXML
    private Button clearBtn;
    
    @FXML
    private Button squareBtn;
    @FXML
    private Button btn0;
    
    @FXML
    void addNum(ActionEvent event) {
        // All of these if statements collect input from the user
        // into the text field "txt1"
        if(((Button)event.getSource()).getText().equals("1")){
            txt1.setText(txt1.getText() + "1");
        }
        if(((Button)event.getSource()).getText().equals("2")){
            txt1.setText(txt1.getText() + "2");
        }
        if(((Button)event.getSource()).getText().equals("3")){
            txt1.setText(txt1.getText() + "3");
        }
        if(((Button)event.getSource()).getText().equals("4")){
            txt1.setText(txt1.getText() + "4");
        }
        if(((Button)event.getSource()).getText().equals("5")){
            txt1.setText(txt1.getText() + "5");
        }
        if(((Button)event.getSource()).getText().equals("6")){
            txt1.setText(txt1.getText() + "6");
        }
        if(((Button)event.getSource()).getText().equals("7")){
            txt1.setText(txt1.getText() + "7");
        }
        if(((Button)event.getSource()).getText().equals("8")){
            txt1.setText(txt1.getText() + "8");
        }
        if(((Button)event.getSource()).getText().equals("9")){
            txt1.setText(txt1.getText() + "9");
        }
        if(((Button)event.getSource()).getText().equals("0")){
            txt1.setText(txt1.getText() + "0");
        }
    }
    
    @FXML
    void arthOp(ActionEvent event) {
        // Checks to see which operation has been requested, then
        // converts "currentArthOp" to selected operation
        if(((Button)event.getSource()).getText().equals("+")) {
            if(currentArthOp.equals("DEFAULT")) {
                operand1 = txt1.getText();
                currentArthOp="ADD";
                txt1.clear();
            }
        }
        else if(((Button)event.getSource()).getText().equals("-")) {
            if(currentArthOp.equals("DEFAULT")) {
                operand1 = txt1.getText();
                currentArthOp="SUBTRACT";
                txt1.clear();
            }
        }
        else if(((Button)event.getSource()).getText().equals("x")) {
            if(currentArthOp.equals("DEFAULT")) {
                operand1 = txt1.getText();
                currentArthOp="MULTIPLY";
                txt1.clear();
            }
        }
        else if(((Button)event.getSource()).getText().equals("÷")) {
            if(currentArthOp.equals("DEFAULT")) {
                operand1 = txt1.getText();
                currentArthOp="DIVIDE";
                txt1.clear();
            }
        }
        else if(((Button)event.getSource()).getText().equals("x^2")) {
            if(currentArthOp.equals("DEFAULT")) {
                operand1 = txt1.getText();
                currentArthOp="SQUARE";
                txt1.clear();
            }
        }
    }

    @FXML
    void processResult(ActionEvent event) {
        // Stores first number into num1 and second number into num2
        int num1 = Integer.parseInt(operand1);
        int num2 = Integer.parseInt(txt1.getText());
        
        // Checks which operation is selected, then calculates result
        if(currentArthOp.equals("ADD")) {
            txt1.setText("" + (num1 + num2));
        }
        else if(currentArthOp.equals("SUBTRACT")) {
            txt1.setText("" + (num1 - num2));
        }
        else if(currentArthOp.equals("MULTIPLY")) {
            txt1.setText("" + (num1 * num2));
        }
        else if(currentArthOp.equals("DIVIDE")) {
            // Checks to see if user divided by 0, then prints
            // "Not a number" if true
            if (num2 == 0) {
                txt1.setText("Not a number");
            }
            else {
                txt1.setText("" + (num1 / num2));
            }
        }
    }

    @FXML
    private void clear(ActionEvent event) {
        // Clear button resets currentArthOp and operand1 variables, then
        // clears the text field to begin a new calculation
        currentArthOp ="DEFAULT";
        operand1 = "0";
        txt1.clear();
    }

    @FXML
    private void squareOp(ActionEvent event) {
        // Collects input in text field
        int num1 = Integer.parseInt(txt1.getText());
        
        // Converts currentArthOp to SQUARE
        if(((Button)event.getSource()).getText().equals("x^2")) {
            if(currentArthOp.equals("DEFAULT")) {
                operand1 = txt1.getText();
                currentArthOp="SQUARE";
            }
        }
        
        // Squares num1
        if(currentArthOp.equals("SQUARE")) {
            txt1.setText("" + (num1 * num1));
        }
    }
}