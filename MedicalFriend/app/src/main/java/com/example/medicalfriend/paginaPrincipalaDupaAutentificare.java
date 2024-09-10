package com.example.medicalfriend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import PaginaListaMedici.Scuze;
import PaginaPrincipalaDupaAutentificare.Alarma2;

public class paginaPrincipalaDupaAutentificare extends AppCompatActivity {
   Button buttonGPS,buttonAlarma,butonChat, butonIesire;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principala_dupa_autentificare);
        overridePendingTransition(0, 0);
        buttonGPS=(Button) findViewById(R.id.ButonDisponibilitate);
        buttonAlarma=(Button)findViewById(R.id.ButonAlarma);
        butonChat=(Button)findViewById(R.id.ButonChatBot);
        butonIesire=(Button)findViewById(R.id.iesire);

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        FirebaseUser user = firebaseAuth.getCurrentUser();
        buttonGPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(paginaPrincipalaDupaAutentificare.this, Scuze.class);
                startActivity(int1);
            }
        });

        buttonAlarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(paginaPrincipalaDupaAutentificare.this, Alarma2.class);
                startActivity(int2);
            }
        });

        butonChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(paginaPrincipalaDupaAutentificare.this, Splash.class);
                startActivity(int3);
            }
        });

        butonIesire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(paginaPrincipalaDupaAutentificare.this,PaginaSelectareTipContUtilizator.class));
            }
        });
    }

    public void onBackPressed() {
        Intent int2=new Intent(paginaPrincipalaDupaAutentificare.this,PaginaSelectareTipContUtilizator.class);
        startActivity(int2);
        super.onBackPressed();
        return;
    }
}