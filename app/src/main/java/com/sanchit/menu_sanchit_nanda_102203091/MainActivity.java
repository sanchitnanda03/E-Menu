package com.sanchit.menu_sanchit_nanda_102203091;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnn = findViewById(R.id.btnn);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca= new Intent(getApplicationContext(), NorthIndian.class);
                startActivity(ca);
            }
        });
        Button btns = findViewById(R.id.btns);
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca= new Intent(getApplicationContext(), south_indian.class);
                startActivity(ca);
            }
        });
        Button btnb = findViewById(R.id.btnb);
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca= new Intent(getApplicationContext(), Breads.class);
                startActivity(ca);
            }
        });

        Button btnso = findViewById(R.id.btnso);
        btnso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca= new Intent(getApplicationContext(), Soups.class);
                startActivity(ca);
            }
        });

        Button btnc = findViewById(R.id.btnc);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca= new Intent(getApplicationContext(), chinese.class);
                startActivity(ca);
            }
        });

        Button btnd = findViewById(R.id.btnd);
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca= new Intent(getApplicationContext(), Desserts.class);
                startActivity(ca);
            }
        });

        Button btndeveloper = findViewById(R.id.btndeveloper);
        btndeveloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca= new Intent(getApplicationContext(), Developer.class);
                startActivity(ca);
            }
        });



    }
}