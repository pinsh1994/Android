package com.example.philipp.studienplaner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Philipp on 09.09.2017.
 */

public class menu_activity extends Activity implements View.OnClickListener {

    private Button module;
    private Button stundenplan;
    private Button notenschnitt;
    private Button empfehlungen;



    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setupUI();

    }


    private void setupUI(){
        module = (Button) findViewById(R.id.button_1);
        module.setOnClickListener(this);
        stundenplan =(Button) findViewById(R.id.button_2);
        stundenplan.setOnClickListener(this);
        notenschnitt = (Button) findViewById(R.id.button_3);
        notenschnitt.setOnClickListener(this);
        empfehlungen = (Button) findViewById(R.id.button_4);
        empfehlungen.setOnClickListener(this);

    }


    @Override
    public void onClick(View v){

        switch(v.getId()){

            case R.id.button_1:
                startActivity(new Intent(menu_activity.this, Studienauswahl_activity.class));
                break;
            case R.id.button_2:
                startActivity(new Intent(menu_activity.this, Stundenplan_activity.class));
                break;
            case R.id.button_3:
                startActivity(new Intent(menu_activity.this, notenschnitt_activity.class));
                break;
            case R.id.button_4:
                startActivity(new Intent(menu_activity.this, empfehlungen_activity.class));
                break;
            default:
                break;

        }

    }



}
