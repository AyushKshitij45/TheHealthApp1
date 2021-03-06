package com.example.admin.thehealthapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HealthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        ArrayList<List> disease = new ArrayList<List>();

        disease.add(new List("BP","120/80",R.drawable.blood_pressure));
        disease.add(new List("Sugar Level(before meal)","90",R.drawable.sugar1));
        disease.add(new List("Sugar Level(after meal)","130",R.drawable.sugar1));
        disease.add(new List("Pulse Rate","70",R.drawable.heart_rate));
        disease.add(new List("Heart Rate","70",R.drawable.heart_rate));


ListAdapter listAdapter= new ListAdapter (this,disease);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.listview_flavor);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(listAdapter);
    }
}
