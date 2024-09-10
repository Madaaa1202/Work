package GuestInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.medicalfriend.R;

import GuestInterface.AfectiuniCerebrale.AfectiuniCerebraleAmeteala;
import GuestInterface.AfectiuniCerebrale.AfectiuniCerebraleConfuzie;
import GuestInterface.AfectiuniCerebrale.AfectiuniCerebraleDurereDeCap;
import GuestInterface.AfectiuniSani.AfectiuniSaniDurereDeSan;
import GuestInterface.AfectiuniSani.AfectiuniSaniLumpiLaFemei;
import GuestInterface.AfectiuniSani.AfectiuniSaniMarireaSanilorLaBarbati;

public class PaginaPrincipalaAfectiuniCerebral extends AppCompatActivity {
    Button buton1,buton2,buton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principala_afectiuni_cerebral);
        overridePendingTransition(0, 0);
        buton1=(Button) findViewById(R.id.ButonConfuzie);
        buton2=(Button) findViewById(R.id.ButonAmeteala);
        buton3=(Button) findViewById(R.id.ButonDurereDeCap);

        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(PaginaPrincipalaAfectiuniCerebral.this, AfectiuniCerebraleConfuzie.class);
                startActivity(int1);
            }
        });

        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(PaginaPrincipalaAfectiuniCerebral.this, AfectiuniCerebraleAmeteala.class);
                startActivity(int2);
            }
        });

        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(PaginaPrincipalaAfectiuniCerebral.this, AfectiuniCerebraleDurereDeCap.class);
                startActivity(int3);
            }
        });
    }
}