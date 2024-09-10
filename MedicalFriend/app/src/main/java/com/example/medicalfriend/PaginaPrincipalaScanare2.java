package com.example.medicalfriend;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import FunctionalitateaScanare.CompozitieProspect;
import FunctionalitateaScanare.CompozitieProspect2;
import FunctionalitateaScanare.CompozitieProspect3;
import FunctionalitateaScanare.CompozitieProspect4;
import FunctionalitateaScanare.CompozitieProspect5;
import FunctionalitateaScanare.CompozitieProspect6;
import FunctionalitateaScanare.CompozitieProspect7;
import FunctionalitateaScanare.ProspectInAltaLimbaNuRo;
import GuestInterface.GuestInterfataPrincipala;

public class PaginaPrincipalaScanare2 extends AppCompatActivity implements View.OnClickListener{

    Button button;
   // public static String valoareActivitatePrecedenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principala_scanare2);
        overridePendingTransition(0, 0);
        button=findViewById(R.id.scanare);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        scanCode();
    }

    private void scanCode()
    {
        IntentIntegrator integrator=new IntentIntegrator(this);
        integrator.setCaptureActivity(CaptureAct.class);
        integrator.setOrientationLocked(false);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        integrator.setPrompt(String.valueOf(R.string.scanare));
        integrator.initiateScan();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        IntentResult result=IntentIntegrator.parseActivityResult(requestCode,resultCode,data);
        if (result !=null){
            if(result.getContents()!=null)
            {
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setMessage(result.getContents()); //ce e in paranteza e ce citeste camera
                builder.setTitle(R.string.rezultat_scanare);
                builder.setPositiveButton(R.string.afisare, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //scanCode();
                        //valoareActivitatePrecedenta=result.getContents().toString();
                        if(button.getText().toString().equals("Scanare cod de bare")) {
                            if (result.getContents().equals("3837000069549")) {
                                Intent int2 = new Intent(PaginaPrincipalaScanare2.this, CompozitieProspect.class);
                                startActivity(int2);
                            } else if (result.getContents().equals("4104480780127")) {
                                Intent int3 = new Intent(PaginaPrincipalaScanare2.this, CompozitieProspect3.class);
                                startActivity(int3);
                            } else if (result.getContents().equals("4011548029084")) {
                                Intent int1 = new Intent(PaginaPrincipalaScanare2.this, CompozitieProspect2.class);
                                startActivity(int1);
                            } else if (result.getContents().equals("5941141009246")) {
                                Intent int4 = new Intent(PaginaPrincipalaScanare2.this, CompozitieProspect4.class);
                                startActivity(int4);
                            } else if (result.getContents().equals("5944708137024")) {
                                Intent int5 = new Intent(PaginaPrincipalaScanare2.this, CompozitieProspect5.class);
                                startActivity(int5);
                            } else if (result.getContents().equals("5948912000631")) {
                                Intent int6 = new Intent(PaginaPrincipalaScanare2.this, CompozitieProspect6.class);
                                startActivity(int6);
                            } else if (result.getContents().equals("5949040104444")) {
                                Intent int7 = new Intent(PaginaPrincipalaScanare2.this, CompozitieProspect7.class);
                                startActivity(int7);
                            } else {
                                scanCode();
                            }
                        }
                        else
                        {
                            if(result.getContents().equals("3837000069549"))
                            {
                                //Intent int8 = new Intent(PaginaPrincipalaScanare2.this, ProspectInAltaLimbaNuRo.class);
                                //int8.putExtra("string_message", valoareActivitatePrecedenta);
                               // startActivity(int8);
                                ValoareExtrasa.message="3837000069549";
                                Intent intent = new Intent(getApplicationContext(), ProspectInAltaLimbaNuRo.class);
                                startActivity(intent);
                            }
                            else if(result.getContents().equals("4104480780127")){
                                ValoareExtrasa.message="4104480780127";
                                Intent intent = new Intent(getApplicationContext(), ProspectInAltaLimbaNuRo.class);
                                startActivity(intent);
                            }
                            else if(result.getContents().equals("4011548029084"))
                            {
                                ValoareExtrasa.message="4011548029084";
                                Intent intent = new Intent(getApplicationContext(), ProspectInAltaLimbaNuRo.class);
                                startActivity(intent);
                            }
                            else if(result.getContents().equals("5941141009246"))
                            {
                                ValoareExtrasa.message="5941141009246";
                                Intent intent = new Intent(getApplicationContext(), ProspectInAltaLimbaNuRo.class);
                                startActivity(intent);
                            }
                            else if(result.getContents().equals("5944708137024"))
                            {
                                ValoareExtrasa.message="5944708137024";
                                Intent intent = new Intent(getApplicationContext(), ProspectInAltaLimbaNuRo.class);
                                startActivity(intent);
                            }
                            else if(result.getContents().equals("5948912000631"))
                            {
                                ValoareExtrasa.message="5948912000631";
                                Intent intent = new Intent(getApplicationContext(), ProspectInAltaLimbaNuRo.class);
                                startActivity(intent);
                            }
                            else if(result.getContents().equals("5949040104444"))
                            {
                                ValoareExtrasa.message="5949040104444";
                                Intent intent = new Intent(getApplicationContext(), ProspectInAltaLimbaNuRo.class);
                                startActivity(intent);
                            }
                            else
                            {
                                scanCode();
                            }
                        }

                    }
                }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });

                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }
            else
            {
                Toast.makeText(this, R.string.no_result, Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            super.onActivityResult(requestCode,resultCode,data);
        }

    }

    public void onBackPressed() {
        Intent int2=new Intent(PaginaPrincipalaScanare2.this, GuestInterfataPrincipala.class);
        startActivity(int2);
        super.onBackPressed();
        return;
    }
}