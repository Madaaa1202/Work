package PaginaPrincipalaDupaAutentificare;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int notificationId = intent.getIntExtra("notificationId", 0);
        String message = intent.getStringExtra("todo");

        Intent mainIntent = new Intent(context, Alarma2.class);

      //cand se apasa notificatia se deschide pagina de alarma
        PendingIntent contentIntent=PendingIntent.getActivity(context,0,mainIntent,0);
        String CHANNEL_ID = "my_channel_01";// The id of the channel.
        NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, "123", NotificationManager.IMPORTANCE_HIGH);
        NotificationManager notificationManager=(NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.createNotificationChannel(mChannel);
        mChannel.enableLights(true);
       // if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
         //   notificationManager.createNotificationChannel(mChannel);
        //}

        //constructia notificarii
       /* Notification.Builder builder=new Notification.Builder(context);
        builder.setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Alarm")
                .setContentText(message)
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                .setContentIntent(contentIntent)
                .setPriority(Notification.PRIORITY_MAX)
                .setDefaults(Notification.DEFAULT_ALL);



        notificationManager.notify(notificationId,builder.build());*/

        Notification notification= new Notification.Builder(context.getApplicationContext(),CHANNEL_ID)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Alarm")
                .setContentText(message)
                .setAutoCancel(true)
                .setWhen(System.currentTimeMillis())
                .setContentIntent(contentIntent)
                .build();

        if (notificationManager!=null)
        {
            notificationManager.createNotificationChannel(mChannel);
            notificationManager.notify(notificationId, notification);
        }

    }
}
