package com.example.classapp;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.classapp.adapter.MyAdapter;
import com.example.classapp.model.RowData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<RowData> rowData;
    String main_title[], sub_title[], version_title[];
    TypedArray image_title;
    String[] option = {
            "Burhan","Aditya Yadav","Ayush Anand","Ankush Singh","Fayaz","Jahan","Yogesh Pandey","Saif Ali","Karan Kumar Singh","Karun Sahni","Abhishek Bharjwaj","Vairag Jain","Trisha Bhowmik","Soni Jain","Shubham Pandey","Samiksha Sonam","Riya Pual","Priyambada Arya","Price Kumar Roy","Umar Badmasi","Nafees Ahmad","Mohit Rathod","manish aggarwal","Luis Combo","Tushar Dubey","Ibadur Rahman","pritam","Kriti","Irvine","Farhan"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,option
        ));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedItem = option[position];
                switch (selectedItem){
                    case "Burhan":
                        Intent intent1=new Intent(MainActivity.this,Burhan.class);
                        startActivity(intent1);
                        break;
                    case "Aditya Yadav":
                        Intent intent2=new Intent(MainActivity.this,AdityaYadav.class);
                        startActivity(intent2);
                        break;
                    case "Ayush Anand":
                        Intent intent3=new Intent(MainActivity.this,AyushAnand.class);
                        startActivity(intent3);
                        break;
                    case "Ankush Singh":
                        Intent intent4=new Intent(MainActivity.this,AnkushSingh.class);
                        startActivity(intent4);
                        break;
                    case "Fayaz":
                        Intent intent5=new Intent(MainActivity.this,Fayaz.class);
                        startActivity(intent5);
                        break;
                    case "Jahan":
                        Intent intent6=new Intent(MainActivity.this,Jahan.class);
                        startActivity(intent6);
                        break;
                    case "Yogesh Pandey":
                        Intent intent7=new Intent(MainActivity.this,YogeshPandey.class);
                        startActivity(intent7);
                        break;
                    case "Saif Ali":
                        Intent intent8=new Intent(MainActivity.this,SaifAli.class);
                        startActivity(intent8);
                        break;
                    case "Karan Kumar Singh":
                        Intent intent9=new Intent(MainActivity.this,KaranKumarSingh.class);
                        startActivity(intent9);
                        break;
                    case "Karun Sahni":
                        Intent intent10=new Intent(MainActivity.this,KarunSahni.class);
                        startActivity(intent10);
                        break;
                    case "Abhishek Bharjwaj":
                        Intent intent11=new Intent(MainActivity.this,Abhishek.class);
                        startActivity(intent11);
                        break;
                    case "Vairag Jain":
                        Intent intent12=new Intent(MainActivity.this,Vairag.class);
                        startActivity(intent12);
                        break;
                    case "Trisha Bhowmik":
                        Intent intent13=new Intent(MainActivity.this,Trisha.class);
                        startActivity(intent13);
                        break;
                    case "Soni jain":
                        Intent intent14=new Intent(MainActivity.this,Soni.class);
                        startActivity(intent14);
                        break;
                    case "Shubham pandey":
                        Intent intent15=new Intent(MainActivity.this,Shubham.class);
                        startActivity(intent15);
                        break;
                    case "Samiksha sonam":
                        Intent intent16=new Intent(MainActivity.this,Samiksha.class);
                        startActivity(intent16);
                        break;
                    case "Riya Paul":
                        Intent intent17=new Intent(MainActivity.this,Riya.class);
                        startActivity(intent17);
                        break;
                    case "Priyambada Arya":
                        Intent intent18=new Intent(MainActivity.this,Priyambada.class);
                        startActivity(intent18);
                        break;
                    case "Prince Kumar Roy":
                        Intent intent19=new Intent(MainActivity.this,Prince.class);
                        startActivity(intent19);
                        break;
                    case "Umar Badmasi":
                        Intent intent20=new Intent(MainActivity.this,Umar.class);
                        startActivity(intent20);
                        break;
                    case "Nafees Ahmad":
                        Intent intent21=new Intent(MainActivity.this,Nafees.class);
                        startActivity(intent21);
                        break;
                    case "Mohit Rathod":
                        Intent intent22=new Intent(MainActivity.this,Mohit.class);
                        startActivity(intent22);
                        break;
                    case "Manish Aggarwal":
                        Intent intent23=new Intent(MainActivity.this,Manish.class);
                        startActivity(intent23);
                        break;
                    case "Luis Combo":
                        Intent intent24=new Intent(MainActivity.this,Luis.class);
                        startActivity(intent24);
                        break;
                    case "Tushar Dubey":
                        Intent intent25=new Intent(MainActivity.this,Tushar.class);
                        startActivity(intent25);
                        break;
                    case "Ibadur Rahman":
                        Intent intent26=new Intent(MainActivity.this,Ibadur.class);
                        startActivity(intent26);
                        break;
                    case "Pritam":
                        Intent intent27=new Intent(MainActivity.this,Pritam.class);
                        startActivity(intent27);
                        break;
                    case "Kriti":
                        Intent intent28=new Intent(MainActivity.this,Kriti.class);
                        startActivity(intent28);
                        break;
                    case "Irvine":
                        Intent intent29=new Intent(MainActivity.this,Irvine.class);
                        startActivity(intent29);
                        break;
                    case "Farhan":
                        Intent intent30=new Intent(MainActivity.this,Farhan.class);
                        startActivity(intent30);
                        break;


                }
            }
        });




        rowData = new ArrayList<RowData>();
        main_title = getResources().getStringArray(R.array.main_title);
        sub_title = getResources().getStringArray(R.array.sub_title);
        version_title = getResources().getStringArray(R.array.version_title);
        image_title = getResources().obtainTypedArray(R.array.image_title);

        for (int i=0;i<main_title.length;i++)
        {
            RowData rowData= new RowData(main_title[i],sub_title[i],version_title[i],image_title.getResourceId(i,-1));
            boolean b = this.rowData.add(rowData);
        }

//        rowData.add(new RowData("Test", "Test", "1", R.drawable.burhan));

        MyAdapter myAdapter = new MyAdapter(getApplicationContext(), rowData);
        myAdapter.notifyDataSetChanged();
        listView.setAdapter(myAdapter);



    }
}
