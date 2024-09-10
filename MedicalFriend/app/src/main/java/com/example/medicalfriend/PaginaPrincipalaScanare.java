package com.example.medicalfriend;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import FunctionalitateaScanare.CompozitieProspect;
import FunctionalitateaScanare.CompozitieProspect2;
import FunctionalitateaScanare.CompozitieProspect3;
import FunctionalitateaScanare.CompozitieProspect4;
import FunctionalitateaScanare.CompozitieProspect5;
import FunctionalitateaScanare.CompozitieProspect6;
import FunctionalitateaScanare.CompozitieProspect7;
import FunctionalitateaScanare.NeCeremScuze;

public class PaginaPrincipalaScanare extends AppCompatActivity {
    private SurfaceView surfaceView;
    private BarcodeDetector barcodeDetector;
    private CameraSource cameraSource;
    Timer timer;
    private static final int REQUEST_CAMERA_PERMISSION = 201;
    //This class provides methods to play DTMF tones
    private ToneGenerator toneGen1;
    private TextView barcodeText;
    private String barcodeData;
    String codbare;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principala_scanare);
        overridePendingTransition(0, 0);
        timer=new Timer();
        toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC,     100);
        surfaceView = findViewById(R.id.surface_view);
        barcodeText = findViewById(R.id.barcode_text);
        button=findViewById(R.id.butonAfisare);
        if(barcodeText.getText().toString().equals("Prospekt anzeigen")) {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Intent intent=new Intent(PaginaPrincipalaScanare.this, NeCeremScuze.class);
                    startActivity(intent);
                    finish();
                }
            }, 2000);
        }
        else if(barcodeText.getText().toString().equals("View prospectus"))
        {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Intent intent=new Intent(PaginaPrincipalaScanare.this, NeCeremScuze.class);
                    startActivity(intent);
                    finish();
                }
            }, 2000);
        }
        else if(barcodeText.getText().toString().equals("Consulter le prospectus"))
        {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Intent intent=new Intent(PaginaPrincipalaScanare.this, NeCeremScuze.class);
                    startActivity(intent);
                    finish();
                }
            }, 2000);
        }

        codbare=barcodeText.getText().toString();
        //System.out.println(codbare);
        Log.d("myTag",codbare);

        if(codbare.equals("387000069549"))
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent int1=new Intent(PaginaPrincipalaScanare.this, CompozitieProspect.class);
                    startActivity(int1);
                }
            });
        }
        else if(codbare.equals("4011548029084"))
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent int2=new Intent(PaginaPrincipalaScanare.this, CompozitieProspect2.class);
                    startActivity(int2);
                }
            });
        }
        else if(codbare.equals("4104480780127"))
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent int3=new Intent(PaginaPrincipalaScanare.this, CompozitieProspect3.class);
                    startActivity(int3);
                }
            });
        }
        else if(codbare.equals("5941141009246"))
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent int4=new Intent(PaginaPrincipalaScanare.this, CompozitieProspect4.class);
                    startActivity(int4);
                }
            });
        }
        else if(codbare.equals("5944708137024"))
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent int5=new Intent(PaginaPrincipalaScanare.this, CompozitieProspect5.class);
                    startActivity(int5);
                }
            });
        }
        else if(codbare.toString().equals("5948912000631"))
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent int6=new Intent(PaginaPrincipalaScanare.this, CompozitieProspect6.class);
                    startActivity(int6);
                }
            });
        }
        else if(codbare.equals("5949040104444"))
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent int7=new Intent(PaginaPrincipalaScanare.this, CompozitieProspect7.class);
                    startActivity(int7);
                }
            });
        }
    }


    private void initialiseDetectorsAndSources() {

        //Toast.makeText(getApplicationContext(), "Barcode scanner started", Toast.LENGTH_SHORT).show();

        barcodeDetector = new BarcodeDetector.Builder(this)
                .setBarcodeFormats(Barcode.ALL_FORMATS)
                .build();

        cameraSource = new CameraSource.Builder(this, barcodeDetector)
                .setRequestedPreviewSize(1920, 1080)
                .setAutoFocusEnabled(true) //you should add this feature
                .build();

        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                try {
                    if (ActivityCompat.checkSelfPermission(PaginaPrincipalaScanare.this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
                        cameraSource.start(surfaceView.getHolder());
                    } else {
                        ActivityCompat.requestPermissions(PaginaPrincipalaScanare.this, new
                                String[]{Manifest.permission.CAMERA}, REQUEST_CAMERA_PERMISSION);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
                cameraSource.stop();
            }
        });


        barcodeDetector.setProcessor(new Detector.Processor<Barcode>() {
            @Override
            public void release() {
                // Toast.makeText(getApplicationContext(), "To prevent memory leaks barcode scanner has been stopped", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void receiveDetections(Detector.Detections<Barcode> detections) {
                final SparseArray<Barcode> barcodes = detections.getDetectedItems();
                if (barcodes.size() != 0) {


                    barcodeText.post(new Runnable() {

                        @Override
                        public void run() {

                            if (barcodes.valueAt(0).email != null) {
                                barcodeText.removeCallbacks(null);
                                barcodeData = barcodes.valueAt(0).email.address;
                                barcodeText.setText(barcodeData);
                                toneGen1.startTone(ToneGenerator.TONE_CDMA_PIP, 150);
                            } else {

                                barcodeData = barcodes.valueAt(0).displayValue;
                                barcodeText.setText(barcodeData);
                                toneGen1.startTone(ToneGenerator.TONE_CDMA_PIP, 150);

                            }
                        }
                    });

                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
  //      getSupportActionBar().hide();
        cameraSource.release();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        getSupportActionBar().hide();
        initialiseDetectorsAndSources();
    }

    public void onBackPressed() {
        Intent int2=new Intent(PaginaPrincipalaScanare.this,PaginaSelectareTipContUtilizator.class);
        startActivity(int2);
        super.onBackPressed();
        return;
    }

}