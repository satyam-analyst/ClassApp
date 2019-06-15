package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class YogeshPandey extends AppCompatActivity {

    ImageView i34;
    TextView t34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yogesh_pandey);

        i34=findViewById(R.id.yogesh);
        t34=findViewById(R.id.yog);
    }
}
