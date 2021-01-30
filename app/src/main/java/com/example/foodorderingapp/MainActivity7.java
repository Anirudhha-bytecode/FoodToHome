package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    private EditText editText1,editText2;
    private Button button;
    MyDataBaseHelper myDataBaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        editText1=(EditText) findViewById(R.id.username1);
        editText2=(EditText)findViewById(R.id.password1);
        button=(Button)findViewById(R.id.bttnsignin);
        myDataBaseHelper=new MyDataBaseHelper(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=editText1.getText().toString();
                String pass=editText2.getText().toString();
                if(user.length()==0||pass.length()==0)
                {
                   Toast.makeText(MainActivity7.this,"Please filled all fields",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(myDataBaseHelper.checkusenamepassword(user,pass)==true)
                    {
                        Intent intent=new Intent(MainActivity7.this,MainActivity4.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(MainActivity7.this,"Invalid Credentials!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}