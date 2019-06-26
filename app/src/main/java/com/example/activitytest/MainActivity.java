package com.example.activitytest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener{


    private ProgressBar pb;
    private List<CheckBox> checkBoxList = new ArrayList<CheckBox>();
    private String[] checkBoxTexts={"重庆","广安","岳池"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("SSSMainActivity","OnCreate");
        //setContentView(R.layout.activity_main);
        LinearLayout layout = (LinearLayout)getLayoutInflater().inflate(R.layout.activity_main,null);

        for (int i=0;i<checkBoxTexts.length;i++) {
            CheckBox checkBox = (CheckBox)getLayoutInflater().inflate(R.layout.check,null);
            checkBox.setText(checkBoxTexts[i]);
            layout.addView(checkBox);
            checkBoxList.add(checkBox);
        }
        setContentView(layout);
        Button  b1 = (Button)findViewById(R.id.button_1);
        Button  b2 = (Button)findViewById(R.id.button_2);
        pb = (ProgressBar)findViewById(R.id.pb1);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        /*b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });*/
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("SSSMainActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("SSSMainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("SSSMainActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("SSSMainActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("SSSMainActivity","onDestroy");
    }
    public void hintCheckBoxSelected(){

       new  AlertDialog.Builder(this).setTitle("warring").setMessage("hello alertDialog.Builder").setPositiveButton("ok",null).show();


    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_1:
               /* if(pb.getVisibility()==View.GONE){
                    pb.setVisibility(View.VISIBLE);
                }else{
                    pb.setVisibility(View.GONE);
                }*/
               /*int pr = pb.getProgress();
               pr+=10;
               Log.i("SSSMainActivity",String.valueOf(pr));
               pb.setProgress(pr);*/
                AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
                ad.setTitle("This is Dialog");
                ad.setMessage("Do somthing");
                ad.setPositiveButton("OK",new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                ad.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                ad.show();
                break;
            case R.id.button_2:
                hintCheckBoxSelected();
                break;
            default:
                break;
        }
    }
}
