package com.example.healthmonitor;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HealthMonitor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monitor_health);
        init();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.shapka, menu);
        return true;
    }
    public void init(){
        Button toCardClient = findViewById(R.id.toCardClient);
        toCardClient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthMonitor.this, ClientCard.class);
                startActivity(intent);
            }
        });
        Button toPressureMonitor=findViewById(R.id.toPressureMonitorButton);
        toPressureMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthMonitor.this, PressureMonitor.class);
                startActivity(intent);
            }
        });
    }
}
