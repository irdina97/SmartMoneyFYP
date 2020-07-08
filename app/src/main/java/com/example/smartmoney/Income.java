
package com.example.smartmoney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class Income extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btnIncome;
    private ImageButton btnReward;
    private ImageButton btnSale;
    private ImageButton btnRefund;
    private ImageButton btnSaving;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("INCOME");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton btnIncome = findViewById(R.id.btnIncome);
        ImageButton btnReward = findViewById(R.id.btnReward);
        ImageButton btnSale = findViewById(R.id.btnSale);
        ImageButton btnRefund = findViewById(R.id.btnRefund);
        ImageButton btnSaving = findViewById(R.id.btnSaving);

        btnIncome.setOnClickListener(this);
        btnReward.setOnClickListener(this);
        btnRefund.setOnClickListener(this);
        btnSaving.setOnClickListener(this);
        btnSale.setOnClickListener(this);

        // EditText editText = findViewById(R.id.editText);
        // MyKeyboard keyboard = findViewById(R.id.keyboard);
        // editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
        // editText.setTextIsSelectable(true);

        //InputConnection ic = editText.onCreateInputConnection(new EditorInfo());
        // keyboard.setInputConnection(ic);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnIncome:
                Intent intent = new Intent(Income.this, CalcFYP.class);
                startActivity(intent);
                Toast.makeText(this, "Income is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnReward:
                Intent intent1 = new Intent(Income.this, CalcFYP.class);
                startActivity(intent1);
                Toast.makeText(this, "Reward is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnRefund:
                Intent intent2 = new Intent(Income.this, CalcFYP.class);
                startActivity(intent2);
                Toast.makeText(this, "Refund is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSale:
                Intent intent3 = new Intent(Income.this, CalcFYP.class);
                startActivity(intent3);
                Toast.makeText(this, "Sale is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSaving:
                Intent intent4 = new Intent(Income.this, CalcFYP.class);
                startActivity(intent4);
                Toast.makeText(this, "Saving is clicked", Toast.LENGTH_SHORT).show();
                break;

        }
    }

}