package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class AdapterLivros extends RecyclerView.Adapter<AdapterLivros.ViewHolder> {

    public AdapterLivros(Context context, List<Livro> lstLivros) {
        this.context = context;
        this.lstLivros = lstLivros;
    }

    private Context context;
    private List<Livro> lstLivros;


    @NonNull
    @Override



    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_livros, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.modeloTiutloLivros.setText(lstLivros.get(position).getTitulo());
        holder.modeloImglivros.setImageResource(lstLivros.get(position).getImgLivro());
    }

    @Override
    public int getItemCount() {
        return lstLivros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CardView modeloCardLivros;
        ImageView modeloImglivros;
        TextView modeloTiutloLivros;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            modeloTiutloLivros = itemView.findViewById(R.id.modeloTiutloLivros);
            modeloImglivros = itemView.findViewById(R.id.modeloImglivros);
            modeloCardLivros = itemView.findViewById(R.id.modeloCardLivros);
        }
    }
}
