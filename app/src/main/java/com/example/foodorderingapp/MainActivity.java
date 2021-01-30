package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] food_item;
    private int[] foods={R.drawable.chicken_biriyani,R.drawable.chili_chicken,R.drawable.chili_paneer,R.drawable.french_fries,
    R.drawable.fried_chicken,R.drawable.momo,R.drawable.mutton_biriyani,R.drawable.pizza,R.drawable.fried_rice};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);
        food_item=getResources().getStringArray(R.array.food_item);
        CustomAdapter adapter=new CustomAdapter(this,food_item,foods);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    intent.putExtra("name","Chicken Biriyani");
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    intent.putExtra("name","Chili Chicken");
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    intent.putExtra("name","Chili Paneer");
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    intent.putExtra("name","French Fries");
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    intent.putExtra("name","Fried Chicken");
                    startActivity(intent);
                }
                if(position==5)
                {
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    intent.putExtra("name","Momo");
                    startActivity(intent);
                }
                if(position==6)
                {
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    intent.putExtra("name","Mutton Biriyani");
                    startActivity(intent);
                }
                if(position==7)
                {
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    intent.putExtra("name","Pizza");
                    startActivity(intent);
                }
                if(position==8)
                {
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    intent.putExtra("name","Fried Rice");
                    startActivity(intent);
                }
            }
        });
    }
}