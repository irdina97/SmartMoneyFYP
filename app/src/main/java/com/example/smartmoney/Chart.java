
package com.example.smartmoney;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Chart extends AppCompatActivity {

    // int calsBurned = 0;
    //int calsConsumed = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);


        //public void addBurned(View v) {
        // Get the new value from a user input:
        // EditText burnedEditText = findViewById(R.id.burned);

        // Update the old value:
        // calsBurned = Integer.parseInt(burnedEditText.getText().toString());
        //updateChart();
        // }

        //public void addConsumed(View v) {
        // Get the new value from a user input:
        // EditText consumedEditText = findViewById(R.id.consumed);

        // Update the old value:
        //calsConsumed = Integer.parseInt(consumedEditText.getText().toString());
        //updateChart();
    }
    //private void updateChart(){
    // Update the text in a center of the chart:
    // TextView numberOfCals = findViewById(R.id.number_of_calories);
    // numberOfCals.setText(calsBurned + " / " + calsConsumed);

    // Calculate the slice size and update the pie chart:
    // ProgressBar pieChart = findViewById(R.id.stats_progressbar);
    //double d = (double) calsBurned / (double) calsConsumed;
    //int progress = (int) (d * 100);
    //pieChart.setProgress(progress);
    // }
}