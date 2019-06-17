package com.example.finaltest;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import androidx.room.Room;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ListaAlumnosActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alumnos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recycler_view_alumno);

       // ArrayList<Estudiante> estudiantes = new ArrayList<>();

        //for (int i = 0; i <3 ; i++) {
        //    estudiantes.add( new Estudiante("Mariel" + i,"22","machame97@gmail.com",
          //          "16/06/2019"));

        //}

        AppDatebase db = Room.databaseBuilder(getApplicationContext(),AppDatebase.class, "bdestudiante")

                .allowMainThreadQueries()
                .build();

        List<Estudiante> estudiantes = db.estudianteDAO().getAllEstudiantes();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterEstudiante(estudiantes);

        recyclerView.setAdapter(adapter);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaAlumnosActivity.this,FormularioAlumnoActivity.class);
                startActivity(intent);
            }
        });
    }


}
