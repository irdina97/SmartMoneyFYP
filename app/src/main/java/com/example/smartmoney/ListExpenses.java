package com.example.smartmoney;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class ListExpenses extends AppCompatActivity {

    private ImageButton btnGuitar;
    private ImageButton btnPiano;
    private ImageButton btnArt;
    private ImageButton btnSocial;
    private ImageButton btnHealth;
    private ImageButton btnBeauty;
    private ImageButton btnGift;
    private ImageButton btnBook;
    private ImageButton btnEducation;
    private ImageButton btnBill;
    private ImageButton btnElectronic;
    private ImageButton btnPhone;
    private ImageButton btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_expenses);

        ImageButton btnGuitar = findViewById(R.id.btnGuitar);
        btnGuitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExpenses.this, CalcFYP.class);
                startActivity(intent);

            }
        });

        ImageButton btnPiano = findViewById(R.id.btnPiano);
        btnPiano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExpenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnArt = findViewById(R.id.btnArt);
        btnArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExpenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnSocial = findViewById(R.id.btnSocial);
        btnSocial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExpenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnHealth = findViewById(R.id.btnHealth);
        btnHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExpenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnBeauty = findViewById(R.id.btnBeauty);
        btnBeauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExpenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnGift = findViewById(R.id.btnGift);
        btnGift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExpenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnBook = findViewById(R.id.btnBook);
        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExpenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnEducation = findViewById(R.id.btnEducation);
        btnEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExpenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnBill = findViewById(R.id.btnBill);
        btnBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExpenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnElectronic = findViewById(R.id.btnElectronic);
        btnElectronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExpenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnPhone = findViewById(R.id.btnPhone);
        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExpenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });

        ImageButton btnHome = findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExpenses.this, CalcFYP.class);
                startActivity(intent);
            }
        });
    }

}
