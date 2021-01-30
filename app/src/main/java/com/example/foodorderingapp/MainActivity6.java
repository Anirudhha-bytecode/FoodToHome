package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    private EditText editText1,editText2,editText3;
    private Button button1,button2;
    MyDataBaseHelper myDataBaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        editText1=(EditText)findViewById(R.id.username);
        editText2=(EditText)findViewById(R.id.password);
        editText3=(EditText)findViewById(R.id.repassword);
        button1=(Button)findViewById(R.id.signin);
        button2=(Button)findViewById(R.id.signup);
        myDataBaseHelper=new MyDataBaseHelper(this);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=editText1.getText().toString();
                String pass=editText2.getText().toString();
                String repass=editText3.getText().toString();
                if(user.length()==0||pass.length()==0||repass.length()==0)
                {
                    Toast.makeText(MainActivity6.this,"Please fill all the field!",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(pass.equals(repass))
                    {
                        if(myDataBaseHelper.checkusername(user)==false)
                        {
                            if(myDataBaseHelper.InsertData(user,pass)==true)
                            {
                                Toast.makeText(MainActivity6.this,"Registration successful!",Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(MainActivity6.this,MainActivity4.class);
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(MainActivity6.this,"Resistration failed!",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(MainActivity6.this,"User already registered!",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity6.this,"Password doesn't match",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity7.class);
                startActivity(intent);
            }
        });

    }
}