
package com.example.smartmoney;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Objects;

public class Expenses extends AppCompatActivity {

    private ImageButton btnShopping;
    private ImageButton btnTravel;
    private ImageButton btnGame;
    private ImageButton btnFood;
    private ImageButton btnSport;
    private ImageButton btnPet;
    private ImageButton btnTransport;
    private ImageButton btnAddEx;

    @SuppressLint("StaticFieldLeak")
    public static TextView resultTextView; //scan result
    ImageButton btnScanQR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Expenses");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        resultTextView = findViewById(R.id.result_text); //scan result
        btnScanQR = findViewById(R.id.btnScanQR);

        ImageButton btnShopping = findViewById(R.id.btnShopping);
        btnShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnTravel = findViewById(R.id.btnTravel);
        btnTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnGame = findViewById(R.id.btnGame);
        btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnFood = findViewById(R.id.btnFood);
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnSport = findViewById(R.id.btnSport);
        btnSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnPet = findViewById(R.id.btnPet);
        btnPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnTransport = findViewById(R.id.btnTransport);
        btnTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnAddEx = findViewById(R.id.btnAddEx);
        btnAddEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expenses.this, ListExpenses.class);
                startActivity(intent);
            }
        });

        btnScanQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ScanCodeActivity.class));

            }
        });

    }
}