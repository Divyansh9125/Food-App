package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class UserDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
        Button userBtn=findViewById(R.id.submitButton);
        userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserDetails.this, MainActivity.class);
                TextView fnameView = findViewById(R.id.nameInput);
                TextView lnameView = findViewById(R.id.name2Input);
                TextView emailView = findViewById(R.id.emailInput);
                TextView contactView = findViewById(R.id.favoriteNumberInput);

                String fname = fnameView.getText().toString();
                String lname = lnameView.getText().toString();
                String email = emailView.getText().toString();
                String contact = contactView.getText().toString();

                OkHttpClient client = new OkHttpClient();

                RequestBody formBody = new FormBody.Builder()
                        .add("work_email", email)
                        .add("fname", fname)
                        .add("lname", lname)
                        .add("contact", contact)
                        .build();

                Request request = new Request.Builder()
                        .url("https://2f07-121-244-55-198.ngrok.io/foodapp/sharing/user/signup/")
                        .post(formBody)
                        .build();

                Thread thread = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        try  {
                            try{
                                Response response = client.newCall(request).execute();
                                System.out.println(response.body().toString());
                                // Do something with the response.
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

                thread.start();
                startActivity(intent);
            }
        });
    }
}