package com.example.admin.thehealthapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;

public class EmargencyResponseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_response);

        TextView ambulance= (TextView)(findViewById(R.id.call_ambulance));
        if (ActivityCompat.checkSelfPermission(EmargencyResponseActivity.this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(EmargencyResponseActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);


        }
        new CountDownTimer(3000, 1000) {
            public void onFinish() {
                Intent startEmergency = new Intent(Intent.ACTION_CALL, Uri.parse("tel:108"));
                startActivity(startEmergency);
                    finish();
                }

            public void onTick(long millisUntilFinished) {
            }
        }.start();


        ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "102";
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.fromParts("tel", phone, null));
                if (ActivityCompat.checkSelfPermission(EmargencyResponseActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(EmargencyResponseActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);
                    return;
                }
                startActivity(intent);
            }
        });

        TextView hospital= (TextView)(findViewById(R.id.call_hospital));

        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "108";
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.fromParts("tel", phone, null));
                if (ActivityCompat.checkSelfPermission(EmargencyResponseActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(EmargencyResponseActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);
                    return;
                }
                startActivity(intent);
            }
        });

        TextView police= (TextView)(findViewById(R.id.call_police));

        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "100";
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.fromParts("tel", phone, null));
                if (ActivityCompat.checkSelfPermission(EmargencyResponseActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(EmargencyResponseActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);
                    return;
                }
                startActivity(intent);
            }
        });
}
}
