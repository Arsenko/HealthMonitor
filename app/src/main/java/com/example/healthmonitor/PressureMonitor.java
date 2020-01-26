package com.example.healthmonitor;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PressureMonitor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monitor_pressure);
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
                Intent intent = new Intent(PressureMonitor.this, ClientCard.class);
                startActivity(intent);
            }
        });
        Button toHealthMonitor=findViewById(R.id.toHealthMonitorButton);
        toHealthMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PressureMonitor.this, HealthMonitor.class);
                startActivity(intent);
            }
        });
    }
}

