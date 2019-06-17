package com.example.finaltest;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class FormularioAlumnoActivity extends AppCompatActivity {
    private ImageView imageView;
    private static final int REQUEST_IMAGE_CAPTURE = 101;

    Button btnIrVista3;
    Button btnHome2;
    Button btnGuardar;


    EditText nombre;
    EditText edad;
    EditText email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_alumno);
        imageView = findViewById(R.id.imageView);

        nombre = findViewById(R.id.editTextNombre);
        edad   = findViewById(R.id.editTextEdad);
        email  = findViewById(R.id.editTextEmail);

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
        final AppDatebase db = Room.databaseBuilder(getApplicationContext(),AppDatebase.class, "bdestudiante")

                .allowMainThreadQueries()
                .build();

        btnGuardar = findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                db.estudianteDAO().insertAll(new Estudiante(
                        nombre.getText().toString(), edad.getText().toString(), email.getText().toString()));

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            imageView.setImageBitmap(imageBitmap);
        }
    }

}
