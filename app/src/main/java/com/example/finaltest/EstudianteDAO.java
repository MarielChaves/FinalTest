package com.example.finaltest;



import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface EstudianteDAO {

    @Query("SELECT * FROM Estudiante")
    List<Estudiante> getAllEstudiantes();


    @Insert
    void insertAll(Estudiante... estudiantes);
}
