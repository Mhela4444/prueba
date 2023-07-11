package com.example.pruebasegundoparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quienesomos extends AppCompatActivity {

    Button regresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quienesomos);

        regresar = (Button) findViewById(R.id.regresar);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent( quienesomos.this, MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}