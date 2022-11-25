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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button button = findViewById(R.id.share_btn);

        intent = new Intent(this,Giver_activity.class);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(this,Giver_activity.class);
//                startActivity(intent);
//            }
//        });
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

            }
        });
        RelativeLayout card2=findViewById(R.id.card_2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Taker_details.class);
                startActivity(intent);

            }
        });
        RelativeLayout card3=findViewById(R.id.card_3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Taker_details.class);
                startActivity(intent);

            }
        });
        RelativeLayout card4=findViewById(R.id.card_4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Taker_details.class);
                startActivity(intent);

            }
        });

    }


    public void onClick(View view){
        startActivity(intent);
    }
    }

