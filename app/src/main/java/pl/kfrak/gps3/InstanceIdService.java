package pl.kfrak.gps3;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by RENT on 2017-08-11.
 */

public class InstanceIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String token = FirebaseInstanceId.getInstance().getToken(); //singleton - obiekt ktory trzyma nasze ID
        //Zapiszemy do SP (Shared Preferences)

        //czemu słuzy SP skoro mozemy sie do niegi w dowolnym momencie odwołać?
        //bo mozmy ten token np wysłać gdzies

        //dlaczego w servisie? bo dziala w tle i moze odpalic inny serwis który wysle
        //to do np BD albo do innego serwera (zewnętrznego)
    }
}
