package com.example.medicalfriend;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class PaginaAutentificare extends AppCompatActivity {
    TextView textView;
    private AutoCompleteTextView email, parola;
    private TextView inregistrare;
    private Button btnAutentificare;
    private FirebaseAuth firebaseAuth;
    private FirebaseUser user;
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_autentificare);
        overridePendingTransition(0, 0);
        initializeGUI();

        user = firebaseAuth.getCurrentUser();

        if(user != null) {
            finish();
            startActivity(new Intent(PaginaAutentificare.this,paginaPrincipalaDupaAutentificare.class));
        }
        btnAutentificare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inEmail = email.getText().toString();
                String inPassword = parola.getText().toString();

                if(validateInput(inEmail, inPassword)){
                    signUser(inEmail, inPassword);
                }

            }
        });

        textView = (TextView) findViewById(R.id.textId);
        textView.setOnClickListener(v -> {
            Intent intent1 = new Intent(PaginaAutentificare.this, PaginaInregistrare.class);
            startActivity(intent1);
        });

    }

    public void signUser(String email, String password){

        progressDialog.setMessage(getString(R.string.textverificare));
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    progressDialog.dismiss();
                    Toast.makeText(PaginaAutentificare.this,getString(R.string.textautentificarereusita),Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(PaginaAutentificare.this,paginaPrincipalaDupaAutentificare.class));
                }
                else{
                    progressDialog.dismiss();
                    Toast.makeText(PaginaAutentificare.this,getString(R.string.textdategresite),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void initializeGUI(){



        email = findViewById(R.id.emailAutentificare);
        parola = findViewById(R.id.parolaAutentificare);
        btnAutentificare = findViewById(R.id.ButonAutentificare);
        progressDialog = new ProgressDialog(this);

        firebaseAuth = FirebaseAuth.getInstance();

    }
    public boolean validateInput(String inemail, String inpassword){

        if(inemail.isEmpty()){
            email.setError(getString(R.string.textcampemailgol));
            return false;
        }
        if(inpassword.isEmpty()){
            parola.setError(getString(R.string.textcampparolagol));
            return false;
        }

        return true;
    }

    public void onBackPressed() {
        Intent int2=new Intent(PaginaAutentificare.this, PaginaSelectareTipContUtilizator.class);
        startActivity(int2);
        super.onBackPressed();
        return;
    }
}