package com.jimenez.jdavid.puntotres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class Punto3 extends AppCompatActivity {

    private EditText num1, num2;
    private TextView text1, text2, respuesta;
    private RadioButton cuadro, triangulo, rectangulo, circulo;
    private LinearLayout layout1;
    private LinearLayout layout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto3);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        cuadro=(RadioButton)findViewById(R.id.cuadro);
        triangulo=(RadioButton)findViewById(R.id.triangulo);
        rectangulo=(RadioButton)findViewById(R.id.rectangulo);
        circulo=(RadioButton)findViewById(R.id.circulo);
        respuesta=(TextView)findViewById(R.id.respuesta);
        text1=(TextView)findViewById(R.id.text1);
        text2=(TextView)findViewById(R.id.text2);
        layout1=(LinearLayout)findViewById(R.id.layout1);
        layout2=(LinearLayout)findViewById(R.id.layout2);

    }

    public void opCuadro(View view){

        layout1.setVisibility(View.VISIBLE);
        layout2.setVisibility(View.GONE);
        text1.setText("Valor del lado:");

    }

    public void opTriangulo(View view){

        layout1.setVisibility(View.VISIBLE);
        layout2.setVisibility(View.VISIBLE);
        text1.setText("Valor de la base:");
        text2.setText("Valor de la altura:");

    }

    public void opRectangulo(View view){

        layout1.setVisibility(View.VISIBLE);
        layout2.setVisibility(View.VISIBLE);
        text1.setText("Valor del lado 1:");
        text2.setText("Valor del lado 2:");

    }

    public void opCirculo(View view){

        layout1.setVisibility(View.VISIBLE);
        layout2.setVisibility(View.GONE);
        text1.setText("Valor del radio:");

    }

    public void calcularOp(View view){

        String numero1=num1.getText().toString();

        Double nume1=Double.parseDouble(numero1);


        if (cuadro.isChecked()==true){

            Double operar=nume1*nume1;
            String res=String.valueOf(operar);
            respuesta.setVisibility(View.VISIBLE);
            respuesta.setText(res);
        }
        if (triangulo.isChecked()==true){
            String numero2=num2.getText().toString();
            Double nume2=Double.parseDouble(numero2);
            Double operar=nume1*nume2/2;
            String res=String.valueOf(operar);
            respuesta.setVisibility(View.VISIBLE);
            respuesta.setText(res);
        }
        if (rectangulo.isChecked()==true){
            String numero2=num2.getText().toString();
            Double nume2=Double.parseDouble(numero2);
            Double operar=nume1*nume2;
            String res=String.valueOf(operar);
            respuesta.setVisibility(View.VISIBLE);
            respuesta.setText(res);
        }
        if (circulo.isChecked()==true){

            Double operar=3.1416*nume1*nume1;
            String res=String.valueOf(operar);
            respuesta.setVisibility(View.VISIBLE);
            respuesta.setText(res);
        }

    }

}
