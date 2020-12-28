package sample.DAO.impl;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.ConnectorToBD;
import sample.DAO.DAOEng;
import sample.model.EngTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EndImpl implements DAOEng {
    Connection con;

    public static ObservableList<EngTable> selectAll() {
        ObservableList<EngTable> engList = FXCollections.observableArrayList();
        Connection con = ConnectorToBD.getConnect();
        int id;
        String student;
        int d1; int d2; int d3; int d4; int d5; int d6; int d7; int d8; int d9; int d10;
        try {
            PreparedStatement statement = con.prepareStatement(DAOEng.SQL_SELECT);
            ResultSet res = statement.executeQuery();
            while (res.next()){
                id = res.getInt(EngTable.ID_COLUMN);
                student = res.getString(EngTable.STUDENT_COLUMN);
                d1 = res.getInt(EngTable.D1_COLUMN);
                d2 = res.getInt(EngTable.D2_COLUMN);
                d3 = res.getInt(EngTable.D3_COLUMN);
                d4 = res.getInt(EngTable.D4_COLUMN);
                d5 = res.getInt(EngTable.D5_COLUMN);
                d6 = res.getInt(EngTable.D6_COLUMN);
                d7 = res.getInt(EngTable.D7_COLUMN);
                d8 = res.getInt(EngTable.D8_COLUMN);
                d9 = res.getInt(EngTable.D9_COLUMN);
                d10 = res.getInt(EngTable.D10_COLUMN);
                engList.add(new EngTable(id,student,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return engList;
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public EngTable insert() {
        return null;
    }
}
