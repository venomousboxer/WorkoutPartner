package com.example.venomousboxer.workoutpartner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    ImageButton im1, im2;
    TextView tv,tv2;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        im1 = findViewById(R.id.im1);
        im2 = findViewById(R.id.im2);
        tv = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv3);
        bt = findViewById(R.id.bt1);

        final Intent intent = getIntent();
        String goals = intent.getStringExtra("button_text");
        tv2.setText("GOALS : " + goals);

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("GENDER : MALE");
            }
        });

        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("GENDER : FEMALE");
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(SettingsActivity.this, LoginActivity.class);
                startActivity(newIntent);
            }
        });
    }
}
