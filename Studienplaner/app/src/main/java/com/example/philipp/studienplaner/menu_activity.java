package com.example.philipp.studienplaner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Philipp on 09.09.2017.
 */

public class menu_activity extends Activity {

    private Button Module;
    private Button Stundenplan;
    private Button Notenschnitt;
    private Button Empfehlungen;



    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setupUI();
        waitForAction();

    }


    private void setupUI(){
        Module = (Button) findViewById(R.id.button_1);
        Stundenplan=(Button) findViewById(R.id.button_2);
        Notenschnitt= (Button) findViewById(R.id.button_3);
        Empfehlungen = (Button) findViewById(R.id.button_4);

    }
    private void waitForAction(){
        Module.setOnClickListener((View.OnClickListener) this);
        Stundenplan.setOnClickListener((View.OnClickListener) this);
        Notenschnitt.setOnClickListener((View.OnClickListener) this);
        Empfehlungen.setOnClickListener((View.OnClickListener) this);
    }

    private void onClick(View v){
        if(v == findViewById(R.id.button_1)){
            Intent intent=new Intent(menu_activity.this,module_activity.class);

            startActivity(intent);
        }
        else if(v == findViewById(R.id.button_2)){
            Intent intent=new Intent(menu_activity.this,Stundenplan_activity.class);

            startActivity(intent);
        }
        else if(v == findViewById(R.id.button_3)){
            Intent intent=new Intent(menu_activity.this,notenschnitt_activity.class);

            startActivity(intent);
        }
        else if(v == findViewById(R.id.button_4)){
            Intent intent=new Intent(menu_activity.this,empfehlungen_activity.class);

            startActivity(intent);
        }

    }
}
