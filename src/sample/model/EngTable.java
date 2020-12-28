package sample.model;

public class EngTable {
    public static final String TABLE_NAME = "english";
    public static final String ID_COLUMN = "id";
    public static final String STUDENT_COLUMN = "student";
    public static final String D1_COLUMN = "d1";
    public static final String D2_COLUMN = "d2";
    public static final String D3_COLUMN = "d3";
    public static final String D4_COLUMN = "d4";
    public static final String D5_COLUMN = "d5";
    public static final String D6_COLUMN = "d6";
    public static final String D7_COLUMN = "d7";
    public static final String D8_COLUMN = "d8";
    public static final String D9_COLUMN = "d9";
    public static final String D10_COLUMN = "d10";

    private int id;
    private String student;
    private int d1;
    private int d2;
    private int d3;
    private int d4;
    private int d5;
    private int d6;
    private int d7;
    private int d8;
    private int d9;
    private int d10;

    public EngTable() {
    }
    public EngTable(int id, String student,
                    int d1, int d2, int d3, int d4, int d5, int d6, int d7, int d8, int d9, int d10) {
        this.id = id;
        this.student = student;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.d5 = d5;
        this.d6 = d6;
        this.d7 = d7;
        this.d8 = d8;
        this.d9 = d9;
        this.d10 = d10;
    }
    public int getId(){return id;}
    public String getStudent() {
        return student;
    }
    public void setStudent(String student) {
        this.student = student;
    }
    public int getD1() {
        return d1;
    }
    public void setD1(int d1) {
        this.d1 = d1;
    }
    public int getD2() {
        return d2;
    }
    public void setD2(int d2) {
        this.d2 = d2;
    }
    public int getD3() {
        return d3;
    }
    public void setD3(int d3) {
        this.d3 = d3;
    }
    public int getD4() {
        return d4;
    }
    public void setD4(int d4) {
        this.d4 = d4;
    }
    public int getD5() {
        return d5;
    }
    public void setD5(int d5) {
        this.d5 = d5;
    }
    public int getD6() {
        return d6;
    }
    public void setD6(int d6) {
        this.d6 = d6;
    }
    public int getD7() {
        return d7;
    }
    public void setD7(int d7) {
        this.d7 = d7;
    }
    public int getD8() {
        return d8;
    }
    public void setD8(int d8) {
        this.d8 = d8;
    }
    public int getD9() {
        return d9;
    }
    public void setD9(int d9) {
        this.d9 = d9;
    }
    public int getD10() {
        return d10;
    }
    public void setD10(int d10) {
        this.d10 = d10;
    }

    public String CSVFirstn() {
        return ID_COLUMN+","+STUDENT_COLUMN+","+D1_COLUMN+","+D2_COLUMN+","+D3_COLUMN+","+D4_COLUMN+","+D5_COLUMN
                +","+D6_COLUMN+","+D7_COLUMN+","+D8_COLUMN+","+D9_COLUMN+","+D10_COLUMN;
    }
    public String ToCSVString(){
        return "\n"+getId()+","+getStudent()+","+
                getD1()+","+getD2()+","+getD3()+","+getD4()+","+getD5()+","+getD6()+","+getD7()+","+getD8()+","+getD9()+","+getD10();
    }
}
