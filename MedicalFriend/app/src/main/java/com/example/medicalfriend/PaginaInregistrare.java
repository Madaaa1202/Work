package com.example.medicalfriend;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PaginaInregistrare extends AppCompatActivity {
    //firebase

    private AutoCompleteTextView username, email, password;
    private Button signup;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_inregistrare);
        overridePendingTransition(0, 0);

        initializeGUI();

        signup.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {

                final String inputName = username.getText().toString().trim();
                final String inputPw = password.getText().toString().trim();
                final String inputEmail = email.getText().toString().trim();


                if (validateInput(inputName,inputPw, inputEmail))
                    registerUser(inputName, inputPw, inputEmail);

            }
        });
    }
    private void initializeGUI(){

        username = findViewById(R.id.atvUsernameReg);
        email =  findViewById(R.id.atvEmailReg);
        password =  findViewById(R.id.atvPasswordReg);
        signup = findViewById(R.id.btnSignUp);
        progressDialog = new ProgressDialog(this);

        firebaseAuth = FirebaseAuth.getInstance();
    }

    private void registerUser(final String inputName, final String inputPw, final String inputEmail) {

        progressDialog.setMessage(getString(R.string.textverificare));
        progressDialog.show();


        firebaseAuth.createUserWithEmailAndPassword(inputEmail,inputPw).addOnCompleteListener(task -> {
            if(task.isSuccessful()){
                progressDialog.dismiss();
                sendUserData(inputName,inputEmail);
                Toast.makeText(PaginaInregistrare.this, getString(R.string.textcontinregistrat),Toast.LENGTH_SHORT).show();
                startActivity(new Intent(PaginaInregistrare.this,PaginaAutentificare.class));
            }
            else{
                progressDialog.dismiss();
                Toast.makeText(PaginaInregistrare.this,getString(R.string.textcontexistent),Toast.LENGTH_SHORT).show();
            }
            firebaseAuth.signOut();
        });
    }



    private void sendUserData(String username, String email){

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference users = firebaseDatabase.getReference("Users");
        UserProfile user = new UserProfile(username,"*****" , email);
        //users.push().setValue(user);
        FirebaseUser us=FirebaseAuth.getInstance().getCurrentUser();
        assert us != null;
        String currentuser=us.getUid();
        users.child(currentuser).setValue(user);
        /*DatabaseReference dbRef;
        dbRef=FirebaseDatabase.getInstance().getReference("user");
        dbRef.child("nume").setValue(username);
        dbRef.child("email").setValue(email);*/

    }

    private boolean validateInput(String inName, String inPw, String inEmail){

        if(inName.isEmpty()){
            username.setError(getString(R.string.textgolusername));
            return false;
        }
        if(inPw.isEmpty()){
            password.setError(getString(R.string.textcampparolagol));
            return false;
        }
        if(inEmail.isEmpty()){
            email.setError(getString(R.string.textcampemailgol));
            return false;
        }

        return true;
    }

    public void onBackPressed() {
        Intent int2=new Intent(PaginaInregistrare.this, PaginaSelectareTipContUtilizator.class);
        startActivity(int2);
        super.onBackPressed();
        return;
    }
}