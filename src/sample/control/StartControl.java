package sample.control;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class StartControl {
    @FXML
    public Button openEnglishTable;

    @FXML
    public void initialize(){
        openEnglishTable.setOnAction(ActionEvent -> {
            openEnglishTable.getScene().getWindow().hide();
            try {
                Stage primaryStage = new Stage();
                Parent root = null;
                root = FXMLLoader.load(getClass().getResource("../view/sample.fxml"));
                primaryStage.setTitle("English Window");
                primaryStage.setScene(new Scene(root));
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }
}
