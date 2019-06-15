package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Burhan extends AppCompatActivity {
    TextView t5;
    ImageView i5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burhan);

        t5=findViewById(R.id.bur);
        i5=findViewById(R.id.burhan);
    }
}
