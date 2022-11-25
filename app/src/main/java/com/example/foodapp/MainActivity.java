package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
    }

    public void onClick(View view){
        startActivity(intent);
    }
    }

