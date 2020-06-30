
package com.example.smartmoney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Expenses extends AppCompatActivity {

    private ImageButton btnShopping;
    private ImageButton btnTravel;
    private ImageButton btnGame;
    private ImageButton btnFood;
    private ImageButton btnSport;
    private ImageButton btnPet;
    private ImageButton btnTransport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses);

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

    }
}