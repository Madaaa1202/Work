package FunctionalitateaScanare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.medicalfriend.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Indicatii7 extends AppCompatActivity {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicatii7);
        overridePendingTransition(0, 0);
        textView=(TextView) findViewById(R.id.TextIndicatii7);
        button=(Button) findViewById(R.id.Precautii7);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(Indicatii7.this, Precautii7.class);
                startActivity(int1);
            }
        });

        FirebaseDatabase firebaseDatabase;
        DatabaseReference databaseReference;

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference().child("Pastile").child("5949040104444").child("Indicatii");

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
}