package com.example.finaltest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdapterEstudiante extends RecyclerView.Adapter<HolderEstudiante> {

    private ArrayList<Estudiante> estudiantes;

    public AdapterEstudiante(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @NonNull
    @Override
    public HolderEstudiante onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.card_view_estudiante,parent,false);

        return new HolderEstudiante(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderEstudiante holder, int position) {

        holder.getNombre_alumno().setText(estudiantes.get(position).getNombre());

    }

    @Override
    public int getItemCount() {
        return estudiantes.size();
    }


}
