package com.erandy.sirein.iniguez.holamundoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSuma;
    private Button buttonResta;
    private Button buttonMultiplicacion;
    private Button buttonDivision;

     {
        setContentView(R.layout.activity_main);
        buttonSuma = findViewById(R.id.buttonSuma);
        buttonSuma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                abrirSuma();
            }
        });

    }
    private void abrirSuma(){
        Intent intent = new Intent(this , SumaActivity.class);
        startActivity( intent );
    }


    {
            setContentView(R.layout.activity_main);
            buttonResta = findViewById(R.id.buttonResta);
            buttonResta.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    abrirResta();
                }
            });
        }
    private void abrirResta() {
        Intent intent = new Intent(this , RestaActivity.class);
        startActivity(intent);
                }


    {
            setContentView(R.layout.activity_main);
            buttonMultiplicacion = findViewById(R.id.buttonMultiplicacion);
            buttonMultiplicacion.setOnClickListener(new View.OnClickListener() {

               @Override
               public void onClick(View v) {
                   abrirMultiplicacion();
                    }
                });
            }
    private void abrirMultiplicacion(){
        Intent intent = new Intent(this , MultiplicacionActivity.class);
        startActivity( intent );

    }

    {
        setContentView(R.layout.activity_main);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttonDivision.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                abrirDivision();
            }
        });

    }
    private void abrirDivision(){
        Intent intent = new Intent(this , DivisionActivity.class);
        startActivity( intent );

    }

    }