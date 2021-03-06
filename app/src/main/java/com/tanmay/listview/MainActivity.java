package com.tanmay.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView citiesList;
    private Spinner studentsSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.citiesList);
        studentsSpinner = findViewById(R.id.studentsSpinner);

        ArrayList<String> students = new ArrayList<>();
        students.add("hgjf");
        students.add("hjkl");
        students.add("abcd");

        ArrayAdapter<String> studentAdapter = new ArrayAdapter<>(this
        , android.R.layout.simple_spinner_dropdown_item,students);

        studentsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, students.get(position) + "selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        final ArrayList<String> cities = new ArrayList<>();
        cities.add("new york");
        cities.add("Ahmedabad");
        cities.add("Mumbai");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,cities);
        citiesList.setAdapter(citiesAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, cities.get(position) + "selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}