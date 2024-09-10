package com.example.medicalfriend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import GuestInterface.GuestInterfataPrincipala;

public class PaginaSelectareTipContUtilizator extends AppCompat {
    Button butonCont,butonGuest,butonSchimbareLimba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_pagina_selectare_tip_cont_utilizator);
        butonCont= (Button)findViewById(R.id.ButonCont);
        butonGuest=(Button)findViewById(R.id.ButonGuest);
        butonSchimbareLimba=(Button)findViewById(R.id.ButonSchimbareLimba);

        //deschidere pagina pentru schimbarea limbii
        butonSchimbareLimba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(PaginaSelectareTipContUtilizator.this, SelectApplicationLanguage.class);
                startActivity(int1);
            }
        });

        butonGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(PaginaSelectareTipContUtilizator.this, GuestInterfataPrincipala.class);
                startActivity(int2);
            }
        });

        butonCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(PaginaSelectareTipContUtilizator.this, PaginaAutentificare.class);
                startActivity(int2);
            }
        });
    }

    public void onBackPressed() {
        Intent int2=new Intent(PaginaSelectareTipContUtilizator.this, PaginaSelectareTipContUtilizator.class);
        startActivity(int2);
        super.onBackPressed();
        return;
    }
}