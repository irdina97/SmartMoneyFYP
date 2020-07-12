package com.example.smartmoney;

public class ExpenseDB {

    String Name;
    String Result;
    String Date;

    public ExpenseDB() {
    }

    public ExpenseDB(String Namee, String Resultt, String Datee){
        this.Name = Namee;
        this.Result = Resultt;
        this.Date = Datee;
    }

    public String getNamee() {
        return Name;
    }

    public void setNamee(String namee) {
        Name = namee;
    }

    public String getResultt() {
        return Result;
    }

    public void setResultt(String resultt) {
        Result = resultt;
    }

    public String getDatee() {
        return Date;
    }

    public void setDatee(String datee) {
        Date = datee;
    }
}

