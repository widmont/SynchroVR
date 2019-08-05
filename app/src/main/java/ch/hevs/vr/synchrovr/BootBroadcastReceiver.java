package ch.hevs.vr.synchrovr;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;

public class BootBroadcastReceiver extends WakefulBroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("TEST", "broadcast test");
        Intent i = new Intent(Intent.ACTION_MAIN);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        i.setComponent(new ComponentName("com.oculus.UnitySample","com.unity3d.player.UnityPlayerActivity"));
        context.startActivity(i);
        //Intent startServiceIntent = new Intent(context, SynchroIntentService.class);
        //startWakefulService(context, startServiceIntent);
    }
}
