package com.example.healthmonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

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
        Button toHealthMonitor= findViewById(R.id.toHealthMonitorButton);
        toHealthMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClientCard.this, HealthMonitor.class);
                startActivity(intent);
            }
        });
        Button toPressureMonitor=findViewById(R.id.toPressureMonitorButton);
        toPressureMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClientCard.this, PressureMonitor.class);
                startActivity(intent);
            }
        });
    }
}
