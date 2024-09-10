package PaginaPrincipalaDupaAutentificare;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.medicalfriend.R;

import java.util.Calendar;

public class Alarma2 extends AppCompatActivity implements View.OnClickListener {

    private int notificationId=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarma2);
        overridePendingTransition(0, 0);

        findViewById(R.id.buttonSet).setOnClickListener(this);
        findViewById(R.id.buttonCancel).setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        EditText editText=findViewById(R.id.editText);
        TimePicker timePicker=findViewById(R.id.timePicker);

        //setare id notificare + text
        Intent intent=new Intent(Alarma2.this, AlarmReciver.class);
        intent.putExtra("Notification Id",notificationId);
        intent.putExtra("todo",editText.getText().toString());

        PendingIntent alarmIntent =PendingIntent.getBroadcast(Alarma2.this,0,intent,PendingIntent.FLAG_CANCEL_CURRENT);
        AlarmManager alarmManager=(AlarmManager) getSystemService(ALARM_SERVICE);

        switch (view.getId()){
            case R.id.buttonSet:
                int hour=timePicker.getCurrentHour();
                int minute=timePicker.getCurrentMinute();

                //creare ora alarma
                Calendar startTime=Calendar.getInstance();
                startTime.set(Calendar.HOUR_OF_DAY,hour);
                startTime.set(Calendar.MINUTE,minute);
                startTime.set(Calendar.SECOND,0);
                long alarmStartTime=startTime.getTimeInMillis();

                //setare alarma
                alarmManager.set(AlarmManager.RTC_WAKEUP,alarmStartTime,alarmIntent);
                Toast.makeText(this, R.string.editor_insert_reminder_successful, Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonCancel:
                alarmManager.cancel(alarmIntent);
                Toast.makeText(this, R.string.editor_delete_reminder_successful, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}