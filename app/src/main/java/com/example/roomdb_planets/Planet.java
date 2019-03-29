package com.example.roomdb_planets;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "planet_table")
public class Planet {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "planetName")
    public String name; //Planet name

    public Float gravity; //Planet gravity



    public Planet(String name, Float gravity) {
        this.name = name;
        this.gravity = gravity;
    }


    public String getName(){
        return this.name;
    }

    public void setname(String name){
        this.name = name;
    }

    public Float getGravity(){
        return gravity;
    }

    public void setGravity(Float gravity){
        this.gravity = gravity;
    }


}
