package com.yuditarum.resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ramen_btn = (Button)findViewById(R.id.btnRamen);
        Button onigiri_btn = (Button)findViewById(R.id.btnOnigiri);
        Button sushi_btn = (Button)findViewById(R.id.btnSushi);

        ramen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RamenActivity.class);
                startActivity(intent);
            }
        });

        onigiri_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OnigiriActivity.class);
                startActivity(intent);
            }
        });

        sushi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, SushiActivity.class);
                startActivity(intent);
            }
        });

    }
}
