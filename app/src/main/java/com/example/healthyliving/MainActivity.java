package com.example.healthyliving;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int healthLevel;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(String text) {
        TextView textView = findViewById(R.id.displayMessageTv);
        textView.setText(text);
    }

    public void yes(View view) {
        healthLevel = healthLevel + 1;
        message = "You answered yes, current health level is " + healthLevel;
        display(message);
    }

    public void sometimes(View view) {
        healthLevel = healthLevel + 0;
        message = "You answered sometimes, current health level is " + healthLevel;
        display(message);
    }

    public void no(View view) {
        healthLevel = healthLevel - 1;
        message = "You answered no, current health level is " + healthLevel;
        display(message);
    }


}