package com.example.philipp.studienplaner;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class empfehlungen_activity extends menu_activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empfelungen_activity);
        setupSpinner();


    }

    private void setupSpinner(){

        Spinner spinner = (Spinner) findViewById(R.id.semester_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.semester_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }
}
