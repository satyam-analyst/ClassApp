package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Shubham extends AppCompatActivity {

    ImageView i26;
    TextView t26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shubham);

        i26=findViewById(R.id.shubham);
        t26=findViewById(R.id.shu);
    }
}
