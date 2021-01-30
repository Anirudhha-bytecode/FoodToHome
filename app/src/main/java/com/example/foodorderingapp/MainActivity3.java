package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView,price;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageView=(ImageView)findViewById(R.id.imageV);
        textView=(TextView)findViewById(R.id.text);
        button=(Button)findViewById(R.id.button);
        price=(TextView)findViewById(R.id.price);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String result=bundle.getString("name");
            showDetails(result);
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this,MainActivity6.class);
                startActivity(intent);
            }
        });
    }
    public void showDetails(String s)
    {
        if(s.equals("Chicken Biriyani"))
        {
            imageView.setImageResource(R.drawable.chikenn_biriyani);
            textView.setText(R.string.chicken_biriyani);
            price.setText(R.string.chicken_biriyani_price);

        }
        if(s.equals("Chili Chicken"))
        {
            imageView.setImageResource(R.drawable.chili_chicken);
            textView.setText(R.string.chili_chicken);
            price.setText(R.string.chili_chicken_price);
        }
        if(s.equals("Chili Paneer"))
        {
            imageView.setImageResource(R.drawable.chili_paneer);
            textView.setText(R.string.chili_paneer);
            price.setText(R.string.chili_paneer_price);
        }
        if(s.equals("French Fries"))
        {
            imageView.setImageResource(R.drawable.french_fries);
            textView.setText(R.string.french_fries);
            price.setText(R.string.french_fries_price);
        }
        if(s.equals("Fried Chicken"))
        {
            imageView.setImageResource(R.drawable.fried_chicken);
            textView.setText(R.string.fried_chicken);
            price.setText(R.string.fried_chicken_price);
        }
        if(s.equals("Momo"))
        {
            imageView.setImageResource(R.drawable.momo);
            textView.setText(R.string.momo);
            price.setText(R.string.momo_price);
        }
        if(s.equals("Mutton Biriyani"))
        {
            imageView.setImageResource(R.drawable.mutton_biriyani);
            textView.setText(R.string.mutton_biriyani);
            price.setText(R.string.mutton_biriyani_price);
        }
        if(s.equals("Pizza"))
        {
            imageView.setImageResource(R.drawable.pizza);
            textView.setText(R.string.pizza);
            price.setText(R.string.pizza_price);
        }
        if(s.equals("Fried Rice"))
        {
            imageView.setImageResource(R.drawable.fried_rice);
            textView.setText(R.string.fried_rice);
            price.setText(R.string.fried_rice_price);
        }

    }
}