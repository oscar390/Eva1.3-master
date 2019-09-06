package com.example.user.eva1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    public TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tv3 =(TextView)findViewById(R.id.tv3);

        Intent intent=getIntent();

        tv3.setText(intent.getStringExtra("dato"));

        //String dato = getIntent().getStringExtra("dato");
        //tv3.setText("" + dato);

    }



    public void Regresar(View view){
        Intent i = new Intent(this, Figuras.class);
        startActivity(i);
    }
}
