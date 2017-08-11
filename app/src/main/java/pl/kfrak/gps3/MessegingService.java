package pl.kfrak.gps3;

import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by RENT on 2017-08-11.
 */

public class MessegingService extends FirebaseMessagingService {
    //service który zbiera transmisje


    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        Toast.makeText(this, remoteMessage.toString(), Toast.LENGTH_SHORT).show();
    }
}
