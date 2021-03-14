package week6_demointeraction;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Week6_DemoInteraction extends Application {
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
        Rectangle house = new Rectangle(150, 150, 700, 700);
            // Sets the house color to brown
            house.setFill(Color.BROWN);
        
        // Creates the roof as a polygon object
        Polygon roof = new Polygon();
            // Sets the roof polygon using the appropriate function to gather 3 points
            roof.getPoints().addAll(new Double[] {
                500.0, 0.0,
                100.0, 150.0,
                900.0, 150.0});
            // Sets the roof color to white
            roof.setFill(Color.WHITE);
        
        // Creates the roof base and sets color to white
        Rectangle roofBase = new Rectangle(150, 150, 700, 50);
            roofBase.setFill(Color.WHITE);
        
        // Creates the 4 columns and sets color to white
        int columnWidth = 50;
        int columnHeight = 450;
        int columnStartY = 200;
        int column1startX = 175;
        int column2startX = 375;
        int column3startX = 575;
        int column4startX = 775;
        Rectangle column1 = new Rectangle(column1startX, columnStartY, columnWidth, columnHeight);
            column1.setFill(Color.WHITE);
        Rectangle column2 = new Rectangle(column2startX, columnStartY, columnWidth, columnHeight);
            column2.setFill(Color.WHITE);
        Rectangle column3 = new Rectangle(column3startX, columnStartY, columnWidth, columnHeight);
            column3.setFill(Color.WHITE);
        Rectangle column4 = new Rectangle(column4startX, columnStartY, columnWidth, columnHeight);
            column4.setFill(Color.WHITE);
        
        // Creates the 8 column "toppers" and sets color to white
        Circle columnTopper1 = new Circle(column1startX, 215, 15, Color.WHITE);
        Circle columnTopper2 = new Circle(column1startX+columnWidth, 215, 15, Color.WHITE);
        Circle columnTopper3 = new Circle(column2startX, 215, 15, Color.WHITE);
        Circle columnTopper4 = new Circle(column2startX+columnWidth, 215, 15, Color.WHITE);
        Circle columnTopper5 = new Circle(column3startX, 215, 15, Color.WHITE);
        Circle columnTopper6 = new Circle(column3startX+columnWidth, 215, 15, Color.WHITE);
        Circle columnTopper7 = new Circle(column4startX, 215, 15, Color.WHITE);
        Circle columnTopper8 = new Circle(column4startX+columnWidth, 215, 15, Color.WHITE);  
        
        // Creates column bases for all 4 columns and sets color to white
        int columnBaseHeight = 15;
        Rectangle columnBase1 = new Rectangle(column1startX-15, columnStartY+columnHeight, columnWidth+30, columnBaseHeight);
            columnBase1.setFill(Color.WHITE);
        Rectangle columnBase2 = new Rectangle(column2startX-15, columnStartY+columnHeight, columnWidth+30, columnBaseHeight);
            columnBase2.setFill(Color.WHITE);
        Rectangle columnBase3 = new Rectangle(column3startX-15, columnStartY+columnHeight, columnWidth+30, columnBaseHeight);
            columnBase3.setFill(Color.WHITE);
        Rectangle columnBase4 = new Rectangle(column4startX-15, columnStartY+columnHeight, columnWidth+30, columnBaseHeight);
            columnBase4.setFill(Color.WHITE);
        
        // Creates grey square above main door and sets color to grey
        Rectangle plaque = new Rectangle(435, 250, 130, 80);
                plaque.setFill(Color.GREY);
                
        // Creates the 3 doors and sets color to white
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
        Rectangle mainDoor = new Rectangle(mainDoorStartX, doorStartY-mainDoorDif, doorWidth, doorHeight+mainDoorDif);
            mainDoor.setFill(Color.WHITE);
        Rectangle rightDoor = new Rectangle(rightDoorStartX, doorStartY, doorWidth, doorHeight);
            rightDoor.setFill(Color.WHITE);

            
        // Creates the top smaller windows on each door
        int windowStartY = doorStartY + 10;
        int windowWidth = 20;
        int topWindowHeight = 15;
        int windowHeight = 20;
        int distBetweenWindows = 30;
        Rectangle topWindow1 = new Rectangle(leftDoorStartX+windowWidth, windowStartY, windowWidth, topWindowHeight);
        Rectangle topWindow2 = new Rectangle(leftDoorStartX+windowWidth+35, windowStartY, windowWidth, topWindowHeight);
        Rectangle topWindow3 = new Rectangle(mainDoorStartX+windowWidth, windowStartY, windowWidth, topWindowHeight);
        Rectangle topWindow4 = new Rectangle(mainDoorStartX+windowWidth+35, windowStartY, windowWidth, topWindowHeight);
        Rectangle topWindow5 = new Rectangle(rightDoorStartX+windowWidth, windowStartY, windowWidth, topWindowHeight);
        Rectangle topWindow6 = new Rectangle(rightDoorStartX+windowWidth+35, windowStartY, windowWidth, topWindowHeight);
        
        // Creates the remaining windows on each door
        Rectangle midWindow1 = new Rectangle(leftDoorStartX+windowWidth, windowStartY+distBetweenWindows, windowWidth, windowHeight);
        Rectangle midWindow2 = new Rectangle(leftDoorStartX+windowWidth+35, windowStartY+distBetweenWindows, windowWidth, windowHeight);
        Rectangle midWindow3 = new Rectangle(leftDoorStartX+windowWidth, windowStartY+(distBetweenWindows*2), windowWidth, windowHeight);
        Rectangle midWindow4 = new Rectangle(leftDoorStartX+windowWidth+35, windowStartY+(distBetweenWindows*2), windowWidth, windowHeight);
        Rectangle midWindow5 = new Rectangle(leftDoorStartX+windowWidth, windowStartY+(distBetweenWindows*3), windowWidth, windowHeight);
        Rectangle midWindow6 = new Rectangle(leftDoorStartX+windowWidth+35, windowStartY+(distBetweenWindows*3), windowWidth, windowHeight);
        Rectangle midWindow7 = new Rectangle(leftDoorStartX+windowWidth, windowStartY+(distBetweenWindows*4), windowWidth, windowHeight);
        Rectangle midWindow8 = new Rectangle(leftDoorStartX+windowWidth+35, windowStartY+(distBetweenWindows*4), windowWidth, windowHeight);
        
        // int stp = 10, size = 35;

        /*
        Line line1 = new Line(0, 10, 150, 10);
        Line line2 = new Line(0, 10+1*stp, 150, 10+1*stp);
        Line line3 = new Line(0, 10+2*stp, 150, 10+2*stp);
        Line line4 = new Line(0, 10+3*stp, 150, 10+3*stp);
        Line line5 = new Line(0, 10+4*stp, 150, 10+4*stp);
        Group gp = new Group(line1, line2, line3, line4, line5);
        */
        
        /* //This code creates a sequence of parallel horizontal lines.
        Line[] lines = new Line[size];
        Group gp = new Group();
        for (int i = 0; i < size; i++) {
            lines[i] = new Line(0, 10+(i*stp), 150, 10+(i*stp));
            gp.getChildren().add(lines[i]);
        }
        
        Scene sn = new Scene(gp, 800, 600);
        stage.setScene(sn);
        stage.setTitle("GUI Title");
        stage.show();
        */
        
        /* // This code creates a triangle using a sequence of parallel horizontal lines.
        Line[] triLine = new Line[size];
        Group triGp = new Group();
        for (int i = 0; i < size; i++) {
            triLine[i] = new Line(400-(i*stp), 10+(i*stp), 400+(i*stp), 10+(i*stp));
            triGp.getChildren().add(triLine[i]);
        }
        
        Scene sn = new Scene(triGp, 800, 600);
        stage.setScene(sn);
        stage.setTitle("GUI Title");
        stage.show();
        */
        
        /*
        Circle circle1 = new Circle(200, 200, 100, Color.ORANGE);
        Circle circle2 = new Circle(200, 200, 105, Color.BLACK);
        //Sets mouse click interaction to move circle1.
        circle1.setOnMouseClicked(eh->{
            count+=10;
            circle1.setCenterX(50+count);
            circle2.setCenterX(50+count);
        });
        */
        
        //Creates a new line using mouse click.

        /*
        Line ln = new Line();
        background.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent eh) {
                startX = eh.getX();
                startY = eh.getY();
            }

        });

        background.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent eh) {
                endX = eh.getX();
                endY = eh.getY();
                ln.setStartX(startX);
                ln.setStartX(startY);
                ln.setEndX(endX);
                ln.setEndY(endY);
            }
        });
        */
        
        Group gp = new Group(background, foreground, house, roof, roofBase, column1, column2, 
                column3, column4, columnTopper1, columnTopper2, columnTopper3, columnTopper4,
                columnTopper5, columnTopper6, columnTopper7, columnTopper8, columnBase1,
                columnBase2, columnBase3, columnBase4, plaque, leftDoor, mainDoor, rightDoor,
                topWindow1, topWindow2, topWindow3, topWindow4, topWindow5, topWindow6, midWindow1,
                midWindow2, midWindow3, midWindow4, midWindow5, midWindow6, midWindow7, midWindow8);
        Scene sn = new Scene(gp, 1000, 1000);
        stage.setScene(sn);
        stage.setTitle("A House");
        stage.show();
    }
}