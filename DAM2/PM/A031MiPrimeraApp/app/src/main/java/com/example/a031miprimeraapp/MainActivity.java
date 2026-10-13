package com.example.a031miprimeraapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    // Declaración de objetos
    private EditText et1, et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //conectamos con el diseño (asociar los objetos con los componentes) (disclaimer: hay gente que pone el mismo nombre al objeto, enrique prefiere saber diferenciarlos)
        et1 = findViewById(R.id.txtNum1); //R --> una clase (herramienta q usa android) para ir almacenando los componentes con su id de la parte grafica
        et2 = findViewById(R.id.txtNum2);
        tv1 = findViewById(R.id.txtResultado);
    }

    public void calcular(View view){

        //capturar los datos de la pantalla (y convertirlos a string)
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        //validar los campos
        if (validarCampos (valor1, valor2)){
            //convertimos el string a un entero usando el metodo parseInt
            int num1 = Integer.parseInt(valor1);
            int num2= Integer.parseInt(valor2);

            //sumar

            if (view.getId() == R.id.buttonSumar){
                tv1.setText(String.valueOf(num1 + num2));
            }

            //restar

            if(view.getId() == R.id.buttonRestar){
                tv1.setText(String.valueOf(num1 - num2));
            }
            //multiplicar
            if(view.getId() == R.id.buttonMultiplicar){
                tv1.setText(String.valueOf(num1 * num2));
            }
            //dividir
            if(view.getId() == R.id.buttonDividir) {
                if (num2 != 0) {
                    DecimalFormat df = new DecimalFormat("#0.00");
                    tv1.setText(df.format((double)num1 / num2));
                } else {
                    tv1.setText("Error");
                    Toast.makeText(this, "No se puede dividir entre 0", Toast.LENGTH_LONG).show();

                }
            }//if dividir
        }//if validarCampos
    }//metodo

    //metodo para limpiar
    public void limpiar(View view){
        et1.setText("");
        et2.setText("");
        tv1.setText("");
    }

    //metodo para validar que los campos esten vacios
    public boolean validarCampos(String valor1, String valor2) {
        boolean validacion = true;

        if(valor1.isEmpty() || valor2.isEmpty()){
            validacion = false;
            //recordemos que toast es un pequeño aviso emergente que muestra un mensaje rápido en la pantalla del usuario
            Toast.makeText(this, "Introduce dos operandos", Toast.LENGTH_LONG).show();
        }
        return validacion;
    }//validarCampos
}//class
