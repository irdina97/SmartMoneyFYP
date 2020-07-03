
package com.example.smartmoney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


import java.util.Objects;

public class Income extends AppCompatActivity {

    private ImageButton btnIncome;
    private ImageButton btnReward;
    private ImageButton btnSale;
    private ImageButton btnRefund;
    private ImageButton btnSaving;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Income");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        ImageButton btnIncome = findViewById(R.id.btnIncome);
        btnIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Income.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnReward = findViewById(R.id.btnReward);
        btnReward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Income.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnSale = findViewById(R.id.btnSale);
        btnSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Income.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnRefund = findViewById(R.id.btnRefund);
        btnRefund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Income.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnSaving = findViewById(R.id.btnSaving);
        btnSaving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Income.this, CalcFYP.class);
                startActivity(intent);
            }
        });



        // EditText editText = findViewById(R.id.editText);
        // MyKeyboard keyboard = findViewById(R.id.keyboard);
        // editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
        // editText.setTextIsSelectable(true);

        //InputConnection ic = editText.onCreateInputConnection(new EditorInfo());
        // keyboard.setInputConnection(ic);
    }

}