package GuestInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.medicalfriend.R;

import GuestInterface.AfectiuniAbdomen.AfectiuniAbdomenSwelling;
import GuestInterface.AfectiuniSani.AfectiuniSaniDurereDeSan;
import GuestInterface.AfectiuniSani.AfectiuniSaniLumpiLaFemei;
import GuestInterface.AfectiuniSani.AfectiuniSaniMarireaSanilorLaBarbati;

public class PaginaPrincipalaAfectiuniSani extends AppCompatActivity {
    Button butonSaniMaritiBarbati,butonLumipLaFemei,butonDureriDeSani;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principala_afectiuni_sani);
        overridePendingTransition(0, 0);
        butonSaniMaritiBarbati=(Button) findViewById(R.id.ButonEnlargement);
        butonLumipLaFemei=(Button) findViewById(R.id.ButonLumps);
        butonDureriDeSani=(Button) findViewById(R.id.ButonBreastPain);

        butonSaniMaritiBarbati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(PaginaPrincipalaAfectiuniSani.this, AfectiuniSaniMarireaSanilorLaBarbati.class);
                startActivity(int1);
            }
        });

        butonLumipLaFemei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(PaginaPrincipalaAfectiuniSani.this, AfectiuniSaniLumpiLaFemei.class);
                startActivity(int2);
            }
        });

        butonDureriDeSani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(PaginaPrincipalaAfectiuniSani.this, AfectiuniSaniDurereDeSan.class);
                startActivity(int3);
            }
        });
    }
}