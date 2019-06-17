package com.example.finaltest;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class AdapterEstudiante extends RecyclerView.Adapter<HolderEstudiante> {

    private List<Estudiante> estudiantes;

    public AdapterEstudiante(List<Estudiante> estudiantes) {
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
        holder.getEdad().setText(estudiantes.get(position).getEdad());
        holder.getEmail().setText(estudiantes.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return estudiantes.size();
    }


}
