package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Ibadur extends AppCompatActivity {
    TextView t8;
    ImageView i8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibadur);

        t8=findViewById(R.id.iba);
        i8=findViewById(R.id.ibadur);
    }
}
