package com.example.android.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.time.Duration;

public  class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner mlabelSpinner;
    private String mSpinnerLabel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlabelSpinner = (Spinner) findViewById(R.id.L_spinner);
        if (mlabelSpinner != null) {
            mlabelSpinner.setOnItemSelectedListener(this);
        }

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.BLDEA, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (mlabelSpinner != null) {
            mlabelSpinner.setAdapter(adapter);
        }
            mlabelSpinner.setAdapter(adapter);

        }



        public void onItemSelected (AdapterView < ? > adapterView, View view,int i, long l){
            mSpinnerLabel = adapterView.getItemAtPosition(i).toString();
            Toast.makeText(this, "shravana\n"+mSpinnerLabel, Toast.LENGTH_LONG).show();

        }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}
