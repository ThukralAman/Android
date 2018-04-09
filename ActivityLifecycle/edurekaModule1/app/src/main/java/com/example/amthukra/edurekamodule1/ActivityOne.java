package com.example.amthukra.edurekamodule1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart1");
        Log.d("event", "onRestart1 called");
        Toast.makeText(this, "OnRestart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        System.out.println("onCreare");
        Log.d("event", "onCreare called");
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart");
        Log.d("event", "onStart called");
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume");
        Log.d("event", "onResume called");
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause");
        Log.d("event", "onPause called");
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop");
        Log.d("event", "onStop called");
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");
        Log.d("event", "onDestroy called");
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }
}
