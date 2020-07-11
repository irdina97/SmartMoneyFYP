package com.example.smartmoney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GoalActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btn_Edit;

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
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(GoalActivity.this, EditSaving.class);
        startActivity(intent);
    }
}
