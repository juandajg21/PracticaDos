package com.jimenez.jdavid.puntodos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Punto2 extends AppCompatActivity {
    private EditText num1, num2;
    private TextView resul;
    private RadioButton suma, resta, multi, divi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto2);
        num1=(EditText)findViewById(R.id.Num1);
        num2=(EditText)findViewById(R.id.Num2);
        suma=(RadioButton)findViewById(R.id.Suma);
        resta=(RadioButton)findViewById(R.id.Resta);
        multi=(RadioButton)findViewById(R.id.Multi);
        divi=(RadioButton)findViewById(R.id.Divi);
        resul=(TextView)findViewById(R.id.resul);

    }

    public void calcularOp(View view){

        String numero1=num1.getText().toString();
        String numero2=num2.getText().toString();
        Double nume1=Double.parseDouble(numero1);
        Double nume2=Double.parseDouble(numero2);
        if (suma.isChecked()==true){
            Double operar=nume1+nume2;
            String respuesta=String.valueOf(operar);
            resul.setText(respuesta);
        }
        if (resta.isChecked()==true){
            Double operar=nume1-nume2;
            String respuesta=String.valueOf(operar);
            resul.setText(respuesta);
        }
        if (multi.isChecked()==true){
            Double operar=nume1*nume2;
            String respuesta=String.valueOf(operar);
            resul.setText(respuesta);
        }
        if (divi.isChecked()==true){
            Double operar=nume1/nume2;
            String respuesta=String.valueOf(operar);
            resul.setText(respuesta);
        }

    }


}
