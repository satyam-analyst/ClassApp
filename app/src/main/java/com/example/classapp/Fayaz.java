package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Fayaz extends AppCompatActivity {
    ImageView i7;
    TextView t7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fayaz);

        i7=findViewById(R.id.fayaz);
        t7=findViewById(R.id.fay);
    }
}
