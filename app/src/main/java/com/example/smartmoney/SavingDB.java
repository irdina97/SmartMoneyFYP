package com.example.smartmoney;

public class SavingDB {

    String savingGoal;
    String saving;

    public SavingDB() {
    }


    public SavingDB(String savingGoal, String saving){
        this.savingGoal = savingGoal;
        this.saving = saving;
    }

    public String getSavingGoal() {
        return savingGoal;
    }

    public void setSavingGoal(String savingGoal) {
        this.savingGoal = savingGoal;
    }

    public String getSaving() {
        return saving;
    }

    public void setSaving(String saving) {
        this.saving = saving;
    }
}
