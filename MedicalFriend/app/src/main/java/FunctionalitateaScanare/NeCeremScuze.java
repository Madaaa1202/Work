package FunctionalitateaScanare;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.medicalfriend.PaginaSelectareTipContUtilizator;
import com.example.medicalfriend.R;

import java.util.Timer;
import java.util.TimerTask;

public class NeCeremScuze extends AppCompatActivity {
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ne_cerem_scuze);
        overridePendingTransition(0, 0);
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(NeCeremScuze.this, PaginaSelectareTipContUtilizator.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}