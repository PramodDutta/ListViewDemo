package com.witmergers.testlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by WP8Dev on 03-11-2014.
 */
public class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(Context context, String [] resource) {
        super(context, R.layout.row_layout,resource);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view =  layoutInflater.inflate(R.layout.row_layout,parent,false);

        String tv = getItem(position);
        TextView textview = (TextView)view.findViewById(R.id.textView1);
        textview.setText(tv);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageView1);


  imageView.setImageResource(R.drawable.ic_launcher);

        return view ;
    }
}
