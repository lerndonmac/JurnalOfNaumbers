package sample.control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.DAO.impl.EndImpl;
import sample.model.EngTable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {
    private static ObservableList<EngTable> engTableList = FXCollections.observableArrayList();
    @FXML
    public TableView<EngTable> engTable;@FXML
    public TableColumn<EngTable,String> studColl;@FXML
    public TableColumn<EngTable,String> d1Coll;@FXML
    public TableColumn<EngTable,String> d2Coll;@FXML
    public TableColumn<EngTable,String> d3Coll;@FXML
    public TableColumn<EngTable,String> d4Coll;@FXML
    public TableColumn<EngTable,String> d5Coll;@FXML
    public TableColumn<EngTable,String> d6Coll;@FXML
    public TableColumn<EngTable,String> d7Coll;@FXML
    public TableColumn<EngTable,String> d8Coll;@FXML
    public TableColumn<EngTable,String> d9Coll;@FXML
    public TableColumn<EngTable,String> d10Coll;

    @FXML
    public Label kursLable;@FXML
    public Button saveBot;
    @FXML
    public void initialize(){
        saveBot.setOnAction(ActionEvent ->{
            //незнаю как выполнить
        });
        kursLable.setText(EngTable.TABLE_NAME);
        initEng();
        studColl.setCellValueFactory(new PropertyValueFactory<EngTable,String>(EngTable.STUDENT_COLUMN));
        d1Coll.setCellValueFactory(new PropertyValueFactory<EngTable,String>(EngTable.D1_COLUMN));
        d2Coll.setCellValueFactory(new PropertyValueFactory<EngTable,String>(EngTable.D2_COLUMN));
        d3Coll.setCellValueFactory(new PropertyValueFactory<EngTable,String>(EngTable.D3_COLUMN));
        d4Coll.setCellValueFactory(new PropertyValueFactory<EngTable,String>(EngTable.D4_COLUMN));
        d5Coll.setCellValueFactory(new PropertyValueFactory<EngTable,String>(EngTable.D5_COLUMN));
        d6Coll.setCellValueFactory(new PropertyValueFactory<EngTable,String>(EngTable.D6_COLUMN));
        d7Coll.setCellValueFactory(new PropertyValueFactory<EngTable,String>(EngTable.D7_COLUMN));
        d8Coll.setCellValueFactory(new PropertyValueFactory<EngTable,String>(EngTable.D8_COLUMN));
        d9Coll.setCellValueFactory(new PropertyValueFactory<EngTable,String>(EngTable.D9_COLUMN));
        d10Coll.setCellValueFactory(new PropertyValueFactory<EngTable,String>(EngTable.D10_COLUMN));
        engTable.setItems(engTableList);
        saveBot.setOnAction(ActionEvent ->{
        });
    }


    public void closeItem(ActionEvent actionEvent) {
        saveBot.getScene().getWindow().hide();
    }

    public void exportItem(ActionEvent actionEvent) {
            File file = new File("CSVDump.csv");
        try {
            FileWriter fw = new FileWriter(file);
            file.createNewFile();
            EngTable engTable1 = new EngTable();
            fw.write(engTable1.CSVFirstn());
            for (EngTable eng:engTableList) {
                fw.write(eng.ToCSVString());
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void initEng(){
        engTableList = EndImpl.selectAll();
    }
}
