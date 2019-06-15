package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Umar extends AppCompatActivity {

    ImageView i31;
    TextView t31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umar);

        i31=findViewById(R.id.umar);
        t31=findViewById(R.id.uma);
    }
}
