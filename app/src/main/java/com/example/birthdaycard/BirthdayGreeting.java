package com.example.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreeting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);
        String name = getIntent().getStringExtra("name");
        TextView birthdayGreeting = (TextView) findViewById(R.id.birthdayGreeting);
        birthdayGreeting.setText("Happy Birthday \n" + name);


    }
}