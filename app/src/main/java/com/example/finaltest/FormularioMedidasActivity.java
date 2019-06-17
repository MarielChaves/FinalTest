package com.example.finaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormularioMedidasActivity extends AppCompatActivity {

    Button btnHome3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_medidas);

        btnHome3 = findViewById(R.id.btnHome3);
        btnHome3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormularioMedidasActivity.this,ListaMedidasActivity.class);
                startActivity(intent);
            }
        });



    }
}
