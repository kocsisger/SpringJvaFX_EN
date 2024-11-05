package hu.unideb.inf.SpringJavaFX.frontend;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainWindowController {
    @FXML
    public Label personName;

    @FXML
    public void loadData(ActionEvent actionEvent) {
        personName.setText(JavaFXMain.manager.getPersonName());
    }
}
