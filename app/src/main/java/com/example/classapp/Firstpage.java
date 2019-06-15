package com.example.classapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Firstpage extends AppCompatActivity {
    ImageView s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        s1=findViewById(R.id.shardalogo);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Firstpage.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },2500);

    }
}
