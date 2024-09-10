package PaginaPrincipalaDupaAutentificare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.medicalfriend.R;
import com.example.medicalfriend.paginaPrincipalaDupaAutentificare;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

public class ListaMediciContacte extends AppCompatActivity {
    private int nrMedici=1;
    private int nrPozaProfil=1;
    private int  nrPozaOrar=16;
    ImageView imageViewProfil,imageViewOrar;
    TextView textViewNume, textViewSpecializare, textViewOras;
    ImageButton imageButtonNext, imageButtonLast;
    StorageReference storageReferenceProfil, storageReferenceOrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_medici_contacte);
        overridePendingTransition(0, 0);
        imageViewProfil=(ImageView)findViewById(R.id.imageViewProfil);
        imageViewOrar=(ImageView)findViewById(R.id.imageViewOrar);
        imageButtonLast=(ImageButton)findViewById(R.id.imageButtonLast);
        imageButtonNext=(ImageButton)findViewById(R.id.imageButtonNext);
        textViewNume=(TextView)findViewById(R.id.textViewNume);
        textViewSpecializare=(TextView)findViewById(R.id.textViewSpecializare);
        textViewOras=(TextView)findViewById(R.id.textViewOras);

        updateMedic();

        imageButtonLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nrMedici--;
                nrPozaOrar--;
                nrPozaProfil--;
                updateMedic();
            }
        });

        imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateMedic();
                nrMedici++;
                nrPozaOrar++;
                nrPozaProfil++;
            }
        });

    }

    private void updateMedic()
    {
        FirebaseDatabase nume, specializare, oras;
        DatabaseReference referenceNume, referenceSpecializare,referenceOras;

        nume=FirebaseDatabase.getInstance();
        referenceNume=nume.getReference().child("Medici").child(String.valueOf(nrMedici)).child("Nume");
        referenceNume.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String numeMedic=snapshot.getValue(String.class);
                textViewNume.setText("");
                textViewNume.setText(numeMedic);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        specializare=FirebaseDatabase.getInstance();
        referenceSpecializare=specializare.getReference().child("Medici").child(String.valueOf(nrMedici)).child("Specializare");
        referenceSpecializare.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String specializareMedic=snapshot.getValue(String.class);
                textViewSpecializare.setText("");
                textViewSpecializare.setText(specializareMedic);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        oras=FirebaseDatabase.getInstance();
        referenceOras=oras.getReference().child("Medici").child(String.valueOf(nrMedici)).child("Oras");
        referenceOras.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String orasMedic=snapshot.getValue(String.class);
                textViewOras.setText("");
                textViewOras.setText(orasMedic);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        storageReferenceProfil= FirebaseStorage.getInstance().getReference();
        StorageReference profileref =storageReferenceProfil.child("Profil").child(String.valueOf(nrPozaProfil)+".jpg");
        profileref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(imageViewProfil);

            }
        });



        storageReferenceOrar=FirebaseStorage.getInstance().getReference();
        StorageReference oraref=storageReferenceOrar.child("Orar").child(String.valueOf(nrPozaOrar)+".jpg");
        oraref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(imageViewOrar);

            }
        });

    }



    public void onBackPressed() {
        Intent int2=new Intent(ListaMediciContacte.this, paginaPrincipalaDupaAutentificare.class);
        startActivity(int2);
        super.onBackPressed();
        return;
    }
}