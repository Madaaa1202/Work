package FunctionalitateaScanare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.medicalfriend.PaginaPrincipalaScanare2;
import com.example.medicalfriend.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CompozitieProspect2 extends AppCompatActivity {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compozitie_prospect2);
        overridePendingTransition(0, 0);
        textView=(TextView) findViewById(R.id.TextCompozitie2);
        button=(Button) findViewById(R.id.Contraindicatii2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(CompozitieProspect2.this, Contraindicatii2.class);
                startActivity(int1);
            }
        });

        FirebaseDatabase firebaseDatabase;
        DatabaseReference databaseReference;

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference().child("Pastile").child("4011548029084").child("Compozitie");

        databaseReference.addValueEventListener(new com.google.firebase.database.ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String compozitie=snapshot.getValue(String.class);
                textView.setText("");
                textView.setText(compozitie);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void onBackPressed() {
        Intent int2=new Intent(CompozitieProspect2.this, PaginaPrincipalaScanare2.class);
        startActivity(int2);
        super.onBackPressed();
        return;
    }
}