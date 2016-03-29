package com.jimenez.jdavid.puntocuatro;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;

import android.widget.RadioButton;
import android.widget.Spinner;

import android.widget.Toast;



public class Punto4 extends AppCompatActivity {

    private EditText txtLoggin, txtPass1, txtPass2, txtEmail, txtNacimiento, txtDatos;
    private RadioButton btnFemenino, btnMasculino;
    private CheckBox cbComp, cbMusi, cbDepo, cbLect;
    private DatePicker picker1;
    private Spinner spinner1;
    private String loggin, pass1, pass2, email, nacimiento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto4);

        txtDatos =(EditText)findViewById(R.id.txtDatos);
        txtLoggin = (EditText) findViewById(R.id.txtLoggin);
        txtPass1 = (EditText) findViewById(R.id.txtPass1);
        txtPass2 = (EditText) findViewById(R.id.txtPass2);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtNacimiento = (EditText) findViewById(R.id.txtNacimiento);
        btnFemenino = (RadioButton) findViewById(R.id.btnFemenino);
        btnMasculino = (RadioButton) findViewById(R.id.btnMasculino);
        cbComp =(CheckBox)findViewById(R.id.cbComp);
        cbDepo =(CheckBox)findViewById(R.id.cbDepo);
        cbMusi =(CheckBox)findViewById(R.id.cbMusi);
        cbLect =(CheckBox)findViewById(R.id.cbLect);
        picker1 = (DatePicker) findViewById(R.id.picker1);
        spinner1 = (Spinner)findViewById(R.id.spinner1);

    }

    public void naciClick(View view){
        picker1.setVisibility(View.VISIBLE);
    }

    public void opPicker(View view){
        txtNacimiento.setText(picker1.getDayOfMonth()+"/"+picker1.getMonth()+"/"+picker1.getYear());
        picker1.setVisibility(View.GONE);
    }

    public void btnAceptar(View view) {
        loggin = txtLoggin.getText().toString();
        pass1 = txtPass1.getText().toString();
        pass2 = txtPass2.getText().toString();
        email = txtEmail.getText().toString();
        nacimiento = txtNacimiento.getText().toString();

        if (loggin.matches("")) {
            Toast.makeText(this, "No ha ingresado el loggin", Toast.LENGTH_SHORT).show();
            return;
        }

        else {
            txtDatos.setText("Loggin: "+loggin);
        }

        if (pass1.matches("")) {
            Toast.makeText(this, "No ha ingresado la contraseña", Toast.LENGTH_SHORT).show();
            return;
        }
        else{

            if (pass1.equals(pass2)){
                txtDatos.setText(txtDatos.getText()+"\n"+"Contraseña: "+pass1);
            }
                else{
                    Toast.makeText(this, "las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                    return;
                    }
        }

        if (email.matches("")) {
            Toast.makeText(this, "No ha ingresado el correo electrónico", Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            txtDatos.setText(txtDatos.getText()+"\n"+"e-mail: "+email);
        }

        if (btnFemenino.isChecked()==false){
            if (btnMasculino.isChecked()==false){
                Toast.makeText(this, "Por favor seleccione un sexo", Toast.LENGTH_SHORT).show();
                return;
            }
            else{
                txtDatos.setText(txtDatos.getText()+"\n"+"Sexo: Masculino\nHobbi(es): ");
            }
        }
        else{
            txtDatos.setText(txtDatos.getText()+"\n"+"Sexo: Femenino\nHobbi(es): ");
        }

        if (cbMusi.isChecked()==false){
            if (cbDepo.isChecked()==false){
                if (cbComp.isChecked()==false){
                    if (cbLect.isChecked()==false){
                        Toast.makeText(this, "Por favor seleccione por lo menos un hobbie", Toast.LENGTH_SHORT).show();
                        return;
                    }

                }
            }
        }

        if (cbMusi.isChecked()==true){
            txtDatos.setText(txtDatos.getText()+"Música. ");
        }
            if (cbDepo.isChecked()==true){
                txtDatos.setText(txtDatos.getText()+"Deportes. ");
            }
                if (cbComp.isChecked()==true){
                    txtDatos.setText(txtDatos.getText()+"Compras. ");
                }
                    if (cbLect.isChecked()==true){
                        txtDatos.setText(txtDatos.getText()+"Lectura. ");
                    }


        if (nacimiento.matches("")) {
            Toast.makeText(this, "No ha registrado la fecha de nacimiento", Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            txtDatos.setText(txtDatos.getText()+"\n"+"Fecha de Nacimiento: "+nacimiento);
            txtDatos.setText(txtDatos.getText()+"\n"+"Lugar de Nacimiento: "+spinner1.getSelectedItem().toString());
        }

        txtDatos.setVisibility(View.VISIBLE);
    }

}
