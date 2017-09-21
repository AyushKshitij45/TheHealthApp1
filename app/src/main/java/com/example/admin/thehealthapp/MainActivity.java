package com.example.admin.thehealthapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        ImageView startEmergency = (ImageView) (findViewById(R.id.start_emergency));

        startEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emergencyIntent = new Intent(MainActivity.this, EmergencyActActivity.class);

                startActivity(emergencyIntent);
            }
        });

        TextView myHealth = (TextView) (findViewById(R.id.myHealth));

        myHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent healthIntent = new Intent(MainActivity.this, HealthActivity.class);

                startActivity(healthIntent);
            }
        });

       /* TextView browse=(TextView) (findViewById(R.id.browse));

        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browseIntent=new Intent(MainActivity.this, BrowseActivity.class);

                startActivity(browseIntent);
            }
        });*/

        TextView myAccount = (TextView) (findViewById(R.id.myAccount));

        myAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent accountIntent = new Intent(MainActivity.this, AccountActivity.class);
                startActivity(accountIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem searchItem = menu.findItem(R.id.search);
        MenuItem searchMenuItem = menu.findItem(R.id.search);
        if (searchMenuItem == null) {
            return true;
        }

        searchItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=hospitals");

// Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
// Make the Intent explicit by setting the Google Maps package
                mapIntent.setPackage("com.google.android.apps.maps");

// Attempt to start an activity that can handle the Intent
                startActivity(mapIntent);

                return true;
            }
        });

        return true;
    }

    }




