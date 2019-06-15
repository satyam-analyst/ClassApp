package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class KarunSahni extends AppCompatActivity {
    ImageView i14;
    TextView t14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karun_sahni);

        i14=findViewById(R.id.karun);
        t14=findViewById(R.id.karu);
    }
}
