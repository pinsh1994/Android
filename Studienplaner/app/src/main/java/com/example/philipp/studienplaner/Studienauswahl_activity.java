package com.example.philipp.studienplaner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Studienauswahl_activity extends menu_activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studienauswahl_activity);
        setupUi();
    }

    private void setupUi(){
        Button miButton = (Button) findViewById(R.id.medieninformatik_button);
        miButton.setOnClickListener(this);
        Button infButton = (Button) findViewById(R.id.informationswissenschaft_button);
        infButton.setOnClickListener(this);
        Button wahlbereich = (Button) findViewById(R.id.wahlbereich_button);
        wahlbereich.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.medieninformatik_button:
                startActivity(new Intent(Studienauswahl_activity.this, module_mi_activity.class));
                break;
            case R.id.informationswissenschaft_button:
                startActivity(new Intent(Studienauswahl_activity.this, module_inf_activity.class));
                break;
            case R.id.wahlbereich_button:
                startActivity(new Intent(Studienauswahl_activity.this, Wahlbereich_activity.class));
                break;
            default:
                break;
        }
    }


}