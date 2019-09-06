package com.example.user.eva1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Eva1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eva1);

        Toast.makeText(this, "Bienvenido", Toast.LENGTH_LONG).show();

        //poner icono en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

    }

    //Metodo boton anterior
    public void Siguiente (View view){
        Intent siguiente = new Intent(this, Figuras.class);
        startActivity(siguiente);

    }
}
