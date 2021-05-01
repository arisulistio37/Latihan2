package com.asplendid.bloodsher;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 10118030
 * Ari Sulistio
 * IF-1
 */

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent homeintent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(homeintent);
                finish();
            }
        }, SPLASH_TIME_OUT);


    }
}
