package com.example.liga.util;

import java.io.Serializable;
import java.util.ArrayList;

public class Equipo implements Serializable {
    String equipo,estadio;
    int img;
    ArrayList equipos;

    public Equipo(String equipo, String estadio, ArrayList equipos, int img) {
        this.equipo = equipo;
        this.estadio = estadio;
        this.img = img;
        this.equipos = equipos;
    }



    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public ArrayList getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList equipos) {
        this.equipos = equipos;
    }
}