package week6_demo_gui_loops;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Week6_Demo_GUI_Loops extends Application {
    int count = 0;
    double strtX = 0, strtY = 0, endX = 0, endY = 0;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        int stp = 5, size = 35;
        Line ln = new Line();
        Circle circle1 = new Circle(50, 50, 25, Color.LIGHTBLUE);
        Circle circle2 = new Circle(100, 100, 25, Color.BLUE);
        Rectangle rect = new Rectangle(800, 400, Color.RED);

        rect.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent eh) {
                strtX = eh.getX();
                strtY = eh.getY();
            }
        });

        rect.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent eh) {
                endX = eh.getX();
                endY = eh.getY();
                ln.setStartX(strtX);
                ln.setStartX(strtY);
                ln.setEndX(endX);
                ln.setEndY(endY);
            }
        });

        circle1.setOnMouseClicked(eh -> {
            count += 18;
            circle1.setCenterX(50 + count);
            circle1.setCenterY(50 + count);
        });

        Line[] lns = new Line[size];

        Group gp = new Group(rect, circle1, circle2, ln);

        for (int i = 0; i < size; i++) {
            lns[i] = new Line(400 - i * stp, 10 + i * stp, 400 + i * stp, 10 + i * stp);
            gp.getChildren().add(lns[i]);
        }

        Scene sn = new Scene(gp, 800, 400);
        stage.setScene(sn);
        stage.show();
    }
}