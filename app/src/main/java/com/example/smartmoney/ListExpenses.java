package com.example.smartmoney;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Objects;


public class ListExpenses extends AppCompatActivity implements View.OnClickListener{

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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Expenses List");

        ImageButton btnGuitar = findViewById(R.id.btnGuitar);
        ImageButton btnPiano = findViewById(R.id.btnPiano);
        ImageButton btnArt = findViewById(R.id.btnArt);
        ImageButton btnSocial = findViewById(R.id.btnSocial);
        ImageButton btnHealth = findViewById(R.id.btnHealth);
        ImageButton btnBeauty = findViewById(R.id.btnBeauty);
        ImageButton btnGift = findViewById(R.id.btnGift);
        ImageButton btnBook = findViewById(R.id.btnBook);
        ImageButton btnEducation = findViewById(R.id.btnEducation);
        ImageButton btnBill = findViewById(R.id.btnBill);
        ImageButton btnElectronic = findViewById(R.id.btnElectronic);
        ImageButton btnPhone = findViewById(R.id.btnPhone);
        ImageButton btnHome = findViewById(R.id.btnHome);

        btnGuitar.setOnClickListener(this);
        btnPiano.setOnClickListener(this);
        btnArt.setOnClickListener(this);
        btnSocial.setOnClickListener(this);
        btnHealth.setOnClickListener(this);
        btnBeauty.setOnClickListener(this);
        btnGift.setOnClickListener(this);
        btnBook.setOnClickListener(this);
        btnEducation.setOnClickListener(this);
        btnBill.setOnClickListener(this);
        btnElectronic.setOnClickListener(this);
        btnPhone.setOnClickListener(this);
        btnHome.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnGuitar:
                Intent intent = new Intent(ListExpenses.this, CalcFYP.class);
                startActivity(intent);
                Toast.makeText(this, "Guitar is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnPiano:
                Toast.makeText(this, "Piano is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnArt:
                Toast.makeText(this, "Art is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSocial:
                Toast.makeText(this, "Social is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnHealth:
                Toast.makeText(this, "Health is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBeauty:
                Toast.makeText(this, "Beauty is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGift:
                Toast.makeText(this, "Gift is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBook:
                Toast.makeText(this, "Book is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnEducation:
                Toast.makeText(this, "Education is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBill:
                Toast.makeText(this, "Bill is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnElectronic:
                Toast.makeText(this, "Electronic is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnPhone:
                Toast.makeText(this, "Phone is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnHome:
                Toast.makeText(this, "Home is clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
