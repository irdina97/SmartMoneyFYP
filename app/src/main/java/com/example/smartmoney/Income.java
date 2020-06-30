
package com.example.smartmoney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Income extends AppCompatActivity {

    private ImageButton btnIncome;
    private ImageButton btnReward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);

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


        // EditText editText = findViewById(R.id.editText);
        // MyKeyboard keyboard = findViewById(R.id.keyboard);
        // editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
        // editText.setTextIsSelectable(true);

        //InputConnection ic = editText.onCreateInputConnection(new EditorInfo());
        // keyboard.setInputConnection(ic);
    }

}