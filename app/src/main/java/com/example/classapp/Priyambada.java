package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Priyambada extends AppCompatActivity {
    ImageView i22;
    TextView t22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priyambada);

        i22=findViewById(R.id.priyambada);
        t22=findViewById(R.id.pri);
    }
}
