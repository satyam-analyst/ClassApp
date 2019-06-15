package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Mohit extends AppCompatActivity {
    ImageView i18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mohit);

        i18=findViewById(R.id.mohit);
    }
}
