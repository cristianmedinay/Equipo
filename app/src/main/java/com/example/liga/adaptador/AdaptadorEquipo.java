package com.example.liga.adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.liga.PrincipalActivity;
import com.example.liga.R;
import com.example.liga.util.Equipo;

import java.util.ArrayList;

public class AdaptadorEquipo extends RecyclerView.Adapter<AdaptadorEquipo.HolderAdapterEquipo> {

    AdaptadorEquipo.OnMiRecyclerListener listener;

    //ArrayList<Liga> Liga;
    Context ctx;
    ArrayList<Equipo> listaEquipos;

    public AdaptadorEquipo(PrincipalActivity equipo, ArrayList<Equipo> listaEquipo) {
        this.ctx = equipo;
        this.listaEquipos = listaEquipo;
        listener = (AdaptadorEquipo.OnMiRecyclerListener) ctx;
    }

    @NonNull
    @Override
    public AdaptadorEquipo.HolderAdapterEquipo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.recycler_equipos,
                parent,false);
        AdaptadorEquipo.HolderAdapterEquipo miHolder = new AdaptadorEquipo.HolderAdapterEquipo(view);
        return miHolder;
    }

    public interface OnMiRecyclerListener {
        public void onMiRecycler(Equipo equipo);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorEquipo.HolderAdapterEquipo holder, int position) {
        final Equipo actual = listaEquipos.get(position);

        holder.getImgEquipo().setImageResource(actual.getImg());
        holder.getNameEquipo().setText(actual.getEquipo());
        holder.getNameEstadio().setText(actual.getEstadio());
        holder.getNameEquipo().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onMiRecycler(actual);
            }
        });
    }


    @Override
    public int getItemCount() { return listaEquipos.size(); }

    class HolderAdapterEquipo extends RecyclerView.ViewHolder {
        private ImageView imgEquipo;
        private TextView Equipo,Estadio;

        public HolderAdapterEquipo(@NonNull View itemView) {
            super(itemView);
            ////añadir ala lista los nombres
            Equipo = itemView.findViewById(R.id.nameEquipo);
            Estadio = itemView.findViewById(R.id.nameEstadio);
            imgEquipo = itemView.findViewById(R.id.imgEquipo);
        }

        public ImageView getImgEquipo() {
            return imgEquipo;
        }

        public TextView getNameEquipo() {
            return Equipo;
        }

        public TextView getNameEstadio() {
            return Estadio;
        }

    }

}
