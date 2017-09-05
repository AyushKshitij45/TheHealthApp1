package com.example.admin.thehealthapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class EmargencyResponseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_response);

        TextView ambulance= (TextView)(findViewById(R.id.call_ambulance));

        ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "102";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        TextView hospital= (TextView)(findViewById(R.id.call_hospital));

        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "101";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        TextView police= (TextView)(findViewById(R.id.call_police));

        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "100";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
}
}
