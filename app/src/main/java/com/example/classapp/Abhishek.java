package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Abhishek extends AppCompatActivity {
    ImageView a1;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abhishek);

        a1=findViewById(R.id.abhishek);
        t1=findViewById(R.id.abhi);
    }
}
