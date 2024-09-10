package com.example.medicalfriend;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

import ChatBot.PaginaPrincipalaChatBot;

public class Splash extends AppCompatActivity {

    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        overridePendingTransition(0, 0);

        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash.this, PaginaPrincipalaChatBot.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}