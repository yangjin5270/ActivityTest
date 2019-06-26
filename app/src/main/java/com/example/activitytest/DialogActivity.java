package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("SSSDialogActivity","OnCreate");
        setContentView(R.layout.dialog);
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("SSSDialogActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("SSSDialogActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("SSSDialogActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("SSSDialogActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("SSSDialogActivity","onDestroy");
    }
}
