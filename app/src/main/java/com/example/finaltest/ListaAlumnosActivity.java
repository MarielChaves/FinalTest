package com.example.finaltest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayDeque;
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

        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        for (int i = 0; i <3 ; i++) {
            estudiantes.add( new Estudiante("Mariel" + i,"22","machame97@gmail.com",
                    "16/06/2019"));

        }


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
