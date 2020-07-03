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
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

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
                Intent intent = new Intent(ListExpenses.this, Expenses.class);
                startActivity(intent);
                Toast.makeText(this, "Guitar is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnPiano:
                Intent intent1 = new Intent(ListExpenses.this, Expenses.class);
                startActivity(intent1);
                Toast.makeText(this, "Piano is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnArt:
                Intent intent2 = new Intent(ListExpenses.this, Expenses.class);
                startActivity(intent2);
                Toast.makeText(this, "Art is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSocial:
                Intent intent3 = new Intent(ListExpenses.this, Expenses.class);
                startActivity(intent3);
                Toast.makeText(this, "Social is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnHealth:
                Intent intent4 = new Intent(ListExpenses.this, Expenses.class);
                startActivity(intent4);
                Toast.makeText(this, "Health is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBeauty:
                Intent intent5 = new Intent(ListExpenses.this, Expenses.class);
                startActivity(intent5);
                Toast.makeText(this, "Beauty is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGift:
                Intent intent6 = new Intent(ListExpenses.this, Expenses.class);
                startActivity(intent6);
                Toast.makeText(this, "Gift is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBook:
                Intent intent7 = new Intent(ListExpenses.this, Expenses.class);
                startActivity(intent7);
                Toast.makeText(this, "Book is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnEducation:
                Intent intent8 = new Intent(ListExpenses.this, Expenses.class);
                startActivity(intent8);
                Toast.makeText(this, "Education is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBill:
                Intent intent9 = new Intent(ListExpenses.this, Expenses.class);
                startActivity(intent9);
                Toast.makeText(this, "Bill is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnElectronic:
                Intent intent10 = new Intent(ListExpenses.this, Expenses.class);
                startActivity(intent10);
                Toast.makeText(this, "Electronic is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnPhone:
                Intent intent11 = new Intent(ListExpenses.this, Expenses.class);
                startActivity(intent11);
                Toast.makeText(this, "Phone is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnHome:
                Intent intent12 = new Intent(ListExpenses.this, Expenses.class);
                startActivity(intent12);
                Toast.makeText(this, "Home is clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
