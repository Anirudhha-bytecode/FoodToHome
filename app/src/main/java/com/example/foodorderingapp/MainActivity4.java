package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    private RadioGroup radioGroup;
    private EditText editText1,editText2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        editText1=(EditText)findViewById(R.id.edittext1);
        editText2=(EditText)findViewById(R.id.edittext2);
        button=(Button) findViewById(R.id.submit);
        radioGroup=(RadioGroup)findViewById(R.id.radio_group);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=radioGroup.getCheckedRadioButtonId();
                if(id==0)
                {
                    Toast.makeText(MainActivity4.this,"please select one",Toast.LENGTH_SHORT).show();
                }
                String r1=editText1.getText().toString();
                String r2=editText2.getText().toString();
                if(r1.length()!=0&&r2.length()!=0)
                {
                    String r=r1+" "+r2;
                    Intent intent=new Intent(MainActivity4.this,MainActivity5.class);
                    intent.putExtra("name",""+r);
                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(MainActivity4.this,"Please Enter Valid Input",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}