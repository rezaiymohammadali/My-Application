package com.mar.myapplication;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 6;

        Toast.makeText(MainActivity.this,"Hello World!!",Toast.LENGTH_LONG).show();

        Log.e("aaa","This Log is for test ...");


    }
}
