package com.example.truthordare.database.model;


import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Player {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;

    private String points;
    public Player() {
    }
    @Ignore
    public Player(String name) {
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  getPoints() {
        return points;
    }

    public void setPoints(String  points) {
        this.points = points;
    }
}
