package com.example.philipp.studienplaner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class module_mi_activity extends menu_activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modul_mi_activity);
        setupUi();
}

    private void setupUi() {
        Button modul1 = (Button) findViewById(R.id.modul_1_mi);
        modul1.setOnClickListener(this);
        Button modul2 = (Button) findViewById(R.id.modul_2_mi);
        modul2.setOnClickListener(this);
        Button modul3 = (Button) findViewById(R.id.modul_3_mi);
        modul3.setOnClickListener(this);
        Button modul4 = (Button) findViewById(R.id.modul_4_mi);
        modul4.setOnClickListener(this);
        Button modul5 = (Button) findViewById(R.id.modul_5_mi);
        modul5.setOnClickListener(this);
        Button modul10 = (Button) findViewById(R.id.modul_10_mi);
        modul10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch(v.getId()){

            case R.id.modul_1_mi:
                startActivity(new Intent(module_mi_activity.this, modul_view_activity.class));
                break;
            case R.id.modul_2_mi:
                startActivity(new Intent(module_mi_activity.this, modul_view_activity.class));
                break;
            case R.id.modul_3_mi:
                startActivity(new Intent(module_mi_activity.this, modul_view_activity.class));
                break;
            case R.id.modul_4_mi:
                startActivity(new Intent(module_mi_activity.this, modul_view_activity.class));
                break;
            case R.id.modul_5_mi:
                startActivity(new Intent(module_mi_activity.this, modul_view_activity.class));
                break;
            case R.id.modul_10_mi:
                startActivity(new Intent(module_mi_activity.this, modul_view_activity.class));
                break;
            default:
                break;

        }
    }
    }
