package GuestInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.medicalfriend.PaginaSelectareTipContUtilizator;
import com.example.medicalfriend.R;
import com.example.medicalfriend.SelectApplicationLanguage;

import GuestInterface.AfectiuniAbdomen.AfectiuniAbdomenConstipation;
import GuestInterface.AfectiuniAbdomen.AfectiuniAbdomenDiaree;
import GuestInterface.AfectiuniAbdomen.AfectiuniAbdomenPain;
import GuestInterface.AfectiuniAbdomen.AfectiuniAbdomenPainInPregnancy;
import GuestInterface.AfectiuniAbdomen.AfectiuniAbdomenSwelling;
import GuestInterface.AfectiuniAbdomen.AfectiuniAbdomenVarsaturi;
import GuestInterface.AfectiuniAbdomen.AfectiuniAbdomenVarsaturiCuSange;

public class PaginaPrincipalaAfectiuniAbdomen extends AppCompatActivity {

    Button butonswelling, buttonpain, buttonpaininpregnancy, buttonconstipation, buttondiaree, buttonvarsaturi, buttonvarsaturicusange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principala_afectiuni_abdomen);
        overridePendingTransition(0, 0);
        butonswelling=(Button) findViewById(R.id.ButonAbdomenUmflat);
        buttonpain=(Button) findViewById(R.id.ButonDurereAbdominalaAdulti);
        buttonpaininpregnancy=(Button) findViewById(R.id.ButonDurereInSarcina);
        buttonconstipation=(Button) findViewById(R.id.ButonConstipatie);
        buttondiaree=(Button) findViewById(R.id.ButonDiaree);
        buttonvarsaturi=(Button) findViewById(R.id.ButonVarsaturi);
        buttonvarsaturicusange=(Button) findViewById(R.id.ButonVarsaturiCuSange);

        butonswelling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(PaginaPrincipalaAfectiuniAbdomen.this, AfectiuniAbdomenSwelling.class);
                startActivity(int1);
            }
        });

        buttonpain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(PaginaPrincipalaAfectiuniAbdomen.this, AfectiuniAbdomenPain.class);
                startActivity(int2);
            }
        });

        buttonpaininpregnancy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(PaginaPrincipalaAfectiuniAbdomen.this, AfectiuniAbdomenPainInPregnancy.class);
                startActivity(int3);
            }
        });

        buttonconstipation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(PaginaPrincipalaAfectiuniAbdomen.this, AfectiuniAbdomenConstipation.class);
                startActivity(int4);
            }
        });

        buttondiaree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5=new Intent(PaginaPrincipalaAfectiuniAbdomen.this, AfectiuniAbdomenDiaree.class);
                startActivity(int5);
            }
        });

        buttonvarsaturi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6=new Intent(PaginaPrincipalaAfectiuniAbdomen.this, AfectiuniAbdomenVarsaturi.class);
                startActivity(int6);
            }
        });

        buttonvarsaturicusange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7=new Intent(PaginaPrincipalaAfectiuniAbdomen.this, AfectiuniAbdomenVarsaturiCuSange.class);
                startActivity(int7);
            }
        });
    }
}