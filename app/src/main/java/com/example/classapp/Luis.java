package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Luis extends AppCompatActivity {
    ImageView i16;
    TextView t16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luis);

        i16=findViewById(R.id.luis);
        t16=findViewById(R.id.lus);
    }
}
