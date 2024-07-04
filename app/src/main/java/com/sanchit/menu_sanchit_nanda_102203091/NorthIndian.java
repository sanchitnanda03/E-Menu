package com.sanchit.menu_sanchit_nanda_102203091;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NorthIndian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_indian);

        Button btnndm = findViewById(R.id.btnndm);
        btnndm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dm= new Intent(getApplicationContext(), dalmakhani.class);
                startActivity(dm);
            }
        });
    }
}