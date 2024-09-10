package GuestInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.medicalfriend.PaginaSelectareTipContUtilizator;
import com.example.medicalfriend.R;
import com.example.medicalfriend.SelectApplicationLanguage;

import org.w3c.dom.Text;

public class InterfataPrincipalaAfectiuni extends AppCompatActivity {
    Spinner spinner;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfata_principala_afectiuni);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextSelectSpinner);
        spinner=(Spinner) findViewById(R.id.sp);
        if(textView.getText().toString().equals("Auswählen")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinnerarrayDE, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Select"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinnerarray, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Sélectionner"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinnerarrayFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Selectați"))
        {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinnerarrayRo, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }

    }

    private class function implements AdapterView.OnItemSelectedListener {
        @SuppressLint("ResourceType")
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


            if(parent.getItemAtPosition(position).toString().equals("Abdomen")){
                Intent int1=new Intent(InterfataPrincipalaAfectiuni.this, PaginaPrincipalaAfectiuniAbdomen.class);
                startActivity(int1);
            }
            else if(parent.getItemAtPosition(position).toString().equals("Breast")||parent.getItemAtPosition(position).toString().equals("Brust")||parent.getItemAtPosition(position).toString().equals("Sein")||parent.getItemAtPosition(position).toString().equals("Sâni"))
            {
                Intent int2=new Intent(InterfataPrincipalaAfectiuni.this, PaginaPrincipalaAfectiuniSani.class);
                startActivity(int2);
            }
            else if (parent.getItemAtPosition(position).toString().equals("Cerebral")||parent.getItemAtPosition(position).toString().equals("Gehirn")||parent.getItemAtPosition(position).toString().equals("Cérébrale")||parent.getItemAtPosition(position).toString().equals("Cerebral"))
            {
                Intent int3=new Intent(InterfataPrincipalaAfectiuni.this, PaginaPrincipalaAfectiuniCerebral.class);
                startActivity(int3);
            }
            else if (parent.getItemAtPosition(position).toString().equals("Chest")||parent.getItemAtPosition(position).toString().equals("Truhe")||parent.getItemAtPosition(position).toString().equals("Coffre")||parent.getItemAtPosition(position).toString().equals("Piept"))
            {
                Intent int4=new Intent(InterfataPrincipalaAfectiuni.this, PaginaPrincipalaAfectiuniPiept.class);
                startActivity(int4);
            }
            else if(parent.getItemAtPosition(position).toString().equals("Ear")||parent.getItemAtPosition(position).toString().equals("Ohr")||parent.getItemAtPosition(position).toString().equals("Oreille")||parent.getItemAtPosition(position).toString().equals("Ureche"))
            {
                Intent int5=new Intent(InterfataPrincipalaAfectiuni.this, PaginaPrincipalaAfectiuniUreche.class);
                startActivity(int5);
            }
            else if(parent.getItemAtPosition(position).toString().equals("Eye")||parent.getItemAtPosition(position).toString().equals("Auge")||parent.getItemAtPosition(position).toString().equals("Œil")||parent.getItemAtPosition(position).toString().equals("Ochi"))
            {
                Intent int6=new Intent(InterfataPrincipalaAfectiuni.this, PaginaPrincipalaAfectiuniOchi.class);
                startActivity(int6);
            }





        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }

    public class function2 implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}