/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.spellchecker;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton language;

    @FXML
    private TextArea txtInsert;

    @FXML
    private Button bttSpell;

    @FXML
    private TextArea txtResult;

    @FXML
    private Label risultatoErrori;

    @FXML
    private Button bttClearText;

    @FXML
    void clearText(ActionEvent event) {

    }

    @FXML
    void selezionaLingua(ActionEvent event) {

    }

    @FXML
    void spellCheck(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert language != null : "fx:id=\"language\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtInsert != null : "fx:id=\"txtInsert\" was not injected: check your FXML file 'Scene.fxml'.";
        assert bttSpell != null : "fx:id=\"bttSpell\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert risultatoErrori != null : "fx:id=\"risultatoErrori\" was not injected: check your FXML file 'Scene.fxml'.";
        assert bttClearText != null : "fx:id=\"bttClearText\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
