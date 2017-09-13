package com.example.philipp.studienplaner;

import android.app.ActionBar;
import android.os.Bundle;
import android.widget.Toolbar;

/**
 * Created by Philipp on 09.09.2017.
 */

public class notenschnitt_activity extends menu_activity{

    private Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notenschnitt_activity);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    private void setSupportActionBar(Toolbar myToolbar){
        this.myToolbar = myToolbar;

    }

}
