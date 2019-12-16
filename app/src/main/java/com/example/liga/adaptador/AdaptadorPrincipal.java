package com.example.liga.adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.liga.PrincipalActivity;
import com.example.liga.R;
import com.example.liga.util.Liga;

import java.util.ArrayList;

public class AdaptadorPrincipal extends RecyclerView.Adapter<AdaptadorPrincipal.HolderAdapterPrincipal> {


        ArrayList<Liga> listaLigas;
        OnMiRecyclerListener listener;
        Context ctx;
        /*



         */
        public AdaptadorPrincipal(PrincipalActivity ligas, ArrayList<Liga> listaLigas) {
        this.ctx = ligas;
        this.listaLigas = listaLigas;
        listener = (OnMiRecyclerListener) ctx;
        }



    @NonNull
    @Override
    public HolderAdapterPrincipal onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.recycler_ligas,
                parent,false);
        HolderAdapterPrincipal miHolder = new HolderAdapterPrincipal(view);
        return miHolder;
    }
    public interface OnMiRecyclerListener{
         void onMiRecycler(Liga liga);
    }

    @Override
        public void onBindViewHolder(@NonNull HolderAdapterPrincipal holder, int position) {

        final Liga actual = listaLigas.get(position);
        holder.getNombreLiga().setText(actual.getNombreLiga());
        holder.getImagenLiga().setImageResource(actual.getLogoLiga()    );
        holder.getNombreLiga().setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            listener.onMiRecycler(actual);
        }
        });
        holder.getImagenLiga().setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
        listener.onMiRecycler(actual);
        }
        });

        }

        @Override
          public int getItemCount() {
          return listaLigas.size();
        }

        class HolderAdapterPrincipal extends RecyclerView.ViewHolder {
             private ImageView imagenLiga;
             private TextView nombreLiga;
             public HolderAdapterPrincipal(@NonNull View itemView) {
        super(itemView);

                 nombreLiga = itemView.findViewById(R.id.nameliga);
                 imagenLiga = itemView.findViewById(R.id.imgliga);


    }

    public ImageView getImagenLiga(){return imagenLiga;}

    public TextView getNombreLiga(){return nombreLiga;}

    }

}
