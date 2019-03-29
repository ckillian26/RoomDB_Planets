package com.example.roomdb_planets;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface PlanetDao {

    @Insert
    void insert(Planet planet);

    @Query("DELETE FROM planet_table")
    void deleteAll();

    @Query("SELECT * from planet_table ORDER BY planetName ASC")
    LiveData<List<Planet>> getAllPlanets();
}