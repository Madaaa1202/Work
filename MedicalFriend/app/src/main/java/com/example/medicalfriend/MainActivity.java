package com.example.medicalfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {


    Timer timer;
    private View decorView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(0, 0);

        //pentru progress bar
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, PaginaSelectareTipContUtilizator.class);
                startActivity(intent);
                finish();
            }
        }, 2000);

        init();
        //pentru progress bar
        progressBar.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                progressBar.setVisibility(View.GONE);
            }
        },1900);


        //pentru ascunderea barei din josul paginii
        decorView=getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener(){
            @Override
            public void onSystemUiVisibilityChange(int visibility){
                if(visibility==0)
                    decorView.setSystemUiVisibility(hideSystemBars());
            }
        });
    }

    private void init(){
        this.progressBar=findViewById(R.id.progressBar);
    }

    //pentru action bar
    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus){
            decorView.setSystemUiVisibility(hideSystemBars());
        }
    }
    private int hideSystemBars(){
        return  View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                |View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                |View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_FULLSCREEN
                |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    }
}