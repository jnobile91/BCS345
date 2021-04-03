package week9demo;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Week9Demo extends Application  {
  public static void main(String[] args) {
    launch(args); 
  }  

  @Override
  public void start(Stage stage) throws Exception {
    Shape shp;
    shp = new Circle(400,400,50);
    Label lbl = new Label("Text here");
    List<Shape> lst = new ArrayList<Shape>();
    lst.add( new Text(50,50,"Joe"));
    lst.add( new Rectangle(80,80,200,200));
    lst.add( new Line(150,150,400,400));


    Control[] arrCrt= new Control[5];
    arrCrt[0] = new TextField();
    arrCrt[1] = new Button();

    Group gp= new Group(shp, lbl);

    for(Shape s: lst){
      gp.getChildren().add(s);
    }

    for(Control c: arrCrt){
      // gp.getChildren().add(c);
    }

     stage.setScene(new Scene(gp, 600, 600));
     stage.show();
  }
}












/* // Example of inheritance with an abstract class
public class Week9Demo extends Student implements StudentInterface{
    
    int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
        Week9Demo w9 = new Week9Demo();
        System.out.println("Age is " + w9.getAge());
    } 
    
    @Override
    public void setAge() {
        
    }
    
    @Override
    void setId() {
        
    }
}

abstract class Student {
    int age = 12;
    abstract void setId();
}

interface StudentInterface{
    void setAge();
}
*/