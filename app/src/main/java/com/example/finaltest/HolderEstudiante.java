package com.example.finaltest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class HolderEstudiante extends RecyclerView.ViewHolder {

    private TextView nombre_alumno;
    private  TextView edad;
    private  TextView email;

    public HolderEstudiante(@NonNull View itemView) {
        super(itemView);
        nombre_alumno = itemView.findViewById(R.id.nombre_alumnoCard);
        edad = itemView.findViewById(R.id.edadCard);
        email = itemView.findViewById(R.id.emailCard);
    }

    public TextView getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(TextView nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public TextView getEdad() {
        return edad;
    }

    public void setEdad(TextView edad) {
        this.edad = edad;
    }

    public TextView getEmail() {
        return email;
    }

    public void setEmail(TextView email) {
        this.email = email;
    }
}

