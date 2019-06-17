package com.example.finaltest;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Estudiante.class}, version = 1)
public abstract class AppDatebase extends RoomDatabase {
    public abstract EstudianteDAO estudianteDAO();
}
