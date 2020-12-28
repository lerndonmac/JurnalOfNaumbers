package sample.DAO;

import javafx.collections.ObservableList;
import sample.model.EngTable;

public interface DAOEng {
    String SQL_SELECT = "SELECT * FROM "+ EngTable.TABLE_NAME;
    String SQL_UPDATE = String.format("UPDATE %s SET %s = ?, %s = ?, %s = ?, %s = ?, %s = ?, %s = ?, %s = ?, %s = ?, %s = ?, %s = ? WHERE (%s = ?)"
            ,EngTable.TABLE_NAME,EngTable.D1_COLUMN,EngTable.D2_COLUMN,EngTable.D3_COLUMN,EngTable.D4_COLUMN,
            EngTable.D5_COLUMN,EngTable.D6_COLUMN,EngTable.D7_COLUMN,EngTable.D8_COLUMN,EngTable.D9_COLUMN,EngTable.D1_COLUMN
            ,EngTable.ID_COLUMN);
    String SQL_DELETE = "SELECT * FROM"+ EngTable.TABLE_NAME;
    String SQL_INSERT = String.format("INSERT INTO %s (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            ,EngTable.TABLE_NAME,EngTable.STUDENT_COLUMN,EngTable.D1_COLUMN,EngTable.D2_COLUMN,EngTable.D3_COLUMN,EngTable.D4_COLUMN,
    EngTable.D5_COLUMN,EngTable.D6_COLUMN,EngTable.D7_COLUMN,EngTable.D8_COLUMN,EngTable.D9_COLUMN,EngTable.D1_COLUMN);

    static ObservableList<EngTable> selectAll(){return null;}


    void update();
    void delete();
    EngTable insert();


}
