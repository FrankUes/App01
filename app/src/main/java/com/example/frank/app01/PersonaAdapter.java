package com.example.frank.app01;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by frank on 8/2/17.
 */

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.ViewHolder> {

    Context context;
    List<Persona> personaList;

    public PersonaAdapter(Context context, List<Persona> personaList) {
        this.context = context;
        this.personaList = personaList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder viewHolder = new ViewHolder(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nombre.setText(personaList.get(position).nombre);
        holder.apellido.setText(personaList.get(position).getApellido());
    }

    @Override
    public int getItemCount() {
        return personaList.size();
    }

    //Clase ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nombre;
        TextView apellido;

        public ViewHolder (View item){
            super(item);

            nombre = (TextView) item.findViewById(R.id.nombre);
            apellido = (TextView) item.findViewById(R.id.apellido);
        }

    }
}
