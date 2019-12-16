package com.example.liga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.liga.adaptador.AdapJugador;
import com.example.liga.adaptador.AdaptadorEquipo;
import com.example.liga.adaptador.AdaptadorPrincipal;
import com.example.liga.util.DataSet;
import com.example.liga.util.Equipo;
import com.example.liga.util.Liga;

import java.util.ArrayList;

public class PrincipalActivity extends AppCompatActivity implements AdaptadorPrincipal.OnMiRecyclerListener,
        AdaptadorEquipo.OnMiRecyclerListener, AdapterView.OnItemClickListener {
    //,.,,<,<,,
    ArrayList<Equipo> listaEquipos;
    RecyclerView recyclerView;
    RecyclerView recyclerLigas;
    AdaptadorPrincipal adaptadorligas;
    AdaptadorEquipo adaptadorEquipos;
    ArrayList<Liga> listaLigas;
    final static String TAG="Hola";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        rellenarRecyclerLigas();
        rellenarRecyclerEquipos();
    }

    private void rellenarRecyclerEquipos() {
        recyclerView.setAdapter(adaptadorEquipos);
        adaptadorEquipos.notifyDataSetChanged();
        recyclerView.setLayoutManager(new LinearLayoutManager
                (this, RecyclerView.VERTICAL, false));
    }

    private void rellenarRecyclerLigas() {
        recyclerLigas.setAdapter(adaptadorligas);
        adaptadorligas.notifyDataSetChanged();
        recyclerLigas.setLayoutManager(new LinearLayoutManager
                (this, RecyclerView.HORIZONTAL, false));
    }


    private void instancias() {
        recyclerView = findViewById(R.id.Equipos);
        recyclerLigas = findViewById(R.id.Ligas);
        listaLigas = DataSet.newInstance().listaLigasEuropa();

        listaEquipos = DataSet.newInstance().listaEquiposLiga();

        adaptadorEquipos = new AdaptadorEquipo(PrincipalActivity.this, listaEquipos);
        adaptadorligas = new AdaptadorPrincipal(PrincipalActivity.this, listaLigas);

   /*
        recyclerView = findViewById(R.id.recycler_view);
        listaPersonas = DataSet.newInstance().obtenerPersonasCatalonia();
//        adaptadorRecycler = new AdaptadorRecycler(getApplicationContext(),listaPersonas);
        adaptadorRecycler = new AdaptadorRecycler(RecyclerNormalActivity.this,listaPersonas);
       */
    }
    //recyclerView.setAdapter(adaptadorRecycler);


    /*
    adaptadorRecycler.notifyDataSetChanged();
    //recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
     */

    @Override
    public void onMiRecycler(Equipo equipo) {
        Intent i = new Intent(getApplicationContext(),EquipojugadoresActivity.class);
        i.putExtra(TAG,equipo);
        startActivity(i);
    }

    @Override
    public void onMiRecycler(Liga liga) {
        adaptadorEquipos = new AdaptadorEquipo(PrincipalActivity.this, liga.getLigasEquipos());
        RecyclerView recyclerEquipos;
        recyclerView.setAdapter(adaptadorEquipos);
        adaptadorEquipos.notifyDataSetChanged();
    }
    /*
      Intent i = new Intent(getApplicationContext(),EquipojugadoresActivity.class);
        i.putExtra(TAG,equipo);
        startActivity(i);
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
