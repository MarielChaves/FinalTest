package com.example.finaltest;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormularioAlumnoActivity extends AppCompatActivity {

    Button btnIrVista3;
    Button btnHome2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_alumno);

        btnIrVista3 = findViewById(R.id.btnIrVista3);
        btnIrVista3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormularioAlumnoActivity.this,ListaMedidasActivity.class);
                startActivity(intent);
            }
        });

        btnHome2 = findViewById(R.id.btnHome2);
        btnHome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormularioAlumnoActivity.this,ListaAlumnosActivity.class);
                startActivity(intent);
            }
        });


    }

    public void takePicture(View view) {
        Intent imageTakeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(imageTakeIntent.resolveActivity(getPackageManager()) !=null) {
            startActivity(imageTakeIntent);
        }
    }


}
