
package com.example.smartmoney;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.View;

public class MyKeyboard extends LinearLayout implements View.OnClickListener {


    private SparseArray<String> keyValues = new SparseArray<>();
    private InputConnection inputConnection;


    public MyKeyboard(Context context){
        this(context, null, 0);
    }

    public MyKeyboard(Context context, AttributeSet attrs){
        this(context, attrs, 0);
    }

    public MyKeyboard(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, 0);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        LayoutInflater.from(context).inflate(R.layout.keyboard, this, true);
        Button button1 = findViewById(R.id.btn_1);
        button1.setOnClickListener(this);
        Button button2 = findViewById(R.id.btn_2);
        button2.setOnClickListener(this);
        Button button3 = findViewById(R.id.btn_3);
        button3.setOnClickListener(this);
        Button button4 = findViewById(R.id.btn_4);
        button4.setOnClickListener(this);
        Button button5 = findViewById(R.id.btn_5);
        button5.setOnClickListener(this);
        Button button6 = findViewById(R.id.btn_6);
        button6.setOnClickListener(this);
        Button button7 = findViewById(R.id.btn_7);
        button7.setOnClickListener(this);
        Button button8 = findViewById(R.id.btn_8);
        button8.setOnClickListener(this);
        Button button9 = findViewById(R.id.btn_9);
        button9.setOnClickListener(this);
        Button button0 = findViewById(R.id.btn_0);
        button0.setOnClickListener(this);
        Button buttonDelete = findViewById(R.id.btn_delete);
        buttonDelete.setOnClickListener(this);
        Button buttonDone = findViewById(R.id.btn_done);
        buttonDone.setOnClickListener(this);

        keyValues.put(R.id.btn_1, "1");
        keyValues.put(R.id.btn_2, "2");
        keyValues.put(R.id.btn_3, "3");
        keyValues.put(R.id.btn_4, "4");
        keyValues.put(R.id.btn_5, "5");
        keyValues.put(R.id.btn_6, "6");
        keyValues.put(R.id.btn_7, "7");
        keyValues.put(R.id.btn_8, "9");
        keyValues.put(R.id.btn_0, "0");
        keyValues.put(R.id.btn_done, "\n");
    }

    @Override
    public void onClick(View v) {
        if (inputConnection == null)
            return;

        if (v.getId() == R.id.btn_delete) {
            CharSequence selectedText = inputConnection.getSelectedText(0);

            if (TextUtils.isEmpty(selectedText)) {
                inputConnection.deleteSurroundingText(1,0);
            } else {
                inputConnection.commitText("", 1);
            }
        } else {
            String value =keyValues.get(v.getId());
            inputConnection.commitText(value, 1);
        }
    }
    public void setInputConnection(InputConnection ic) {
        inputConnection = ic;
    }
}