package rikkeisoft.nguyenducdung.com.appa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MyBroadcastReceiver myBroadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter = new IntentFilter("rikkeisoft.nguyenducdung.com.CALL_A");
        myBroadcastReceiver = new MyBroadcastReceiver();
        if (intentFilter != null) {
            registerReceiver(myBroadcastReceiver, intentFilter);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (myBroadcastReceiver != null) {
            unregisterReceiver(myBroadcastReceiver);
        }
    }

}
