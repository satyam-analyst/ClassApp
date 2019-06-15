package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class KaranKumarSingh extends AppCompatActivity {

    ImageView i11;
    TextView t11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karan_kumar_singh);

        i11=findViewById(R.id.karan);
        t11=findViewById(R.id.kar);
    }
}
