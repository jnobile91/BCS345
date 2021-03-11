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
        Rectangle background = new Rectangle(800, 600, Color.LIGHTGREEN);
        Rectangle foreground = new Rectangle(800, 250, Color.LIGHTBLUE);
        int stp = 10, size = 35;

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
        
        Circle circle1 = new Circle(200, 200, 100, Color.ORANGE);
        Circle circle2 = new Circle(200, 200, 105, Color.BLACK);
        //Sets mouse click interaction to move circle1.
        circle1.setOnMouseClicked(eh->{
            count+=10;
            circle1.setCenterX(50+count);
            circle2.setCenterX(50+count);
        });
        
        //Creates a new line using mouse click.

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
        
        
        Group gp = new Group(background, foreground, circle2, circle1);
        Scene sn = new Scene(gp, 800, 600);
        stage.setScene(sn);
        stage.setTitle("GUI Title");
        stage.show();
    }
}