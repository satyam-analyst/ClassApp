package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Kriti extends AppCompatActivity {
    ImageView i15;
    TextView t15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kriti);

        i15=findViewById(R.id.kriti);
        t15=findViewById(R.id.kri);
    }
}
