package com.example.foodorderingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    String[] food_item;
    int[] foods;
    Context context;
    LayoutInflater layoutInflater;
    CustomAdapter(Context context,String[]food_item,int [] foods)
    {
        this.context=context;
        this.food_item=food_item;
        this.foods=foods;
    }
    @Override
    public int getCount() {
        return food_item.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.food_sample,parent,false);
        }
        ImageView imageView=convertView.findViewById(R.id.imageV);
        TextView textView=convertView.findViewById(R.id.textView);
        imageView.setImageResource(foods[position]);
        textView.setText(food_item[position]);
        return convertView;
    }
}
