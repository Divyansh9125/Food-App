package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    String choice="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button button = findViewById(R.id.share_btn);

        intent = new Intent(this,Giver_activity.class);
        Button userBtn=findViewById(R.id.Giver_details);
        userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,UserDetails.class);
                  startActivity(intent);

            }
        });
        RelativeLayout card1=findViewById(R.id.card_1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Taker_details.class);
                startActivity(intent);
               choice="v8";
            }
        });
        // details
        RelativeLayout card2=findViewById(R.id.card_2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Taker_details.class);
                startActivity(intent);
                choice="n8";
            }
        });
        RelativeLayout card3=findViewById(R.id.card_3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Taker_details.class);
                startActivity(intent);
                choice="v5";
            }
        });
        RelativeLayout card4=findViewById(R.id.card_4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Taker_details.class);
                startActivity(intent);
                choice="n5";
            }
        });

    }


    public void onClick(View view){
        startActivity(intent);
    }
    }

