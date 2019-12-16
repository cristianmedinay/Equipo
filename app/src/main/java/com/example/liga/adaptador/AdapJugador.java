package com.example.liga.adaptador;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.liga.EquipojugadoresActivity;
import com.example.liga.util.Jugador;

import java.util.ArrayList;
import java.util.List;

public class AdapJugador extends RecyclerView.Adapter {
    Context contexto;
    List<Jugador> listaJugadores;


    public AdapJugador(EquipojugadoresActivity equipojugadoresActivity, ArrayList<Jugador> listaJugadores) {
        this.contexto = contexto;
        this.listaJugadores = listaJugadores;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
