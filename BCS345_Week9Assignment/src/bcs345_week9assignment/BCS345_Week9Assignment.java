package bcs345_week9assignment;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import java.util.Random;
import javafx.scene.shape.Line;

public class BCS345_Week9Assignment extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Random rand = new Random();
        Group gp = new Group();
        
        int centerX = 250;
        int centerY = 250;
        int radius = 200;
        Circle c1 = new Circle(centerX, centerY, radius);
        gp.getChildren().add(c1);
        
        // Establishes 1st random point of a triangle along the circle.
        double theta1 = rand.nextDouble()*100;
        double point1x = centerX + radius * Math.cos(theta1);
        double point1y = centerY + radius * Math.sin(theta1);

        // Establishes 2nd random point of a triangle along the circle.
        double theta2 = rand.nextDouble()*100;
        double point2x = centerX + radius * Math.cos(theta2);
        double point2y = centerY + radius * Math.sin(theta2);

        // Establishes 3rd random point of a triangle along the circle.
        double theta3 = rand.nextDouble()*100;
        double point3x = centerX + radius * Math.cos(theta3);
        double point3y = centerY + radius * Math.sin(theta3);
        
        /*
        // Creates triangle with the 3 random points above.
        Polygon triangle1 = new Polygon();
            triangle1.getPoints().addAll(new Double[] {
                point1x, point1y,
                point2x, point2y,
                point3x, point3y});
            triangle1.setFill(Color.WHITE);
            triangle1.setStroke(Color.BLACK);
        gp.getChildren().add(triangle1);
        */
        
        Line line1 = new Line();
        line1.setStartX(point1x);
        line1.setStartY(point1y);
        line1.setEndX(point2x);
        line1.setEndY(point2y);
        gp.getChildren().add(line1);
        
        Line line2 = new Line();
        line2.setStartX(point1x);
        line2.setStartY(point1y);
        line2.setEndX(point3x);
        line2.setEndY(point3y);
        gp.getChildren().add(line2);
        
        Line line3 = new Line();
        line3.setStartX(point2x);
        line3.setStartY(point2y);
        line3.setEndX(point3x);
        line3.setEndY(point3y);
        gp.getChildren().add(line3);
        
        // Prints circles along the 3 random points above.
        Circle point1 = new Circle(point1x, point1y, 10);
        gp.getChildren().add(point1);
        
        Circle point2 = new Circle(point2x, point2y, 10);
        gp.getChildren().add(point2);
        
        Circle point3 = new Circle(point3x, point3y, 10);
        gp.getChildren().add(point3);
        
        // Creates event to drag 1st point.
        point1.setOnMouseDragged(e -> { 
            if (point1.contains(e.getX(), e.getY())) {
                // Recompute and display angles
                point1.setCenterX(e.getX());
                point1.setCenterY(e.getY());
                line1.setStartX(point1.getCenterX());
                line1.setStartY(point1.getCenterY());
                line2.setStartX(point1.getCenterX());
                line2.setStartY(point1.getCenterY());
            }
        });
        
        // Creates event to drag 2nd point.
        point2.setOnMouseDragged(e -> { 
            if (point2.contains(e.getX(), e.getY())) {
                // Recompute and display angles
                point2.setCenterX(e.getX());
                point2.setCenterY(e.getY());
                line1.setEndX(point2.getCenterX());
                line1.setEndY(point2.getCenterY());
                line3.setStartX(point2.getCenterX());
                line3.setStartY(point2.getCenterY());
            }
        });
        
        // Creates event to drag 2nd point.
        point3.setOnMouseDragged(e -> { 
            if (point3.contains(e.getX(), e.getY())) {
                // Recompute and display angles
                point3.setCenterX(e.getX());
                point3.setCenterY(e.getY());
                line2.setEndX(point3.getCenterX());
                line2.setEndY(point3.getCenterY());
                line3.setEndX(point3.getCenterX());
                line3.setEndY(point3.getCenterY());
            }
        });
        
        /*
        double a, b, c;
        double[] angle = new double[3];
        angle[0] = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
        angle[1] = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
        angle[2] = Math.acos((c * c - b * b - a * a) / (-2 * a * b));
        */
            
        c1.setFill(Color.WHITE);
        c1.setStroke(Color.BLACK);

        stage.setScene(new Scene(gp, 500, 500));
        stage.show();
    }
}