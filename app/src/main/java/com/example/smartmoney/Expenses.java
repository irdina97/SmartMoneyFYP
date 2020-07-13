
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

   // DatabaseReference reffExpense;

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

        /*reffExpense = FirebaseDatabase.getInstance().getReference().child("ExpenseDB");
        reffExpense.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                //String resultt = snapshot.child("result").getValue().toString();
                //expense.setText(resultt);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });*/


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


        btnShopping.setOnClickListener(this);
        btnTravel.setOnClickListener(this);
        btnGame.setOnClickListener(this);
        btnFood.setOnClickListener(this);
        btnSport.setOnClickListener(this);
        btnPet.setOnClickListener(this);
        btnTransport.setOnClickListener(this);
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

       /* imageButton = findViewById(R.id.btnGuitar);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId");
            imageButton.setImageResource(resId);
        }*/

       //test imagebutton add
      /* Intent intent = getIntent();
       Bundle bundle = this.getIntent().getExtras();
       String button = intent.getStringExtra("expenses");*/

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShopping:
                Intent intent = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent);
                Toast.makeText(this, "Shopping is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnTravel:
                Intent intent1 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent1);
                Toast.makeText(this, "Travel is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGame:
                Intent intent2 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent2);
                Toast.makeText(this, "Game is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnFood:
                Intent intent3 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent3);
                Toast.makeText(this, "Food is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSport:
                Intent intent4 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent4);
                Toast.makeText(this, "Sport is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnPet:
                Intent intent5 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent5);
                Toast.makeText(this, "Pet is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnTransport:
                Intent intent6 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent6);
                Toast.makeText(this, "Transport is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGuitar:
                Intent intent7 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent7);
                Toast.makeText(this, "Guitar is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnPiano:
                Intent intent8 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent8);
                Toast.makeText(this, "Piano is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnArt:
                Intent intent9 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent9);
                Toast.makeText(this, "Art is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSocial:
                Intent intent10 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent10);
                Toast.makeText(this, "Social is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnHealth:
                Intent intent11 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent11);
                Toast.makeText(this, "Health is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBeauty:
                Intent intent12= new Intent(Expenses.this, CalcExp.class);
                startActivity(intent12);
                Toast.makeText(this, "Beauty is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGift:
                Intent intent13 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent13);
                Toast.makeText(this, "Gift is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBook:
                Intent intent14 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent14);
                Toast.makeText(this, "Book is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnEducation:
                Intent intent15 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent15);
                Toast.makeText(this, "Education is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBill:
                Intent intent16 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent16);
                Toast.makeText(this, "Bill is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnElectronic:
                Intent intent17= new Intent(Expenses.this, CalcExp.class);
                startActivity(intent17);
                Toast.makeText(this, "Electronic is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnPhone:
                Intent intent18 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent18);
                Toast.makeText(this, "Phone is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnHome:
                Intent intent19 = new Intent(Expenses.this, CalcExp.class);
                startActivity(intent19);
                Toast.makeText(this, "Home is clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}