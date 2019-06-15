package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnkushSingh extends AppCompatActivity {
    ImageView i3;
    TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankush_singh);

        i3=findViewById(R.id.ankush);
        t3=findViewById(R.id.ank);

    }
}
