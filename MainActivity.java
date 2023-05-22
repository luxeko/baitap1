package com.example.listviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 1: create data source
        String[] data = {"Java", "Python", "C++", "JavaScript", "Ruby", "PHP", "Swift"};
        //step 2: create adapter attach data source
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.textviewitem, data);

        //step 3: create list view with adapter
        ListView listView = findViewById(R.id.listContact);
        listView.setAdapter(arrayAdapter);

    }
}