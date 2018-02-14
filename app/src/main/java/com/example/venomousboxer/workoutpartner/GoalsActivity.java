package com.example.venomousboxer.workoutpartner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoalsActivity extends AppCompatActivity {

    Button button1 , button2 , button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity("FAT LOSS");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity("BE HEALTHIER");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity("GAIN MUSClES");
            }
        });
    }

    void startActivity(String st){
        Intent intent = new Intent(GoalsActivity.this, SettingsActivity.class);
        intent.putExtra("button_text", st);
        startActivity(intent);
    }
}
