package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SaifAli extends AppCompatActivity {

    ImageView i24;
    TextView t24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saif_ali);

        i24=findViewById(R.id.saif);
        t24=findViewById(R.id.sai);
    }
}
