package com.erandy.sirein.iniguez.holamundoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PromedioActivity extends AppCompatActivity {

    private EditText editTextX,editTextY,editTextZ;
    private EditText editTextTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio);
        editTextX = findViewById(R.id.editTextNumberX );


        editTextTotal = findViewById(R.id.editTextNumberTotal);
        editTextX.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if( !hasFocus )
                {
                    realizaOperacion();
                }
            }
        });
        editTextY = findViewById(R.id.editTextNumberY );
        editTextY.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if( !hasFocus )
                {
                    realizaOperacion();
                }
            }
        });
        editTextZ = findViewById(R.id.editTextNumberZ );
        editTextZ.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if( !hasFocus )
                {
                    realizaOperacion();
                }
            }
        });

    }

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    private void realizaOperacion() {
        float total=0;
        String resultado="";
        if(editTextX.getText().toString() != null){
            float num1 = convertirFloat(editTextX.getText().toString());
            total+=num1;
        }else{}
        if(editTextY.getText().toString() != null){
            float num2 = convertirFloat(editTextY.getText().toString());
            total+=num2;
        }else{}
        if(editTextZ.getText().toString() != null){
            float num3 = convertirFloat(editTextZ.getText().toString());
            total+=num3;
            float promedio = (float) (total/3);
            resultado = Float.toString(promedio);
        }else{}
        editTextTotal.setText(resultado, TextView.BufferType.SPANNABLE );
        editTextTotal.setEnabled(false);
    }

    private float convertirFloat(String num){
        try
        {
            return Float.parseFloat(num);
        }
        catch( NumberFormatException ex)
        {
            ex.printStackTrace();
        }
        return 1;
    }
}