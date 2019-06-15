package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Jahan extends AppCompatActivity {

    ImageView i10;
    TextView  t10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jahan);

        i10=findViewById(R.id.jahan);
        t10=findViewById(R.id.jah);
    }
}
