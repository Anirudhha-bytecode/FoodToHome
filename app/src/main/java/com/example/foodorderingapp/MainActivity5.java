package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textView=(TextView)findViewById(R.id.textview3);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String value=bundle.getString("name");
            textView.setText(value+" your order will be delivered soon..");
        }

    }
}