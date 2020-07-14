package com.example.smartmoney;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class EditSaving extends AppCompatActivity {

    Button save_saving;
    DatabaseReference reffSaving;
    SavingDB savingDB;
    EditText NoSaving, NoCurrentSaving;
    TextView currentSaving;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_saving);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("EDIT SAVING");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        save_saving = findViewById(R.id.SaveGoal); //from editsaving
        NoSaving = findViewById(R.id.NoGoal);
        NoCurrentSaving = findViewById(R.id.NoCurrentSaving);
        savingDB = new SavingDB();
        reffSaving = FirebaseDatabase.getInstance().getReference().child("SavingDB");
        save_saving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savingDB.setSavingGoal(NoSaving.getText().toString().trim());
                savingDB.setSaving(NoCurrentSaving.getText().toString().trim());
                reffSaving.push().setValue(savingDB);
                reffSaving.child("1").setValue(savingDB);
                Toast.makeText(EditSaving.this, "Save!", Toast.LENGTH_LONG).show();
            }
        });

        currentSaving = findViewById(R.id.SavingValue);
        savingDB = new SavingDB();
        reffSaving = FirebaseDatabase.getInstance().getReference().child("SavingDB").child("1");
        reffSaving.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String saving = snapshot.child("saving").getValue().toString();
                currentSaving.setText(saving);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }


}
