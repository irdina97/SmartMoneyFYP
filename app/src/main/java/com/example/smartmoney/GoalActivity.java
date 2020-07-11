package com.example.smartmoney;

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

public class GoalActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btn_Edit;
    private TextView viewValue;
    private ProgressBar progressBar;
    private SeekBar seekBar;

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

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressBar.setProgress(progress);
                viewValue.setText("" + progress + "%");
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
