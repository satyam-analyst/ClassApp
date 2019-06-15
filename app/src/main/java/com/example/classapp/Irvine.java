package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Irvine extends AppCompatActivity {
    TextView t9;
    ImageView i9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irvine);

        t9=findViewById(R.id.irv);
        i9=findViewById(R.id.irvine);
    }
}
