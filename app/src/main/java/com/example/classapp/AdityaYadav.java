package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AdityaYadav extends AppCompatActivity {

    TextView t2;
    ImageView i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aditya_yadav);

        t2=findViewById(R.id.adi);
        i2=findViewById(R.id.aditya);
    }
}
