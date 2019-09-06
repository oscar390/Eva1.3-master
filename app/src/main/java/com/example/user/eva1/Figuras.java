package com.example.user.eva1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Figuras extends AppCompatActivity {

    public double cuadrado1;
    public EditText valor_cuadrado1;
    public TextView Resultado_cuadrado;

    public double rectangulo1, rectangulo2;
    public EditText valor_rectangulo1, valor_rectangulo2;
    public TextView Resultado_rectangulo;

    public double equilatero1, altura;
    public EditText valor_equilatero1;
    public TextView Resultado_equilatero;

    public double isoceles1, isoceles2;
    public EditText valor_isoceles1, valor_isoceles2;
    public TextView Resultado_isoceles;

    public double escaleno1, escaleno2, escaleno3,sub;
    public EditText valor_escaleno1, valor_escaleno2, valor_escaleno3;
    public TextView Resultado_escaleno;

    public double circulo1;
    public EditText valor_circulo1;
    public TextView Resultado_circulo;

    public double rombo1, rombo2;
    public EditText valor_rombo1, valor_rombo2, valor_rombo3, valor_rombo4;
    public TextView Resultado_rombo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figuras);

        Toast.makeText(this, "Area de Figuras", Toast.LENGTH_LONG).show();

        valor_cuadrado1 = (EditText) findViewById(R.id.valorcuadrado1);
        Resultado_cuadrado = (TextView) findViewById(R.id.textView1);

        valor_rectangulo1 = (EditText) findViewById(R.id.valorrectangulo1);
        valor_rectangulo2 = (EditText) findViewById(R.id.valorrectangulo2);
        Resultado_rectangulo = (TextView) findViewById(R.id.textView58);


        valor_equilatero1 = (EditText) findViewById(R.id.valorequilatero1);

        Resultado_equilatero = (TextView) findViewById(R.id.textView23);


        valor_isoceles1 = (EditText) findViewById(R.id.valorisoceles1);
        valor_isoceles2 = (EditText) findViewById(R.id.valorisoceles2);
        Resultado_isoceles = (TextView) findViewById(R.id.textView25);


        valor_escaleno1 = (EditText) findViewById(R.id.valorescaleno1);
        valor_escaleno2 = (EditText) findViewById(R.id.valorescaleno2);
        valor_escaleno3 = (EditText) findViewById(R.id.valorescaleno3);

        Resultado_escaleno = (TextView) findViewById(R.id.textView27);


        valor_circulo1 = (EditText) findViewById(R.id.editText16);
        Resultado_circulo = (TextView) findViewById(R.id.editText3);

        valor_rombo1 = (EditText) findViewById(R.id.valorrombo1);
        valor_rombo2 = (EditText) findViewById(R.id.valorrombo2);
        Resultado_rombo = (TextView) findViewById(R.id.editText77);
    }


    public void Calcular_area(View view){
        cuadrado1 = Double.parseDouble(valor_cuadrado1.getText().toString());


        if (cuadrado1 == 0 ) {
            Toast.makeText(Figuras.this, "Debes ingresar un valor", Toast.LENGTH_SHORT).show();
            Resultado_cuadrado.setText("ERROR");}
        else {

            Resultado_cuadrado.setText(Double.toString(cuadrado1 * cuadrado1));
            Intent i= new Intent (this, Resultado.class);
            i.putExtra("dato", Resultado_cuadrado.getText().toString());
            startActivity(i);
        }}
    public void Calcular_perimetro(View view) {
        cuadrado1 = Double.parseDouble(valor_cuadrado1.getText().toString());


        if (cuadrado1 == 0 ) {

            Toast.makeText(Figuras.this, "Debes ingresar un valor", Toast.LENGTH_SHORT).show();
            Resultado_cuadrado.setText("ERROR");}
        else {

            Resultado_cuadrado.setText(Double.toString(cuadrado1 + cuadrado1 + cuadrado1 + cuadrado1));
            Intent i= new Intent (this, Resultado.class);
            i.putExtra("dato", Resultado_cuadrado.getText().toString());
            startActivity(i);
        }}


    public void Calcular_diagonal(View view){

        cuadrado1 = Double.parseDouble(valor_cuadrado1.getText().toString());


        if (cuadrado1==0) {
            Toast.makeText(Figuras.this, "Debes ingresar un valor", Toast.LENGTH_SHORT).show();
            Resultado_cuadrado.setText("ERROR");
        } else {

            Resultado_cuadrado.setText(Double.toString(cuadrado1*Math.sqrt(2)));

            //math.pow para eleva una potencia//
            Intent i= new Intent (this, Resultado.class);
            i.putExtra("dato", Resultado_cuadrado.getText().toString());
            startActivity(i);
        }
    }

    public void Calcular_area_rectangulo(View view) {
        rectangulo1 = Double.parseDouble(valor_rectangulo1.getText().toString());
        rectangulo2 = Double.parseDouble(valor_rectangulo2.getText().toString());

        if (rectangulo1 == rectangulo2 ) {

            Toast.makeText(Figuras.this, "Error en los valores", Toast.LENGTH_SHORT).show();
            Resultado_rectangulo.setText("ERROR");
        } else {

            Resultado_rectangulo.setText(Double.toString(rectangulo1 * rectangulo2));
            Intent i= new Intent (this, Resultado.class);
            i.putExtra("dato", Resultado_rectangulo.getText().toString());
            startActivity(i);
        }
    }

    public void Calcular_perimetro_rectangulo(View view) {

        rectangulo1 = Double.parseDouble(valor_rectangulo1.getText().toString());
        rectangulo2 = Double.parseDouble(valor_rectangulo2.getText().toString());
        if (rectangulo1 == rectangulo2 ) {

            Toast.makeText(Figuras.this, "Error en los valores", Toast.LENGTH_SHORT).show();
            Resultado_rectangulo.setText("ERROR");
        } else {

            Resultado_rectangulo.setText(Double.toString(rectangulo1 + rectangulo2 + rectangulo1 + rectangulo2));
            Intent i= new Intent (this, Resultado.class);
            i.putExtra("dato", Resultado_rectangulo.getText().toString());
            startActivity(i);
        }}

    public void Calcular_diagonal_rectangulo(View view) {

        rectangulo1 = Double.parseDouble(valor_rectangulo1.getText().toString());
        rectangulo2 = Double.parseDouble(valor_rectangulo2.getText().toString());
        if (rectangulo1 == rectangulo2 ) {

            Toast.makeText(Figuras.this, "Error en los valores", Toast.LENGTH_SHORT).show();
            Resultado_rectangulo.setText("ERROR");
        } else {

            Resultado_rectangulo.setText(Double.toString(Math.pow(rectangulo1, 2) + Math.pow(rectangulo2, 2)));
            Intent i= new Intent (this, Resultado.class);
            i.putExtra("dato", Resultado_rectangulo.getText().toString());
            startActivity(i);
        }}


    //triangulo equilatero


    public void Calcular_area_equilatero(View view) {
        equilatero1 = Double.parseDouble(valor_equilatero1.getText().toString());
        altura=equilatero1*equilatero1-(equilatero1/2)*2;
        altura=(Math.sqrt(altura));

        Resultado_equilatero.setText(Double.toString((altura*equilatero1)/2));
        Intent i= new Intent (this, Resultado.class);
        i.putExtra("dato", Resultado_equilatero.getText().toString());
        startActivity(i);
    }


    public void Calcular_perimetro_equilatero(View view) {

        equilatero1 = Double.parseDouble(valor_equilatero1.getText().toString());

        Resultado_equilatero.setText(Double.toString(equilatero1*3 ));
        Intent i= new Intent (this, Resultado.class);
        i.putExtra("dato", Resultado_equilatero.getText().toString());
        startActivity(i);
    }

    public void Calcular_perimetro_semiequilatero(View view) {
        equilatero1 = Double.parseDouble(valor_equilatero1.getText().toString());

        Resultado_equilatero.setText(Double.toString(((equilatero1*3) / 2)));
        Intent i= new Intent (this, Resultado.class);
        i.putExtra("dato", Resultado_equilatero.getText().toString());
        startActivity(i);
    }


     //isoceles


    public void Calcular_area_isoceles(View view) {

        isoceles1 = Double.parseDouble(valor_isoceles1.getText().toString());
        isoceles2 = Double.parseDouble(valor_isoceles2.getText().toString());
        altura=(Math.sqrt(Math.pow(isoceles1, 2)-Math.pow(isoceles2/2, 2)));

        Resultado_isoceles.setText(Double.toString(isoceles2*altura/2));
        Intent i= new Intent (this, Resultado.class);
        i.putExtra("dato", Resultado_isoceles.getText().toString());
        startActivity(i);
    }

    public void Calcular_perimetro_isoceles(View view) {

        isoceles1 = Double.parseDouble(valor_isoceles1.getText().toString());
        isoceles2 = Double.parseDouble(valor_isoceles2.getText().toString());

        Resultado_isoceles.setText(Double.toString( 2*isoceles1+isoceles2));
        Intent i= new Intent (this, Resultado.class);
        i.putExtra("dato", Resultado_isoceles.getText().toString());
        startActivity(i);

    }


    public void Calcular_semiperimetro_isoceles(View view) {

        isoceles1 = Double.parseDouble(valor_isoceles1.getText().toString());
        isoceles2 = Double.parseDouble(valor_isoceles2.getText().toString());

        Resultado_isoceles.setText(Double.toString( (2*isoceles1+isoceles2)/2));
        Intent i= new Intent (this, Resultado.class);
        i.putExtra("dato", Resultado_isoceles.getText().toString());
        startActivity(i);



    }


    //ESCALENO

    public void Calcular_area_escaleno(View view) {

        escaleno1 = Double.parseDouble(valor_escaleno1.getText().toString());
        escaleno2 = Double.parseDouble(valor_escaleno2.getText().toString());
        escaleno3 = Double.parseDouble(valor_escaleno3.getText().toString());
        sub=(escaleno1 + escaleno2 + escaleno3 / 2);
        //Resultado_escaleno.setText(Double.toString((Math.pow( (sub-escaleno1)*(sub-escaleno2)(sub-escaleno3)))));
        Intent i= new Intent (this, Resultado.class);
        i.putExtra("dato", Resultado_escaleno.getText().toString());
        startActivity(i);

    }



    public void Calcular_perimetro_escaleno(View view) {

        escaleno1 = Double.parseDouble(valor_escaleno1.getText().toString());
        escaleno2 = Double.parseDouble(valor_escaleno2.getText().toString());
        escaleno3 = Double.parseDouble(valor_escaleno3.getText().toString());
        Resultado_escaleno.setText(Double.toString(escaleno1 + escaleno2 + escaleno3));
        Intent i= new Intent (this, Resultado.class);
        i.putExtra("dato", Resultado_escaleno.getText().toString());
        startActivity(i);
    }

    public void Calcular_semiperimetro_escaleno(View view) {

        escaleno1 = Double.parseDouble(valor_escaleno1.getText().toString());
        escaleno2 = Double.parseDouble(valor_escaleno2.getText().toString());
        escaleno3 = Double.parseDouble(valor_escaleno3.getText().toString());
        Resultado_escaleno.setText(Double.toString(escaleno1 + escaleno2 + escaleno3 / 2));
        Intent i= new Intent (this, Resultado.class);
        i.putExtra("dato", Resultado_escaleno.getText().toString());
        startActivity(i);
    }

    //CIRCULO

    public void Calcular_area_circulo(View view) {

        circulo1 = Double.parseDouble(valor_circulo1.getText().toString());
        Resultado_circulo.setText(Double.toString(Math.PI * Math.pow(circulo1,2)));
        Intent i= new Intent (this, Resultado.class);
        i.putExtra("dato", Resultado_circulo.getText().toString());
        startActivity(i);
    }

    public void Calcular_perimetro_circulo(View view) {

        circulo1 = Double.parseDouble(valor_circulo1.getText().toString());
        Resultado_circulo.setText(Double.toString(2*Math.PI*circulo1));
        Intent i= new Intent (this, Resultado.class);
        i.putExtra("dato", Resultado_circulo.getText().toString());
        startActivity(i);
    }

    public void Calcular_diametro_circulo(View view) {

        circulo1 = Double.parseDouble(valor_circulo1.getText().toString());
        Resultado_circulo.setText(Double.toString(2*circulo1));
        Intent i= new Intent (this, Resultado.class);
        i.putExtra("dato", Resultado_circulo.getText().toString());
        startActivity(i);
    }



      //ROMBO



    public void Calcular_area_rombo(View view) {

        rombo1 = Double.parseDouble(valor_rombo1.getText().toString());
        rombo2 = Double.parseDouble(valor_rombo2.getText().toString());
        Resultado_rombo.setText(Double.toString((rombo1 * rombo2)/2));
        Intent i = new Intent(this, Resultado.class);
        i.putExtra("dato", Resultado_rombo.getText().toString());
        startActivity(i);

    }

    public void Calcular_perimetro_rombo(View view) {

        rombo1 = Double.parseDouble(valor_rombo1.getText().toString());

        Resultado_rombo.setText(Double.toString(rombo1 *4));
        Intent i= new Intent (this, Resultado.class);
        i.putExtra("dato", Resultado_rombo.getText().toString());
        startActivity(i);

    }






    //Metodo boton anterior
    public void Anterior(View view) {
        Intent anterior = new Intent(this, Eva1.class);
        startActivity(anterior);

    }
}
