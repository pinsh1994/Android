package com.example.philipp.studienplaner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class module_inf_activity extends menu_activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modul_mi_activity);
        setupUi();

    }

    private void setupUi() {
        Button modul1 = (Button) findViewById(R.id.modul_1_inf);
        modul1.setOnClickListener(this);
        Button modul2 = (Button) findViewById(R.id.modul_2_inf);
        modul2.setOnClickListener(this);
        Button modul4 = (Button) findViewById(R.id.modul_4_inf);
        modul4.setOnClickListener(this);
        Button modul5 = (Button) findViewById(R.id.modul_5_inf);
        modul5.setOnClickListener(this);
        Button modul6 = (Button) findViewById(R.id.modul_6_inf);
        modul6.setOnClickListener(this);
        Button modul7 = (Button) findViewById(R.id.modul_7_inf);
        modul7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.modul_1_inf:
                startActivity(new Intent(module_inf_activity.this, modul_view_activity.class));
                break;
            case R.id.modul_2_inf:
                startActivity(new Intent(module_inf_activity.this, modul_view_activity.class));
                break;
            case R.id.modul_4_inf:
                startActivity(new Intent(module_inf_activity.this, modul_view_activity.class));
                break;
            case R.id.modul_5_inf:
                startActivity(new Intent(module_inf_activity.this, modul_view_activity.class));
                break;
            case R.id.modul_6_inf:
                startActivity(new Intent(module_inf_activity.this, modul_view_activity.class));
                break;
            case R.id.modul_7_inf:
                startActivity(new Intent(module_inf_activity.this, modul_view_activity.class));
                break;
            default:
                break;

        }
    }
}
