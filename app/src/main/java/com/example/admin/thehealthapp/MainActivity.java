package com.example.admin.thehealthapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView startEmergency=(ImageView) (findViewById(R.id.start_emergency));

        startEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emergencyIntent= new Intent(MainActivity.this, EmergencyActActivity.class);

                startActivity(emergencyIntent);
            }
        });

        TextView myHealth =(TextView) (findViewById(R.id.myHealth));

        myHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent healthIntent= new Intent(MainActivity.this, HealthActivity.class);

                startActivity(healthIntent);
            }
        });

        TextView browse=(TextView) (findViewById(R.id.browse));

        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browseIntent=new Intent(MainActivity.this, BrowseActivity.class);

                startActivity(browseIntent);
            }
        });

        TextView myAccount= (TextView)(findViewById(R.id.myAccount));

        myAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent accountIntent =new Intent(MainActivity.this,AccountActivity.class);
                startActivity(accountIntent);
            }
        });
    }
}
