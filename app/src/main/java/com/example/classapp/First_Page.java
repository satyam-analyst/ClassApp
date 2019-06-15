package com.example.classapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class First_Page extends AppCompatActivity {

    EditText etname,etid;
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__page);

        etname=findViewById(R.id.edit_text1);
        etid=findViewById(R.id.edit_text2);
        b1=findViewById(R.id.btn1);
        t1=findViewById(R.id.text_view);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               check();


            }
        });
    }
    public void check(){
        if(etname.getText().toString().equals("Karan Singh")&&
        etid.getText().toString().equals("2018016287")){
            Toast.makeText(this,"SUCCESS LOGIN",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(First_Page.this,Firstpage.class);
            startActivity(intent);
        }
        else if (etname.getText().toString().equals("BURHAN")&&
        etid.getText().toString().equals("2018010595")){
            Toast.makeText(this,"SUCCESS LOGIN",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(First_Page.this,Firstpage.class);
            startActivity(intent);
        }
        else if (etname.getText().toString().equals("Prince Kumar")&&
        etid.getText().toString().equals("2018006628")){
            Toast.makeText(this,"SUCCESS LOGIN",Toast.LENGTH_LONG).show(); Intent intent=new Intent(First_Page.this,Firstpage.class);
            startActivity(intent);
        }
        else if (etname.getText().toString().equals("Riya Paul")&&
        etid.getText().toString().equals("2018016405")){
            Toast.makeText(this,"SUCCESS LOGIN",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(First_Page.this,Firstpage.class);
            startActivity(intent);
        }
        else if (etname.getText().toString().equals("Soni Jain")&&
        etid.getText().toString().equals("2018016478")){
            Toast.makeText(this,"SUCCESS LOGIN",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(First_Page.this,Firstpage.class);
            startActivity(intent);
        }
        else if (etname.getText().toString().equals("Samiksha Sonam")&&
        etid.getText().toString().equals("2018016170")){
            Toast.makeText(this,"SUCCESS LOGIN",Toast.LENGTH_LONG).show();

            Intent intent=new Intent(First_Page.this,Firstpage.class);
            startActivity(intent);
        }
        else if (etname.getText().toString().equals("Karun Sahni")&&
        etid.getText().toString().equals("2018016383")){
            Toast.makeText(this,"SUCCESS LOGIN",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(First_Page.this,Firstpage.class);
            startActivity(intent);
        }
        else if (etname.getText().toString().equals("Mohit Rathore")&&
                etid.getText().toString().equals("201805523")){
            Toast.makeText(this,"SUCCESS LOGIN",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(First_Page.this,Firstpage.class);
            startActivity(intent);
        }

    }
}
