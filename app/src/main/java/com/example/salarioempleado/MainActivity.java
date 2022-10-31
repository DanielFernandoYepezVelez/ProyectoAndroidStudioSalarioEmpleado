/*
* Crear un algoritmo que le pida al usuario los datos de un trabajador así: El número de horas
* trabajadas en el mes, el valor básico hora, la cantidad de años que tiene de laborar en la
* empresa y el valor que le deducen mensualmente. El algoritmo le debe mostrar: El salario bruto
* mensual, el valor de la bonificación ($30.000 por cada año laborado) mensual, el valor de las
* deducciones mensuales y el salario neto mensual.
* */
package com.example.salarioempleado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
}