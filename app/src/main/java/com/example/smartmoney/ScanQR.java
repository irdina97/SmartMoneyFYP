package com.example.smartmoney;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ScanQR extends AppCompatActivity {

    @SuppressLint("StaticFieldLeak")
    public static TextView resultTextView;
    ImageButton scan_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qr);

        resultTextView = findViewById(R.id.result_text);
        scan_btn = findViewById(R.id.btn_scan);

        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), ScanCodeActivity.class));

            }
        });
    }
}
