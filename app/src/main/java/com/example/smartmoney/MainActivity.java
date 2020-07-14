package com.example.smartmoney;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    DatabaseReference reffIncome;
    //DatabaseReference reffExpense;
    TextView income, expense, balance, date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CardView cardView = findViewById(R.id.card_view);
        CardView cardView1 = findViewById(R.id.card_view1);
        CardView cardView2 = findViewById(R.id.card_view2);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Income.class);
                startActivity(intent);
            }
        });
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Expenses.class);
                startActivity(intent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        //retrieve data from DB
        income = findViewById(R.id.tvIncome);
        expense = findViewById(R.id.tvExpenses);
        balance = findViewById(R.id.tvBalance);
        date = findViewById(R.id.tvSelectedDate);

        reffIncome = FirebaseDatabase.getInstance().getReference().child("IncomeDB").child("1");
        reffIncome.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                String result = snapshot.child("result").getValue().toString();
                income.setText(result);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        /*reffExpense = FirebaseDatabase.getInstance().getReference().child("ExpenseDB").child("4");
        reffExpense.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String expenseresult = snapshot.child("result").getValue().toString();
                 expense.setText(expenseresult);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });*/

        //Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

      /* if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new ChartFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_piechart);
        }*/


    }

    //Navigation menu
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_profile:
                Intent intent13 = new Intent(MainActivity.this, Login.class);
                startActivity(intent13);
                Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_piechart:
                Intent intent14 = new Intent(MainActivity.this, ChartIncome.class);
                startActivity(intent14);
                Toast.makeText(this, "Chart", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_awards:
                Intent intent15 = new Intent(MainActivity.this, GoalActivity.class);
                startActivity(intent15);
                Toast.makeText(this, "Goals", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_category:
                Intent intent16 = new Intent(MainActivity.this, Income.class);
                startActivity(intent16);
                Toast.makeText(this, "Category", Toast.LENGTH_SHORT).show();
                break;

        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }


}