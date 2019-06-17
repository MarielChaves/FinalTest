package com.example.finaltest;

import java.util.Date;
import java.util.UUID;

public class Estudiante {

    private String nombre;
    private String edad;
    private String email;
    private String mDate;

    public Estudiante(String nombre, String edad, String email, String mDate) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.mDate = mDate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }
}