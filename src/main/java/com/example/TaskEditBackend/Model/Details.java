package com.example.TaskEditBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="details")
public class Details {
   @Id
   @GeneratedValue()
   private int id;
   private String name;
    private String descriptions;
    private boolean tick;
    private String tickdata;

    public Details() {
    }

    public Details(int id, String name, String descriptions, boolean tick, String tickdata) {
        this.id = id;
        this.name = name;
        this.descriptions = descriptions;
        this.tick = tick;
        this.tickdata = tickdata;
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

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isTick() {
        return tick;
    }

    public void setTick(boolean tick) {
        this.tick = tick;
    }

    public String getTickdata() {
        return tickdata;
    }

    public void setTickdata(String tickdata) {
        this.tickdata = tickdata;
    }
}
