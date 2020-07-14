package com.example.smartmoney;

public class ExpenseDB {

    String expensename;
    String expenseresult;
    String expensedate;

    public ExpenseDB() {
    }

    public ExpenseDB(String expensename, String expenseresult, String expensedate){

        this.expensename = expensename;
        this.expenseresult = expenseresult;
        this.expensedate = expensedate;
    }

    public String getExpensename() {
        return expensename;
    }

    public void setExpensename(String expensename) {
        this.expensename = expensename;
    }

    public String getExpenseresult() {
        return expenseresult;
    }

    public void setExpenseresult(String expenseresult) {
        this.expenseresult = expenseresult;
    }

    public String getExpensedate() {
        return expensedate;
    }

    public void setExpensedate(String expensedate) {
        this.expensedate = expensedate;
    }
}

