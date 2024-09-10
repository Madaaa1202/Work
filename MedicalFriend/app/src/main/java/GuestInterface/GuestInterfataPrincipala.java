package GuestInterface;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.medicalfriend.PaginaPrincipalaScanare2;
import com.example.medicalfriend.PaginaSelectareTipContUtilizator;
import com.example.medicalfriend.R;

public class GuestInterfataPrincipala extends AppCompatActivity {
    Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_interfata_principala);
        overridePendingTransition(0, 0);
        button= (Button)findViewById(R.id.ButonListaAfectiuni);
        button2= (Button)findViewById(R.id.ButonListaScanare);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(GuestInterfataPrincipala.this, InterfataPrincipalaAfectiuni.class);
                startActivity(int1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(GuestInterfataPrincipala.this, PaginaPrincipalaScanare2.class);
                startActivity(int2);
            }
        });
    }

    public void onBackPressed() {
        Intent int2=new Intent(GuestInterfataPrincipala.this, PaginaSelectareTipContUtilizator.class);
        startActivity(int2);
        super.onBackPressed();
        return;
    }
}