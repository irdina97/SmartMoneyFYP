package com.example.smartmoney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CalcExp extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button addExp;
    private Button subExp;
    private Button dec;
    private Button clear;
    private Button equalExp;
    private TextView infoExp;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char EQU = 0;
    private double vall1 = Double.NaN;
    private double vall2;
    private char ACTION;

    Button selectDateExp;
    Button btnsave;
    DatabaseReference reffExpense;
    ExpenseDB expenseDB;
    //long maxid=0;
    DatePickerDialog datePickerDialog;
    TextView expensedate, expenseresult;
    int year;
    int month;
    int dayOfMonth;
    java.util.Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_exp);

        /*Toast.makeText(CalcFYP.this, "Firebase connection success", Toast.LENGTH_LONG).show();*/


      /*reffIncome.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists())
                    maxid=(snapshot.getChildrenCount());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });*/

        btnsave = findViewById(R.id.btnSaveExp); //from calcExp
        expenseDB = new ExpenseDB();
        reffExpense = FirebaseDatabase.getInstance().getReference().child("ExpenseDB");
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expenseDB.setExpenseresult(Double.toString(vall1));
                expenseDB.setExpensedate(expensedate.getText().toString().trim());
                reffExpense.push().setValue(expenseDB);
                //reffIncome.child(String.valueOf(maxid + 1)).setValue(incomeDB);
                reffExpense.child("3").setValue(expenseDB);
                Toast.makeText(CalcExp.this, "data is inserted", Toast.LENGTH_LONG).show();
            }
        });

        /*btnsave = findViewById(R.id.btnSave);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Float resultCal = Float.parseFloat((result.getText().toString().trim()));
                incomeDB.setResult(Double.toString(val1));
                incomeDB.setDate(date.getText().toString().trim());
                //calculation.setResult(resultCal);
                //reff.push().setValue(calculation);
                reff.push().setValue(incomeDB);
                reff.child(String.valueOf(maxid + 1)).setValue(incomeDB);
                Toast.makeText(CalcFYP.this, "data is inserted", Toast.LENGTH_LONG).show();
            }
        });*/

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("CALCULATOR");

        selectDateExp = findViewById(R.id.btnDate);
        expensedate = findViewById(R.id.tvSelectedDate);

        selectDateExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar = java.util.Calendar.getInstance();
                year = calendar.get(java.util.Calendar.YEAR);
                month = calendar.get(java.util.Calendar.MONTH);
                dayOfMonth = calendar.get(java.util.Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(CalcExp.this, new DatePickerDialog.OnDateSetListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                        expensedate.setText(dayOfMonth + "/" + (month + 1) + "/" + year);

                    }
                }, year, month, dayOfMonth);
                datePickerDialog.show();


            }
        });

        setupViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                infoExp.setText(infoExp.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                infoExp.setText(infoExp.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                infoExp.setText(infoExp.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                infoExp.setText(infoExp.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                infoExp.setText(infoExp.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                infoExp.setText(infoExp.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                infoExp.setText(infoExp.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                infoExp.setText(infoExp.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                infoExp.setText(infoExp.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                infoExp.setText(infoExp.getText().toString() + "9");
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                infoExp.setText(infoExp.getText().toString() + ".");
            }
        });

        subExp.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                expenseresult.setText(vall1 + "-");
                infoExp.setText(null);
            }
        });

        addExp.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                expenseresult.setText(vall1 + "+");
                infoExp.setText(null);
            }
        });

        equalExp.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                expenseresult.setText(expenseresult.getText().toString() + vall2 + "=" + vall1);
                infoExp.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoExp.getText().length() > 0) {
                    CharSequence name = infoExp.getText().toString();
                    infoExp.setText(name.subSequence(0, name.length() - 1));
                } else {
                    vall1 = Double.NaN;
                    vall2 = Double.NaN;
                    infoExp.setText(null);
                    expenseresult.setText(null);
                }
            }
        });

    }

    private void setupViews() {

        one = findViewById(R.id.btn1);
        zero = findViewById(R.id.btn0);
        two = findViewById(R.id.btn2);
        three = findViewById(R.id.btn3);
        four = findViewById(R.id.btn4);
        five = findViewById(R.id.btn5);
        six = findViewById(R.id.btn6);
        seven = findViewById(R.id.btn7);
        eight = findViewById(R.id.btn8);
        nine = findViewById(R.id.btn9);
        addExp = findViewById(R.id.btnAdditionExp);
        subExp = findViewById(R.id.btnSubExp);
        dec = findViewById(R.id.btnDecExp);
        equalExp = findViewById(R.id.btnDoneExp);
        infoExp = findViewById(R.id.ControlExp);
        expenseresult = findViewById(R.id.ResultExp);
        clear = findViewById(R.id.btnDelete);

    }

    private void compute() {
        if (!Double.isNaN(vall1)) {
            vall2 = Double.parseDouble(infoExp.getText().toString());

            switch (ACTION) {
                case ADDITION:
                    vall1 = vall1 + vall2;
                    break;
                case SUBTRACTION:
                    vall1 = vall1 - vall2;
                    break;
                case EQU:
                    break;

            }

        } else {
            vall1 = Double.parseDouble(infoExp.getText().toString());
        }

    }


}
