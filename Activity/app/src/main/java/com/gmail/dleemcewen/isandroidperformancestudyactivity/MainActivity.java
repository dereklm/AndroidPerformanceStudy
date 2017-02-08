package com.gmail.dleemcewen.isandroidperformancestudyactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button lowLow, lowMid, lowHi, midLow, midMid, midHi, hiLow, hiMid, hiHi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lowLow = (Button) findViewById(R.id.low_low);
        lowLow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //maybe put timer here.
                Intent intent = new Intent(getApplicationContext(), LowLowActivity.class);
                startActivity(intent);
            }
        });

        midLow = (Button) findViewById(R.id.mid_low);
        midLow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //maybe put timer here.
                Intent intent = new Intent(getApplicationContext(), MidLowActivity.class);
                startActivity(intent);
            }
        });

        hiLow = (Button) findViewById(R.id.high_low);
        hiLow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //maybe put timer here.
                Intent intent = new Intent(getApplicationContext(), HiLowActivity.class);
                startActivity(intent);
            }
        });

        lowMid = (Button) findViewById(R.id.low_mid);
        lowMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //maybe put timer here.
                Intent intent = new Intent(getApplicationContext(), LowMidActivity.class);
                startActivity(intent);
            }
        });

        midMid = (Button) findViewById(R.id.low_mid);
        midMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //maybe put timer here.
                Intent intent = new Intent(getApplicationContext(), MidMidActivity.class);
                startActivity(intent);
            }
        });

        hiMid = (Button) findViewById(R.id.low_mid);
        hiMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //maybe put timer here.
                Intent intent = new Intent(getApplicationContext(), HiMidActivity.class);
                startActivity(intent);
            }
        });
    }
}