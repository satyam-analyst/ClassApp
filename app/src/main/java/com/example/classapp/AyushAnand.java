package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AyushAnand extends AppCompatActivity {

    ImageView i4;
    TextView t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayush_anand);

        if (getSupportActionBar() != null)
            getSupportActionBar().hide();
        i4=findViewById(R.id.ayush);
        t4=findViewById(R.id.ayu);
    }
}
