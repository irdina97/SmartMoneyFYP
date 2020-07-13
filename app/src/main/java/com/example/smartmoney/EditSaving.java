package com.example.smartmoney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EditSaving extends AppCompatActivity {

    Button save_edit;
    DatabaseReference reffSaving;
    SavingDB savingDB;
    EditText NoSaving;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_saving);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("EDIT SAVING");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Toast.makeText(EditSaving.this, "Firebase connection success", Toast.LENGTH_LONG).show();

        Button save_edit = findViewById(R.id.SaveGoal); //from editsaving
        savingDB = new SavingDB();
        reffSaving = FirebaseDatabase.getInstance().getReference().child("SavingDB");
        save_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savingDB.setSavingGoal(NoSaving.getText().toString().trim());
                //incomeDB.setDate(date.getText().toString().trim());
                reffSaving.push().setValue(savingDB);
                //reffIncome.child(String.valueOf(maxid + 1)).setValue(incomeDB);
                reffSaving.child("2").setValue(savingDB);
                Toast.makeText(EditSaving.this, "Saved!", Toast.LENGTH_LONG).show();
            }
        });


        /*Button save_edit = findViewById(R.id.SaveGoal);
        save_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditSaving.this, Income.class);
                startActivity(intent);
                Toast.makeText(EditSaving.this, "Saved!", Toast.LENGTH_SHORT).show();
            }
        });*/
    }


}
