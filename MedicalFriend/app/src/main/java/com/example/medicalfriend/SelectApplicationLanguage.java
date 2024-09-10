package com.example.medicalfriend;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Locale;

public class SelectApplicationLanguage extends AppCompat {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_select_application_language);

        LinearLayout ro=findViewById(R.id.LimbaRomana);
        LinearLayout de=findViewById(R.id.LimbaGermana);
        LinearLayout fr=findViewById(R.id.LimbaFranceza);
        LinearLayout en=findViewById(R.id.LimbaEngleza);
        LanguageManager lang= new LanguageManager(this);
        ro.setOnClickListener(view -> {
            lang.updateResources("ro");
            recreate();
        });
        de.setOnClickListener(view -> {
            lang.updateResources("de");
            recreate();
        });
        fr.setOnClickListener(view -> {
            lang.updateResources("fr");
            recreate();
        });
        en.setOnClickListener(view -> {
            lang.updateResources("en");
            recreate();
        });

        findViewById(R.id.ButonSetareLimba).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(SelectApplicationLanguage.this, PaginaSelectareTipContUtilizator.class);
                startActivity(int1);
            }
        });

    }


    /*private void setLocale(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.locale = locale;
        getBaseContext().getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());
        //save data to shared preferences
        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
        editor.putString("My Lang", lang);
        editor.apply();
    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View view){
        switch(view.getId()){
            case R.id.LimbaRomana:{
                setLocale("ro-rRO");
                recreate();
                break;
            }
            case R.id.LimbaGermana:{
                setLocale("de-rDE");
                recreate();
                break;
            }
            case R.id.LimbaFranceza:{
                setLocale("fr-rFR");
                recreate();
                break;
            }
            case R.id.LimbaEngleza:{
                setLocale("en");
                recreate();
                break;
            }
        }
    }*/
}