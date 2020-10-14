package com.ktimon.tareasemana21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    private TextView textViewNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        textViewNombre = (TextView)findViewById(R.id.textViewNombre);

        String dato = getIntent().getStringExtra("dato");
        textViewNombre.setText("oi "  + dato);
    }


    //Metodo para el botón Editar
    public void Editar(View view){
        Intent editar = new Intent(this, MainActivity.class);
        startActivity(editar);
    }

}