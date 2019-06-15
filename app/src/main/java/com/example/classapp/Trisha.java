package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Trisha extends AppCompatActivity {

    ImageView i28;
    TextView t28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trisha);

        i28=findViewById(R.id.trisha);
        t28=findViewById(R.id.tri);
    }
}
