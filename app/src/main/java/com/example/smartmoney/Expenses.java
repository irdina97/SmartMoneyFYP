
package com.example.smartmoney;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;



public class Expenses extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btnShopping;
    private ImageButton btnTravel;
    private ImageButton btnGame;
    private ImageButton btnFood;
    private ImageButton btnSport;
    private ImageButton btnPet;
    private ImageButton btnTransport;
    private ImageButton btnAddEx;

    //ImageButton imageButton;

    @SuppressLint("StaticFieldLeak")
    public static TextView resultTextView; //scan result
    ImageButton btnScanQR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("EXPENSES");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        resultTextView = findViewById(R.id.result_text); //scan result
        btnScanQR = findViewById(R.id.btnScanQR);

        btnScanQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ScanCodeActivity.class));

            }
        });

        ImageButton btnShopping = findViewById(R.id.btnShopping);
        ImageButton btnTravel = findViewById(R.id.btnTravel);
        ImageButton btnGame = findViewById(R.id.btnGame);
        ImageButton btnFood = findViewById(R.id.btnFood);
        ImageButton btnSport = findViewById(R.id.btnSport);
        ImageButton btnPet = findViewById(R.id.btnPet);
        ImageButton btnTransport = findViewById(R.id.btnTransport);
        ImageButton btnAddEx = findViewById(R.id.btnAddEx);


        btnShopping.setOnClickListener(this);
        btnTravel.setOnClickListener(this);
        btnGame.setOnClickListener(this);
        btnFood.setOnClickListener(this);
        btnSport.setOnClickListener(this);
        btnPet.setOnClickListener(this);
        btnTransport.setOnClickListener(this);
        btnAddEx.setOnClickListener(this);

       /* imageButton = findViewById(R.id.btnGuitar);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId");
            imageButton.setImageResource(resId);
        }*/

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShopping:
                Intent intent = new Intent(Expenses.this, CalcFYP.class);
                startActivity(intent);
                Toast.makeText(this, "Shopping is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnTravel:
                Intent intent1 = new Intent(Expenses.this, CalcFYP.class);
                startActivity(intent1);
                Toast.makeText(this, "Travel is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGame:
                Intent intent2 = new Intent(Expenses.this, CalcFYP.class);
                startActivity(intent2);
                Toast.makeText(this, "Game is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnFood:
                Intent intent3 = new Intent(Expenses.this, CalcFYP.class);
                startActivity(intent3);
                Toast.makeText(this, "Food is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSport:
                Intent intent4 = new Intent(Expenses.this, CalcFYP.class);
                startActivity(intent4);
                Toast.makeText(this, "Sport is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnPet:
                Intent intent5 = new Intent(Expenses.this, CalcFYP.class);
                startActivity(intent5);
                Toast.makeText(this, "Pet is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnTransport:
                Intent intent6 = new Intent(Expenses.this, CalcFYP.class);
                startActivity(intent6);
                Toast.makeText(this, "Transport is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnAddEx:
                Intent intent7 = new Intent(Expenses.this, ListExpenses.class);
                startActivity(intent7);
                break;
        }
    }
}