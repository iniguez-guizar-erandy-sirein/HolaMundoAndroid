package com.erandy.sirein.iniguez.holamundoandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MultiplicacionActivity extends AppCompatActivity {

    private EditText editTextX;
    private EditText editTextY;
    private EditText editTextTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        editTextX = findViewById(R.id.editTextNumberX );
        editTextY = findViewById(R.id.editTextNumberY );
        editTextTotal = findViewById(R.id.editTextNumberTotal );
        editTextX.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if( !hasFocus )
                {
                    realizaOperacion( );
                }
            }
        });
        editTextY.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if( !hasFocus )
                {
                    realizaOperacion( );
                }
            }
        });

    }

    private void realizaOperacion() {
        int total = 0;
        if (editTextX.getText().toString() != null || editTextY.getText().toString() != null)
            if (isEntero(editTextX.getText().toString())||isEntero(editTextY.getText().toString()))
                total = (getEntero(editTextX.getText().toString()))*(getEntero(editTextY.getText().toString()));
            else{}else{}
        editTextTotal.setText( String.format("%d" , total ) , TextView.BufferType.SPANNABLE );
        editTextTotal.setEnabled( false );
    }

    private int getEntero(String entero)
    {
        try
        {
            return Integer.parseInt( entero );
        }
        catch( NumberFormatException ex)
        {
            ex.printStackTrace();
        }
        return 0;
    }

    private boolean isEntero(String entero)
    {
        try
        {
            if( entero == null || entero.length() == 0)
            {
                return false;
            }
            Integer.parseInt( entero );
            return true;
        }
        catch( NumberFormatException ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
}