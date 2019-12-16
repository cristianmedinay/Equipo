package com.example.liga.util;

public class Jugador {


    String nombre;
    boolean punto;
    String lugar;

    public Jugador(String nombre, boolean punto, String lugar) {
        this.nombre = nombre;
        this.punto = punto;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPunto() {
        return punto;
    }

    public void setPunto(boolean punto) {
        this.punto = punto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
