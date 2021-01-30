package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity2 extends AppCompatActivity {

    private ProgressBar progressBar;
    private int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        progressBar=(ProgressBar)findViewById(R.id.progressbar);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                goToThis();

            }
        });
        thread.start();
    }
    public void doWork()
    {
        for(progress=10;progress<=100;progress=progress+10)
        {
            try {
                Thread.sleep(500);
                progressBar.setProgress(progress);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public void goToThis()
    {
        Intent intent=new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

}