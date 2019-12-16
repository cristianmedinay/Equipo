package com.example.liga.util;

import com.example.liga.R;

import java.util.ArrayList;

public class DataSet {


    public static DataSet newInstance(){
        DataSet dataSet = new DataSet();

        return dataSet;
    }
    public ArrayList Barcelona(){
        ArrayList<Jugador> lista = new ArrayList<>();
        lista.add(new Jugador("Marc-André ter Stegen",false,"Guardameta"));
        lista.add(new Jugador("C Lenglet",true,"defensa"));
        lista.add(new Jugador("Pique",false,"defensa"));
        lista.add(new Jugador("Sergi Roberto",true,"defensa"));
        lista.add(new Jugador("Jordi Alba",true,"defensa"));
        lista.add(new Jugador("Busquets",true,"medio"));
        lista.add(new Jugador("Rakitic",true,"medio"));
        lista.add(new Jugador("F. de Jong",true,"medio"));
        lista.add(new Jugador("Lionel Messi",false,"Delantero"));
        lista.add(new Jugador("Luis Suarez",true,"Delantero"));


        return lista;
    }
/*
    public  ArrayList obtenerPersonasEspania(){

        ArrayList<Liga> lista = new ArrayList();
        lista.add(new Liga("Jose","Apellido",123,0));
        lista.add(new Liga("Maria","Apellido",123,1));
        lista.add(new Liga("Pepe","Apellido",123,0));
        lista.add(new Liga("Juan","Apellido",123,0));
        lista.add(new Liga("Luis","Apellido",123,0));
        lista.add(new Liga("Marta","Apellido",123,1));
        lista.add(new Liga("Marta","Apellido",123,1));
        lista.add(new Liga("?????","Apellido",123,2));
        return lista;
    }



    public static ArrayList obtenerPersonasCatalonia(){

        ArrayList<Liga> lista = new ArrayList();
        lista.add(new Liga("asdf","Apellido",123,0));
        lista.add(new Liga("asd","Apellido",123,1));
        lista.add(new Liga("asdf","Apellido",123,0));
        lista.add(new Liga("afads","Apellido",123,0));
        lista.add(new Liga("gsdfsadf","Apellido",123,0));
        lista.add(new Liga("klksadf","Apellido",123,1));
        lista.add(new Liga("mmdm","Apellido",123,1));
        lista.add(new Liga("?????","Apellido",123,2));
        return lista;
    }


 */
public ArrayList listaLigasEuropa() {
    ArrayList<Liga> lista = new ArrayList<>();
    lista.add(new Liga("Liga Santander",R.drawable.laliga,listaEquiposLiga()));
    lista.add(new Liga("Premier League",R.drawable.premiere,listaEquiposPremier()));
    lista.add(new Liga("Calcio Serie A",R.drawable.calcio,listaEquiposItalia()));
    return lista;

}
    public ArrayList listaEquiposLiga(){

        ArrayList<Equipo> lista = new ArrayList();
        lista.add(new Equipo("Atletico de Madrid","CampNou",null, R.drawable.atletico));
        lista.add(new Equipo("FC.Barcelona","CampNou",null, R.drawable.barsa));
        lista.add(new Equipo("Real Madrid","Bernabeu",null, R.drawable.madrid));
        lista.add(new Equipo("Valencia","Mestalla",null, R.drawable.valencia));
        lista.add(new Equipo("Sevilla","Sanchez Pijuan",null, R.drawable.sevilla));
        lista.add(new Equipo("Getafe","Alfonso Perez",null, R.drawable.getafe));
        lista.add(new Equipo("Leganes","Butarque",null, R.drawable.leganes));
        return lista;
    }

    public ArrayList listaEquiposPremier(){
        ArrayList<Equipo> lista = new ArrayList();

        lista.add(new Equipo("M. City","Etihad Stadium",null, R.drawable.city));
        lista.add(new Equipo("Liverpool","Anfiled",null, R.drawable.liverpool));
        lista.add(new Equipo("Manchester United","Old Traford",null, R.drawable.manchester));
        lista.add(new Equipo("Everton","Goodison",null, R.drawable.everton));
        lista.add(new Equipo("Leicester","King Power Stadium",null, R.drawable.leices));
        lista.add(new Equipo("Chelsea","Stanford Bridge",null, R.drawable.chelsea));
        return lista;
    }

    public ArrayList listaEquiposItalia(){
        ArrayList<Equipo> lista = new ArrayList();

        lista.add(new Equipo("Juventus","Etihad Stadium",null, R.drawable.juventus));
        lista.add(new Equipo("Milan","Old Traford",null, R.drawable.milan));
        lista.add(new Equipo("Inter","Goodison",null, R.drawable.inter));
        return lista;
    }


}


