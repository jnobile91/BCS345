import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    @FXML
    private Button mZoom;
    @FXML
    private TextArea mEditor;
    int txtSize = 12;

    /**
     *
     * Initializes the controller class.
     *
     */
    Stage stg;

    @FXML
    private Button mOpenFile;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
    }

    @FXML
    private void mOpenTextFileFunc(ActionEvent event) throws FileNotFoundException {
        FileChooser fs = new FileChooser();
        File file = fs.showOpenDialog(null);
        if (file != null) {
            openFile(file);
        }
    }

    private void openFile(File file) throws FileNotFoundException {
        String str = "";
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            str += sc.nextLine();
        }
        mEditor.setText(str);
    }

    @FXML
    private void mZoomInOnText(ActionEvent event) {
        mEditor.setFont(new Font(txtSize++));
    }
}