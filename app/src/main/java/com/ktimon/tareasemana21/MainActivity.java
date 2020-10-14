package com.ktimon.tareasemana21;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText etn,etf,ett,ete,etd;
    private Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn = (EditText)findViewById(R.id.editTextNombre);
        etf = (EditText)findViewById(R.id.textViewFecha);
        ett = (EditText)findViewById(R.id.textViewFecha);
        ete = (EditText)findViewById(R.id.editTextEmail);
        etd = (EditText)findViewById(R.id.editTextDescripcion);
    }

    //Método para el botón
    public void Siguiente(View view){
        Intent i = new Intent(this, ConfirmarDatos.class);
        i.putExtra("dato", etn.getText().toString());
        i.putExtra("dato", etf.getText().toString());
        i.putExtra("dato",ett.getText().toString());
        i.putExtra("dato",ete.getText().toString());
        i.putExtra("dato",etd.getText());
        startActivity(i);

        String nombre     = etn.getText().toString();
        String fecha      = etf.getText().toString();
        String telefono   = ett.getText().toString();
        String email       = ete.getText().toString();
        String descripcion = etd.getText().toString();

        if.(nombre.length() == 0 ){
            Toast.makeText(this, text."Debes ingresar un nombre", Toast.LENGTH_LONG). show();
        }
        if(fecha.length() == 0 ){
            Toast.makeText(this, text "Debes ingresar una fecha", Toast.LENGTH_LONG).show();
        }
        if(telefono.length() == 0 ){
            Toast.makeText(this, text "Debes ingresar un numero telefono", Toast.LENGTH_LONG).show();
        }
        if(email.length() == 0 ){
            Toast.makeText(this, text "Debes ingresar un e-mail", Toast.LENGTH_LONG).show();
        }
        if(descripcion.length() == 0 ){
            Toast.makeText(this, text "Descripcion", Toast.LENGTH_LONG).show();
        }



    }
}