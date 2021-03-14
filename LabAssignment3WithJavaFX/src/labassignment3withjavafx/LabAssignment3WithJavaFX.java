package labassignment3withjavafx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class LabAssignment3WithJavaFX extends Application {
    int count = 0;
    double startX = 0, startY = 0, endX = 0, endY = 0;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Creates the background and foreground
        Rectangle background = new Rectangle(1000, 1000, Color.LIGHTGREEN);
        Rectangle foreground = new Rectangle(1000, 400, Color.LIGHTBLUE);
        
        // Creates the structure of the house
        Rectangle house = new Rectangle(150, 150, 700, 650);
            // Sets the house color to brown
            house.setFill(Color.BROWN);
            house.setStroke(Color.BLACK);
        
        // Creates the roof as a polygon object
        Polygon roof = new Polygon();
            // Sets the roof polygon using the appropriate function to gather 3 points
            roof.getPoints().addAll(new Double[] {
                500.0, 0.0,
                100.0, 150.0,
                900.0, 150.0});
            // Sets the roof color to white and border to black
            roof.setFill(Color.WHITE);
            roof.setStroke(Color.BLACK);
        
        // Creates the roof base and sets color to white and border to black
        Rectangle roofBase = new Rectangle(150, 150, 700, 50);
            roofBase.setFill(Color.WHITE);
            roofBase.setStroke(Color.BLACK);
        
        // Creates the 4 columns and sets color to white and border to black
        int columnWidth = 50;
        int columnHeight = 450;
        int columnStartY = 200;
        int column1startX = 175;
        int column2startX = 375;
        int column3startX = 575;
        int column4startX = 775;
        Rectangle column1 = new Rectangle(column1startX, columnStartY, columnWidth, columnHeight);
            column1.setFill(Color.WHITE);
            column1.setStroke(Color.BLACK);
        Rectangle column2 = new Rectangle(column2startX, columnStartY, columnWidth, columnHeight);
            column2.setFill(Color.WHITE);
            column2.setStroke(Color.BLACK);
        Rectangle column3 = new Rectangle(column3startX, columnStartY, columnWidth, columnHeight);
            column3.setFill(Color.WHITE);
            column3.setStroke(Color.BLACK);
        Rectangle column4 = new Rectangle(column4startX, columnStartY, columnWidth, columnHeight);
            column4.setFill(Color.WHITE);
            column4.setStroke(Color.BLACK);
        
        // Creates the 8 column "toppers" and sets color to white and border to black
        Circle columnTopper1 = new Circle(column1startX, 215, 15, Color.WHITE);
            columnTopper1.setStroke(Color.BLACK);
        Circle columnTopper2 = new Circle(column1startX+columnWidth, 215, 15, Color.WHITE);
            columnTopper2.setStroke(Color.BLACK);
        Circle columnTopper3 = new Circle(column2startX, 215, 15, Color.WHITE);
            columnTopper3.setStroke(Color.BLACK);
        Circle columnTopper4 = new Circle(column2startX+columnWidth, 215, 15, Color.WHITE);
            columnTopper4.setStroke(Color.BLACK);
        Circle columnTopper5 = new Circle(column3startX, 215, 15, Color.WHITE);
            columnTopper5.setStroke(Color.BLACK);
        Circle columnTopper6 = new Circle(column3startX+columnWidth, 215, 15, Color.WHITE);
            columnTopper6.setStroke(Color.BLACK);
        Circle columnTopper7 = new Circle(column4startX, 215, 15, Color.WHITE);
            columnTopper7.setStroke(Color.BLACK);
        Circle columnTopper8 = new Circle(column4startX+columnWidth, 215, 15, Color.WHITE);
            columnTopper8.setStroke(Color.BLACK);
        
        // Creates column bases for all 4 columns and sets color to white and border to black
        int columnBaseHeight = 15;
        Rectangle columnBase1 = new Rectangle(column1startX-15, columnStartY+columnHeight, columnWidth+30, columnBaseHeight);
            columnBase1.setFill(Color.WHITE);
            columnBase1.setStroke(Color.BLACK);
        Rectangle columnBase2 = new Rectangle(column2startX-15, columnStartY+columnHeight, columnWidth+30, columnBaseHeight);
            columnBase2.setFill(Color.WHITE);
            columnBase2.setStroke(Color.BLACK);
        Rectangle columnBase3 = new Rectangle(column3startX-15, columnStartY+columnHeight, columnWidth+30, columnBaseHeight);
            columnBase3.setFill(Color.WHITE);
            columnBase3.setStroke(Color.BLACK);
        Rectangle columnBase4 = new Rectangle(column4startX-15, columnStartY+columnHeight, columnWidth+30, columnBaseHeight);
            columnBase4.setFill(Color.WHITE);
            columnBase4.setStroke(Color.BLACK);
        
        // Creates grey square above main door and sets color to grey and border to black
        Rectangle plaque = new Rectangle(435, 250, 130, 80);
                plaque.setFill(Color.GREY);
                plaque.setStroke(Color.BLACK);
                
        // Creates the 3 doors and sets color to white and border to black
        int doorWidth = 100;
        int doorHeight = 165;
        int distBetweenDoors = 200;
        int leftDoorStartX = 250;
        int mainDoorStartX = leftDoorStartX+distBetweenDoors;
        int rightDoorStartX = leftDoorStartX+(distBetweenDoors*2);
        int doorStartY = 500;
        int mainDoorDif = 15;
        Rectangle leftDoor = new Rectangle(leftDoorStartX, doorStartY, doorWidth, doorHeight);
            leftDoor.setFill(Color.WHITE);
            leftDoor.setStroke(Color.BLACK);
        Rectangle mainDoor = new Rectangle(mainDoorStartX, doorStartY-mainDoorDif, doorWidth, doorHeight+mainDoorDif);
            mainDoor.setFill(Color.WHITE);
            mainDoor.setStroke(Color.BLACK);
        Rectangle rightDoor = new Rectangle(rightDoorStartX, doorStartY, doorWidth, doorHeight);
            rightDoor.setFill(Color.WHITE);
            rightDoor.setStroke(Color.BLACK);

            
        // Creates the top smaller windows on each door
        int windowStartY = doorStartY + 10;
        int windowWidth = 20;
        int topWindowHeight = 15;
        int windowHeight = 20;
        int distBetweenWindows = 30;
        int windowDif = 40;
        Rectangle topWindow1 = new Rectangle(leftDoorStartX+windowWidth, windowStartY, windowWidth, topWindowHeight);
        Rectangle topWindow2 = new Rectangle(leftDoorStartX+windowWidth+windowDif, windowStartY, windowWidth, topWindowHeight);
        Rectangle topWindow3 = new Rectangle(mainDoorStartX+windowWidth, windowStartY, windowWidth, topWindowHeight);
        Rectangle topWindow4 = new Rectangle(mainDoorStartX+windowWidth+windowDif, windowStartY, windowWidth, topWindowHeight);
        Rectangle topWindow5 = new Rectangle(rightDoorStartX+windowWidth, windowStartY, windowWidth, topWindowHeight);
        Rectangle topWindow6 = new Rectangle(rightDoorStartX+windowWidth+windowDif, windowStartY, windowWidth, topWindowHeight);
        
        // Creates the remaining windows on left door
        Rectangle midWindow1 = new Rectangle(leftDoorStartX+windowWidth, windowStartY+distBetweenWindows, windowWidth, windowHeight);
        Rectangle midWindow2 = new Rectangle(leftDoorStartX+windowWidth+windowDif, windowStartY+distBetweenWindows, windowWidth, windowHeight);
        Rectangle midWindow3 = new Rectangle(leftDoorStartX+windowWidth, windowStartY+(distBetweenWindows*2), windowWidth, windowHeight);
        Rectangle midWindow4 = new Rectangle(leftDoorStartX+windowWidth+windowDif, windowStartY+(distBetweenWindows*2), windowWidth, windowHeight);
        Rectangle midWindow5 = new Rectangle(leftDoorStartX+windowWidth, windowStartY+(distBetweenWindows*3), windowWidth, windowHeight);
        Rectangle midWindow6 = new Rectangle(leftDoorStartX+windowWidth+windowDif, windowStartY+(distBetweenWindows*3), windowWidth, windowHeight);
        Rectangle midWindow7 = new Rectangle(leftDoorStartX+windowWidth, windowStartY+(distBetweenWindows*4), windowWidth, windowHeight);
        Rectangle midWindow8 = new Rectangle(leftDoorStartX+windowWidth+windowDif, windowStartY+(distBetweenWindows*4), windowWidth, windowHeight);
        
        // Creates the remaining windows on main door
        Rectangle midWindow9 = new Rectangle(mainDoorStartX+windowWidth, windowStartY+distBetweenWindows, windowWidth, windowHeight);
        Rectangle midWindow10 = new Rectangle(mainDoorStartX+windowWidth+windowDif, windowStartY+distBetweenWindows, windowWidth, windowHeight);
        Rectangle midWindow11 = new Rectangle(mainDoorStartX+windowWidth, windowStartY+(distBetweenWindows*2), windowWidth, windowHeight);
        Rectangle midWindow12 = new Rectangle(mainDoorStartX+windowWidth+windowDif, windowStartY+(distBetweenWindows*2), windowWidth, windowHeight);
        Rectangle midWindow13 = new Rectangle(mainDoorStartX+windowWidth, windowStartY+(distBetweenWindows*3), windowWidth, windowHeight);
        Rectangle midWindow14 = new Rectangle(mainDoorStartX+windowWidth+windowDif, windowStartY+(distBetweenWindows*3), windowWidth, windowHeight);
        Rectangle midWindow15 = new Rectangle(mainDoorStartX+windowWidth, windowStartY+(distBetweenWindows*4), windowWidth, windowHeight);
        Rectangle midWindow16 = new Rectangle(mainDoorStartX+windowWidth+windowDif, windowStartY+(distBetweenWindows*4), windowWidth, windowHeight);        
        
        // Creates the remaining windows on right door
        Rectangle midWindow17 = new Rectangle(rightDoorStartX+windowWidth, windowStartY+distBetweenWindows, windowWidth, windowHeight);
        Rectangle midWindow18 = new Rectangle(rightDoorStartX+windowWidth+windowDif, windowStartY+distBetweenWindows, windowWidth, windowHeight);
        Rectangle midWindow19 = new Rectangle(rightDoorStartX+windowWidth, windowStartY+(distBetweenWindows*2), windowWidth, windowHeight);
        Rectangle midWindow20 = new Rectangle(rightDoorStartX+windowWidth+windowDif, windowStartY+(distBetweenWindows*2), windowWidth, windowHeight);
        Rectangle midWindow21 = new Rectangle(rightDoorStartX+windowWidth, windowStartY+(distBetweenWindows*3), windowWidth, windowHeight);
        Rectangle midWindow22 = new Rectangle(rightDoorStartX+windowWidth+windowDif, windowStartY+(distBetweenWindows*3), windowWidth, windowHeight);
        Rectangle midWindow23 = new Rectangle(rightDoorStartX+windowWidth, windowStartY+(distBetweenWindows*4), windowWidth, windowHeight);
        Rectangle midWindow24 = new Rectangle(rightDoorStartX+windowWidth+windowDif, windowStartY+(distBetweenWindows*4), windowWidth, windowHeight);  
        
        // Creates 2 small landing pieces adjacent to the top of the staircase, sets color to grey and border to black
        Rectangle landing1 = new Rectangle(150, 665, 85, 10);
            landing1.setFill(Color.GREY);
            landing1.setStroke(Color.BLACK);
        Rectangle landing2 = new Rectangle(765, 665, 85, 10);
            landing2.setFill(Color.GREY);
            landing2.setStroke(Color.BLACK);
        
        Group gp = new Group(background, foreground, house, roof, roofBase, column1, column2, 
                column3, column4, columnTopper1, columnTopper2, columnTopper3, columnTopper4,
                columnTopper5, columnTopper6, columnTopper7, columnTopper8, columnBase1,
                columnBase2, columnBase3, columnBase4, plaque, leftDoor, mainDoor, rightDoor,
                topWindow1, topWindow2, topWindow3, topWindow4, topWindow5, topWindow6, midWindow1,
                midWindow2, midWindow3, midWindow4, midWindow5, midWindow6, midWindow7, midWindow8,
                midWindow9, midWindow10, midWindow11, midWindow12, midWindow13, midWindow14, midWindow15,
                midWindow16, midWindow17, midWindow18, midWindow19, midWindow20, midWindow21, midWindow22,
                midWindow23, midWindow24, landing1, landing2);
        
        // Creates staircase using for loop
        int stairStartX = 235;
        int stairStartY = 665;
        int stairStartWidth = 530;
        int stairDif = 30;
        int stairHeight = 15;
        Rectangle[] stairCase = new Rectangle[11];
        for (int i = 0; i < 11; i++) {
            stairCase[i] = new Rectangle(stairStartX - (i*stairDif)/2, stairStartY+i*stairHeight, stairStartWidth+i*stairDif, stairHeight);
            stairCase[i].setFill(Color.GREY);
            stairCase[i].setStroke(Color.BLACK);
            gp.getChildren().add(stairCase[i]);
        }
        
        Scene sn = new Scene(gp, 1000, 1000);
        stage.setScene(sn);
        stage.setTitle("A House");
        stage.show();
    }
}
