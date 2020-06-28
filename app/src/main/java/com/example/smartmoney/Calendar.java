package com.example.smartmoney;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class Calendar extends AppCompatActivity {

    Button selectDate;
    DatePickerDialog datePickerDialog;
    TextView date;
    //CalendarView calendarView;
    int year;
    int month;
    int dayOfMonth;
    java.util.Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);


        selectDate = findViewById(R.id.btnDate);
        date = findViewById(R.id.tvSelectedDate);

        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar = java.util.Calendar.getInstance();
                year = calendar.get(java.util.Calendar.YEAR);
                month = calendar.get(java.util.Calendar.MONTH);
                dayOfMonth = calendar.get(java.util.Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(Calendar.this, new DatePickerDialog.OnDateSetListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                        date.setText(dayOfMonth + "/" + (month + 1) + "/" + year);

                    }
                }, year, month, dayOfMonth);
                datePickerDialog.show();


            }
        });

    }
}
