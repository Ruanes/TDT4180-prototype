package øving5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ChoseKonkController {
	
	@FXML Button btnSok, done;
	@FXML TextField srcField;
	
	@FXML private void doneAction() {
		Stage stage = (Stage) done.getScene().getWindow();
		stage.close();
	}
}
