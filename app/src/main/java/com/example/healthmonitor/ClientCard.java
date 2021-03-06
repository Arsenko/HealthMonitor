package com.example.healthmonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.healthmonitor.logicClass.Namespace;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_client);
        init();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.shapka, menu);
        return true;
    }

    public void init(){

        final ArrayList<Namespace> names=new ArrayList<Namespace>();
        final TextView surname=findViewById(R.id.surname);
        final TextView name=findViewById(R.id.name);
        final TextView lastname=findViewById(R.id.lastname);
        final TextView age=findViewById(R.id.age);
        Button toHealthMonitor= findViewById(R.id.toHealthMonitorButton);
        toHealthMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("OnClick button toHM","OnClick button toHealthMonitor");
                Intent intent = new Intent(ClientCard.this, HealthMonitor.class);
                startActivity(intent);
            }
        });
        Button toPressureMonitor=findViewById(R.id.toPressureMonitorButton);
        toPressureMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("OnClick button toPM","OnClick button toPressureMonitor");
                Intent intent = new Intent(ClientCard.this, PressureMonitor.class);
                startActivity(intent);
            }
        });
        Button saveButton=findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("OnClick button save","OnClick button save");
                System.out.println(surname.getText().toString());
                if(checkForm(surname,name,lastname,age)){
                    names.add(new Namespace(surname.getText().toString(),name.getText().toString(),
                            lastname.getText().toString(),
                            Integer.valueOf(age.getText().toString())));
                }
            }
        });
    }
    public boolean checkForm(TextView surname,TextView name,TextView lastname,TextView age){
        if(surname.getText().length()!=0 || name.getText().length()!=0||
                lastname.getText().length()!=0 || age.getText().length()!=0) {
            return false;
        }
        try{
            Integer.valueOf(age.getText().toString());
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
}
