package FunctionalitateaScanare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.medicalfriend.PaginaPrincipalaScanare2;
import com.example.medicalfriend.R;
import com.example.medicalfriend.ValoareExtrasa;

public class ProspectInAltaLimbaNuRo extends AppCompatActivity {
    TextView textView;
    Button button;
    String valoareTransmisa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prospect_in_alta_limba_nu_ro);

        textView=findViewById(R.id.tvProspectInAltaLimba);
        button=findViewById(R.id.btnIesireProspect);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(ProspectInAltaLimbaNuRo.this, PaginaPrincipalaScanare2.class);
                startActivity(int1);
            }
        });


        valoareTransmisa= ValoareExtrasa.message;

        if(valoareTransmisa.toString().equals("3837000069549"))
        {
            textView.setText("");
            textView.setText(R.string.prospect_unu);
        }
        else if(valoareTransmisa.toString().equals("4104480780127"))
        {
            textView.setText("");
            textView.setText(R.string.prospect_trei);
        }
        else if(valoareTransmisa.toString().equals("4011548029084"))
        {
            textView.setText("");
            textView.setText(R.string.prospect_doi);
        }
        else if(valoareTransmisa.toString().equals("5941141009246"))
        {
            textView.setText("");
            textView.setText(R.string.prospect_patru);
        }
        else if(valoareTransmisa.toString().equals("5944708137024"))
        {
            textView.setText("");
            textView.setText(R.string.prospect_cinci);
        }
        else if(valoareTransmisa.toString().equals("5948912000631"))
        {
            textView.setText("");
            textView.setText(R.string.prospect_sase);
        }
        else if(valoareTransmisa.toString().equals("5949040104444"))
        {
            textView.setText("");
            textView.setText(R.string.prospect_sapte);
        }

    }
}