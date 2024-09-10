package PaginaPrincipalaDupaAutentificare;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.medicalfriend.R;

public class Alarma extends AppCompatActivity {

 static final int ALARM_REQ_CODE=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarma);
        overridePendingTransition(0, 0);


        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        findViewById(R.id.buttonSet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int time=Integer.parseInt(((EditText)(findViewById(R.id.editTime))).getText().toString());
                long triggerTime =System.currentTimeMillis()+(time*1000);
                Intent iAlarmBroadcast=new Intent(Alarma.this,MyReciver.class);
                PendingIntent pendingIntent=PendingIntent.getBroadcast(Alarma.this,ALARM_REQ_CODE,iAlarmBroadcast,PendingIntent.FLAG_UPDATE_CURRENT);
                alarmManager.set(AlarmManager.RTC_WAKEUP, triggerTime,pendingIntent);
            }
        });


    }


}