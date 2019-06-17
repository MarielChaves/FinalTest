package com.example.finaltest;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HolderEstudiante extends RecyclerView.ViewHolder {

    private TextView nombre_alumno;
    private  TextView fecha;


    public HolderEstudiante(@NonNull View itemView) {
        super(itemView);

        //Instanciamos los elemntos
        nombre_alumno = itemView.findViewById(R.id.nombre_alumnoCard);
        fecha = itemView.findViewById(R.id.fechaCard);
    }

    public TextView getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(TextView nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public TextView getFecha() {
        return fecha;
    }

    public void setFecha(TextView fecha) {
        this.fecha = fecha;
    }


}

