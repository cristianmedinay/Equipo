package com.example.liga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.liga.adaptador.AdapJugador;
import com.example.liga.util.DataSet;
import com.example.liga.util.Jugador;

import java.util.ArrayList;

public class EquipojugadoresActivity extends AppCompatActivity {
    AdapJugador adapJugador;
    ArrayList<Jugador> listaJugadores;
    //RecyclerView recyclerJugadores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipojugadores);
        instancias();


    }
    private void instancias() {
        listaJugadores = new ArrayList();
        listaJugadores = DataSet.newInstance().Barcelona();

        //RecyclerView.Adapter adapJugador = new AdapJugador(this, listaJugadores);
        //recyclerJugadores.setAdapter(adapJugador);
        //adapJugador.notifyDataSetChanged();
    }
}
