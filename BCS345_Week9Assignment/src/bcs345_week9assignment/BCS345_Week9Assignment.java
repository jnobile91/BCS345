/*
    BCS 345 - Week 9 Lab Assignment
    "Triangle within a circle"
    Authors:
        Steven Lannon
        Juan Marrero
        Joseph Nobile
        Michael Trant
*/
package bcs345_week9assignment;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import java.util.Random;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class BCS345_Week9Assignment extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Random rand = new Random();
        Group gp = new Group();
        
        // Initializes center circle.
        int centerX = 250;
        int centerY = 250;
        int radius = 200;
        double pi = Math.PI;
        Circle c1 = new Circle(centerX, centerY, radius);
        gp.getChildren().add(c1);
        
        // Creates text array for angles to display along the points
        Text[] text = {new Text(), new Text(), new Text()};
        
        // Establishes 1st random point of a triangle along the circle.
        double theta1 = rand.nextDouble()* (2*pi);
        double point1x = centerX + radius * Math.cos(theta1);
        double point1y = centerY + radius * Math.sin(theta1);

        // Establishes 2nd random point of a triangle along the circle.
        double theta2 = rand.nextDouble()* (2*pi);
        double point2x = centerX + radius * Math.cos(theta2);
        double point2y = centerY + radius * Math.sin(theta2);

        // Establishes 3rd random point of a triangle along the circle.
        double theta3 = rand.nextDouble()* (2*pi);
        double point3x = centerX + radius * Math.cos(theta3);
        double point3y = centerY + radius * Math.sin(theta3);

        // Creates line between points 1 and 2.
        Line line1 = new Line();
        line1.setStartX(point1x);
        line1.setStartY(point1y);
        line1.setEndX(point2x);
        line1.setEndY(point2y);
        gp.getChildren().add(line1);
        
        // Creates line between points 1 and 3.
        Line line2 = new Line();
        line2.setStartX(point1x);
        line2.setStartY(point1y);
        line2.setEndX(point3x);
        line2.setEndY(point3y);
        gp.getChildren().add(line2);
        
        // Creates line between points 2 and 3.
        Line line3 = new Line();
        line3.setStartX(point2x);
        line3.setStartY(point2y);
        line3.setEndX(point3x);
        line3.setEndY(point3y);
        gp.getChildren().add(line3);
        
        // Prints circles along the 3 random points above.
        Circle point1 = new Circle(point1x, point1y, 10);
        gp.getChildren().add(point1);
        point1.setFill(Color.ORANGE);
        
        Circle point2 = new Circle(point2x, point2y, 10);
        gp.getChildren().add(point2);
        point2.setFill(Color.GREEN);
        
        Circle point3 = new Circle(point3x, point3y, 10);
        gp.getChildren().add(point3);
        point3.setFill(Color.BLUE);
        
        // Calculates distance of lines.
        double distLine1 = Math.sqrt((Math.pow((line1.getEndX() - line1.getStartX()), 2)) + 
                            (Math.pow((line1.getEndY() - line1.getStartY()), 2)));
        double distLine2 = Math.sqrt((Math.pow((line2.getEndX() - line2.getStartX()), 2)) + 
                            (Math.pow((line2.getEndY() - line2.getStartY()), 2)));
        double distLine3 = Math.sqrt((Math.pow((line3.getEndX() - line3.getStartX()), 2)) + 
                            (Math.pow((line3.getEndY() - line3.getStartY()), 2)));
        
        // Calculates all angles.
        double[] angle = new double[3];
        angle[0] = Math.acos((distLine3 * distLine3 - distLine2 * distLine2 - distLine1 * distLine1)
                / (-2 * distLine2 * distLine1));
        angle[1] = Math.acos((distLine2 * distLine2 - distLine3 * distLine3 - distLine1 * distLine1)
                / (-2 * distLine3 * distLine1));
        angle[2] = Math.acos((distLine1 * distLine1 - distLine2 * distLine2 - distLine3 * distLine3)
                / (-2 * distLine3 * distLine2));
        
        /*
        // REFERENCE FOR ANGLE FORUMLAS
        double[] angle = new double[3];
        angle[0] = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
        angle[1] = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
        angle[2] = Math.acos((c * c - b * b - a * a) / (-2 * a * b));
        */
        
        // Initializes angle markers
        text[0].setX(point1.getCenterX()+15);
        text[0].setY(point1.getCenterY()+5);
        text[0].setText(String.format("%.2f", Math.toDegrees(angle[0])));
        text[0].setFill(Color.BLACK);
        gp.getChildren().add(text[0]);
        
        text[1].setX(point2.getCenterX()+15);
        text[1].setY(point2.getCenterY()+5);
        text[1].setText(String.format("%.2f", Math.toDegrees(angle[1])));
        text[1].setFill(Color.BLACK);
        gp.getChildren().add(text[1]);
        
        text[2].setX(point3.getCenterX()+15);
        text[2].setY(point3.getCenterY()+5);
        text[2].setText(String.format("%.2f", Math.toDegrees(angle[2])));
        text[2].setFill(Color.BLACK);
        gp.getChildren().add(text[2]);
        
        point1.setOnMouseDragged(e -> { 
            if (point1.contains(e.getX(), e.getY())) {
                // Recalculates theta based on mouse position,
                // then aligns point along the right half of the circle.
                if (e.getX() > centerX){
                double newPoint1x = e.getX();
                double newPoint1y = e.getY();
                double dist1x = (centerX - newPoint1x);
                double dist1y = (centerY - newPoint1y);
                double newTheta1 = Math.atan(dist1y/dist1x);
                double calcPoint1x = centerX + radius * Math.cos(newTheta1);
                double calcPoint1y = centerY + radius * Math.sin(newTheta1);
                point1.setCenterX(calcPoint1x);
                point1.setCenterY(calcPoint1y);
                }
                // Same as previous code, only for the left half of the circle.
                else if (e.getX() < centerX){
                double newPoint1x = e.getX();
                double newPoint1y = e.getY();
                double dist1x = (centerX - newPoint1x);
                double dist1y = (centerY - newPoint1y);
                double newTheta1 = Math.atan(dist1y/dist1x) + pi;
                double calcPoint1x = centerX + radius * Math.cos(newTheta1);
                double calcPoint1y = centerY + radius * Math.sin(newTheta1);
                point1.setCenterX(calcPoint1x);
                point1.setCenterY(calcPoint1y);
                }
                
                line1.setStartX(point1.getCenterX());
                line1.setStartY(point1.getCenterY());
                line2.setStartX(point1.getCenterX());
                line2.setStartY(point1.getCenterY());
                
                // Calculates distance of new lines
                double newDistLine1 = Math.sqrt((Math.pow((line1.getEndX() - line1.getStartX()), 2)) + 
                            (Math.pow((line1.getEndY() - line1.getStartY()), 2)));
                double newDistLine2 = Math.sqrt((Math.pow((line2.getEndX() - line2.getStartX()), 2)) + 
                            (Math.pow((line2.getEndY() - line2.getStartY()), 2)));
                double newDistLine3 = Math.sqrt((Math.pow((line3.getEndX() - line3.getStartX()), 2)) + 
                            (Math.pow((line3.getEndY() - line3.getStartY()), 2)));
        
                // Calculates all angles.
                angle[0] = Math.acos((newDistLine3 * newDistLine3 - newDistLine2 * newDistLine2 - newDistLine1 * newDistLine1)
                    / (-2 * newDistLine2 * newDistLine1));
                angle[1] = Math.acos((newDistLine2 * newDistLine2 - newDistLine3 * newDistLine3 - newDistLine1 * newDistLine1)
                    / (-2 * newDistLine3 * newDistLine1));
                angle[2] = Math.acos((newDistLine1 * newDistLine1 - newDistLine2 * newDistLine2 - newDistLine3 * newDistLine3)
                    / (-2 * newDistLine3 * newDistLine2));
                
                // Keeps text box on right side of point if on right side of circle.
                if (point1.getCenterX() > centerX) {
                text[0].setX(point1.getCenterX()+15);
                text[0].setY(point1.getCenterY()+5);
                text[0].setText(String.format("%.2f", Math.toDegrees(angle[0])));
                text[1].setText(String.format("%.2f", Math.toDegrees(angle[1])));
                text[2].setText(String.format("%.2f", Math.toDegrees(angle[2])));
                gp.getChildren().add(text[0]);
                
                }
                // Resituates text box on the left side if point is on left half of circle.
                else if (point1.getCenterX() < centerX) {
                text[0].setX(point1.getCenterX()-40);
                text[0].setY(point1.getCenterY()+5);
                text[0].setText(String.format("%.2f", Math.toDegrees(angle[0])));
                text[1].setText(String.format("%.2f", Math.toDegrees(angle[1])));
                text[2].setText(String.format("%.2f", Math.toDegrees(angle[2])));
                gp.getChildren().add(text[0]);
                }
            }
        });
        
        // Creates event to drag 2nd point.
        point2.setOnMouseDragged(e -> { 
            if (point2.contains(e.getX(), e.getY())) {
                
                // Recalculates theta based on mouse position,
                // then aligns point along the right half of the circle.
                if (e.getX() > centerX){
                double newPoint2x = e.getX();
                double newPoint2y = e.getY();
                double dist2x = (centerX - newPoint2x);
                double dist2y = (centerY - newPoint2y);
                double newTheta2 = Math.atan(dist2y/dist2x);
                double calcPoint2x = centerX + radius * Math.cos(newTheta2);
                double calcPoint2y = centerY + radius * Math.sin(newTheta2);
                point2.setCenterX(calcPoint2x);
                point2.setCenterY(calcPoint2y);
                }
                // Same as previous code, only for the left half of the circle.
                else if (e.getX() < centerX){
                double newPoint2x = e.getX();
                double newPoint2y = e.getY();
                double dist2x = (centerX - newPoint2x);
                double dist2y = (centerY - newPoint2y);
                double newTheta2 = Math.atan(dist2y/dist2x) + pi;
                double calcPoint2x = centerX + radius * Math.cos(newTheta2);
                double calcPoint2y = centerY + radius * Math.sin(newTheta2);
                point2.setCenterX(calcPoint2x);
                point2.setCenterY(calcPoint2y);
                }
                
                //point2.setCenterX(e.getX());
                //point2.setCenterY(e.getY());
                line1.setEndX(point2.getCenterX());
                line1.setEndY(point2.getCenterY());
                line3.setStartX(point2.getCenterX());
                line3.setStartY(point2.getCenterY());
                
                // Calculates distance of new lines
                double newDistLine1 = Math.sqrt((Math.pow((line1.getEndX() - line1.getStartX()), 2)) + 
                            (Math.pow((line1.getEndY() - line1.getStartY()), 2)));
                double newDistLine2 = Math.sqrt((Math.pow((line2.getEndX() - line2.getStartX()), 2)) + 
                            (Math.pow((line2.getEndY() - line2.getStartY()), 2)));
                double newDistLine3 = Math.sqrt((Math.pow((line3.getEndX() - line3.getStartX()), 2)) + 
                            (Math.pow((line3.getEndY() - line3.getStartY()), 2)));
        
                // Calculates all angles.
                angle[0] = Math.acos((newDistLine3 * newDistLine3 - newDistLine2 * newDistLine2 - newDistLine1 * newDistLine1)
                    / (-2 * newDistLine2 * newDistLine1));
                angle[1] = Math.acos((newDistLine2 * newDistLine2 - newDistLine3 * newDistLine3 - newDistLine1 * newDistLine1)
                    / (-2 * newDistLine3 * newDistLine1));
                angle[2] = Math.acos((newDistLine1 * newDistLine1 - newDistLine2 * newDistLine2 - newDistLine3 * newDistLine3)
                    / (-2 * newDistLine3 * newDistLine2));
                
                // Keeps text box on right side of point if on right side of circle.
                if (point2.getCenterX() > centerX) {
                text[1].setX(point2.getCenterX()+15);
                text[1].setY(point2.getCenterY()+5);
                text[0].setText(String.format("%.2f", Math.toDegrees(angle[0])));
                text[1].setText(String.format("%.2f", Math.toDegrees(angle[1])));
                text[2].setText(String.format("%.2f", Math.toDegrees(angle[2])));
                gp.getChildren().add(text[1]);
                }
                // Resituates text box on the left side if point is on left half of circle.
                else if (point2.getCenterX() < centerX) {
                text[1].setX(point2.getCenterX()-40);
                text[1].setY(point2.getCenterY()+5);
                text[0].setText(String.format("%.2f", Math.toDegrees(angle[0])));
                text[1].setText(String.format("%.2f", Math.toDegrees(angle[1])));
                text[2].setText(String.format("%.2f", Math.toDegrees(angle[2])));
                gp.getChildren().add(text[1]);
                }
            }
        });
        
        // Creates event to drag 3rd point.
        point3.setOnMouseDragged(e -> { 
            if (point3.contains(e.getX(), e.getY())) {
                
                // Recalculates theta based on mouse position,
                // then aligns point along the right half of the circle.
                if (e.getX() > centerX){
                double newPoint3x = e.getX();
                double newPoint3y = e.getY();
                double dist3x = (centerX - newPoint3x);
                double dist3y = (centerY - newPoint3y);
                double newTheta3 = Math.atan(dist3y/dist3x);
                double calcPoint3x = centerX + radius * Math.cos(newTheta3);
                double calcPoint3y = centerY + radius * Math.sin(newTheta3);
                point3.setCenterX(calcPoint3x);
                point3.setCenterY(calcPoint3y);
                }
                // Same as previous code, only for the left half of the circle.
                else if (e.getX() < centerX){
                double newPoint3x = e.getX();
                double newPoint3y = e.getY();
                double dist3x = (centerX - newPoint3x);
                double dist3y = (centerY - newPoint3y);
                double newTheta3 = Math.atan(dist3y/dist3x) + pi;
                double calcPoint3x = centerX + radius * Math.cos(newTheta3);
                double calcPoint3y = centerY + radius * Math.sin(newTheta3);
                point3.setCenterX(calcPoint3x);
                point3.setCenterY(calcPoint3y);
                }

                //point3.setCenterX(e.getX());
                //point3.setCenterY(e.getY());
                line2.setEndX(point3.getCenterX());
                line2.setEndY(point3.getCenterY());
                line3.setEndX(point3.getCenterX());
                line3.setEndY(point3.getCenterY());
                
                // Calculates distance of new lines
                double newDistLine1 = Math.sqrt((Math.pow((line1.getEndX() - line1.getStartX()), 2)) + 
                            (Math.pow((line1.getEndY() - line1.getStartY()), 2)));
                double newDistLine2 = Math.sqrt((Math.pow((line2.getEndX() - line2.getStartX()), 2)) + 
                            (Math.pow((line2.getEndY() - line2.getStartY()), 2)));
                double newDistLine3 = Math.sqrt((Math.pow((line3.getEndX() - line3.getStartX()), 2)) + 
                            (Math.pow((line3.getEndY() - line3.getStartY()), 2)));
        
                // Calculates all angles.
                angle[0] = Math.acos((newDistLine3 * newDistLine3 - newDistLine2 * newDistLine2 - newDistLine1 * newDistLine1)
                    / (-2 * newDistLine2 * newDistLine1));
                angle[1] = Math.acos((newDistLine2 * newDistLine2 - newDistLine3 * newDistLine3 - newDistLine1 * newDistLine1)
                    / (-2 * newDistLine3 * newDistLine1));
                angle[2] = Math.acos((newDistLine1 * newDistLine1 - newDistLine2 * newDistLine2 - newDistLine3 * newDistLine3)
                    / (-2 * newDistLine3 * newDistLine2));
                
                // Keeps text box on right side of point if on right side of circle.
                if (point3.getCenterX() > centerX) {
                text[2].setX(point3.getCenterX()+15);
                text[2].setY(point3.getCenterY()+5);
                text[0].setText(String.format("%.2f", Math.toDegrees(angle[0])));
                text[1].setText(String.format("%.2f", Math.toDegrees(angle[1])));
                text[2].setText(String.format("%.2f", Math.toDegrees(angle[2])));
                gp.getChildren().add(text[2]);
                }
                // Resituates text box on the left side if point is on left half of circle.
                else if (point3.getCenterX() < centerX) {
                text[2].setX(point3.getCenterX()-40);
                text[2].setY(point3.getCenterY()+5);
                text[0].setText(String.format("%.2f", Math.toDegrees(angle[0])));
                text[1].setText(String.format("%.2f", Math.toDegrees(angle[1])));
                text[2].setText(String.format("%.2f", Math.toDegrees(angle[2])));
                gp.getChildren().add(text[2]);
                }
            }
        });

        // Sets large circle to color white with a black border.
        c1.setFill(Color.WHITE);
        c1.setStroke(Color.BLACK);

        stage.setScene(new Scene(gp, 500, 500));
        stage.show();
    }
}