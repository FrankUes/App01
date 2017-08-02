package com.example.frank.app01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Persona> personaList = new ArrayList<>();
    PersonaAdapter personaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        cargarDatos();
        personaAdapter = new PersonaAdapter(this,personaList);
        recyclerView.setAdapter(personaAdapter);

    }

    public void cargarDatos(){
        personaList.add(new Persona("Armando","Maradona"));
        personaList.add(new Persona("Edson","Pele"));
        personaList.add(new Persona("Jorge","Gonzales"));
        personaList.add(new Persona("Catalnica","Martinez"));
        personaList.add(new Persona("Van","Nistelroy"));
        personaList.add(new Persona("Andres","Iniesta"));
        personaList.add(new Persona("Neymar","Junior"));
        personaList.add(new Persona("Lionel","Messi"));
        personaList.add(new Persona("Luis","Suarez"));
        personaList.add(new Persona("Marcel","Desailly"));
        personaList.add(new Persona("Florence","Mallouda"));
        personaList.add(new Persona("Samuel","Eto"));
        personaList.add(new Persona("Gio","Van Bronckhorst"));
        personaList.add(new Persona("Victor","Valdez"));
    }
}
