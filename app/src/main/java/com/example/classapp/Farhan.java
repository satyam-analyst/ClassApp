package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Farhan extends AppCompatActivity {

    ImageView i6;
    TextView t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farhan);

        i6=findViewById(R.id.farhan);
        t6=findViewById(R.id.far);
    }
}
