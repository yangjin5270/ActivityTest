package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("SSSNormalActivity","OnCreate");
        setContentView(R.layout.normal);
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("SSSNormalActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("SSSNormalActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("SSSNormalActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("SSSNormalActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("SSSNormalActivity","onDestroy");
    }
}
