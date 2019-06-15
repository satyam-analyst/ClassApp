package com.example.classapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Vairag extends AppCompatActivity {

    ImageView i33;
    TextView t33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vairag);

        i33=findViewById(R.id.vairag);
        t33=findViewById(R.id.vai);
    }
}
