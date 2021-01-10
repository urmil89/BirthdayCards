 package com.example.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.EventListener;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void createBirthdayCard(View view) {
//        store text of id
        EditText editText = findViewById(R.id.txt_name);
        String name = editText.getText().toString();
//        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,BirthdayGreeting.class);
        intent.putExtra("name",name);
        startActivity(intent);

     }
 }