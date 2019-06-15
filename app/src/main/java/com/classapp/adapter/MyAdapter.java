package com.classapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.classapp.R;
import com.example.classapp.model.RowData;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    Context applicationContext;
    List<RowData> rowData;


    public MyAdapter(Context applicationContext, List<RowData> rowData) {
        this.applicationContext = applicationContext;
        this.rowData = rowData;
    }

    @Override
    public int getCount() {
        return rowData.size();
    }

    @Override
    public Object getItem(int i) {
        return rowData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private class MyViewHolder {
        ImageView imageView;
        TextView textView1;
        TextView textView2;
        TextView textView3;

    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        MyViewHolder myViewHolder = null;
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) applicationContext.getSystemService(applicationContext.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.row_data, null);
            myViewHolder = new MyViewHolder();

            myViewHolder.imageView = convertView.findViewById(R.id.list_image);
            myViewHolder.textView1 = convertView.findViewById(R.id.title);
            myViewHolder.textView2 = convertView.findViewById(R.id.subtitle);
            myViewHolder.textView3 = convertView.findViewById(R.id.title_version);

            convertView.setTag(myViewHolder);
        } else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }

        RowData rowData1 = rowData.get(i);

        myViewHolder.imageView.setImageResource(rowData1.getImage_title());
        myViewHolder.textView1.setText(rowData1.getMain_title());
        myViewHolder.textView2.setText(rowData1.getSub_title());
        myViewHolder.textView2.setText(rowData1.getVersion_title());

        return convertView;
    }
}
