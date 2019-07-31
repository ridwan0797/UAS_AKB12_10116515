package com.school.carisma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView sma = (ImageView) findViewById(R.id.smanmenu);
        ImageView smk = (ImageView) findViewById(R.id.smkmenu);
        ImageView swasta = (ImageView) findViewById(R.id.swastamenu);
        ImageView smais = (ImageView) findViewById(R.id.smaimenu);
        ImageView smak = (ImageView) findViewById(R.id.smakmenu);



        sma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SmaActivity.class);
                startActivity(intent);
            }
        });

        smk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SmkActivity.class);
                startActivity(intent);
            }
        });
        swasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SwastaActivity.class);
                startActivity(intent);
            }
        });
        smais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SmaiActivity.class);
                startActivity(intent);
            }
        });
        smak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SmakActivity.class);
                startActivity(intent);
            }
        });


    }
}
