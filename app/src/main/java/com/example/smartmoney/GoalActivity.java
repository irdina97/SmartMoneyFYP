package com.example.smartmoney;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class GoalActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btn_Edit;
    private TextView viewValue;
    private ProgressBar progressBar;
    private SeekBar seekBar;

    DatabaseReference reffSaving;
    SavingDB savingDB;
    TextView currentGoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("SAVING");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton btn_Edit = findViewById(R.id.btn_Edit);

        btn_Edit.setOnClickListener(this);

        //progress Bar horizontal
        viewValue = findViewById(R.id.TotalSaving);
        progressBar = findViewById(R.id.savingbar);
        seekBar = findViewById(R.id.seekbar);
        currentGoal = findViewById(R.id.CurrentGoal);

        savingDB = new SavingDB();
        reffSaving = FirebaseDatabase.getInstance().getReference().child("SavingDB").child("1");
        reffSaving.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String savingGoal = snapshot.child("savingGoal").getValue().toString();
                currentGoal.setText(savingGoal);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressBar.setProgress(progress);
                viewValue.setText("" + progress + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(GoalActivity.this, EditSaving.class);
        startActivity(intent);
    }
}
