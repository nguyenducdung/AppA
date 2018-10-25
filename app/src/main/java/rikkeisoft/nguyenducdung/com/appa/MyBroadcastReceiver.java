package rikkeisoft.nguyenducdung.com.appa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        String text = bundle.getString("keya");
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
