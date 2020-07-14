package com.example.smartmoney;


public class IncomeDB {

    String Name;
    String Result;
    String Date;



public IncomeDB(){

}

public IncomeDB (String Name, String Result, String Date){
    this.Name = Name;
    this.Result = Result;
    this.Date = Date;
}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}