package com.example.kevincudris.myapplication;

import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
//import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    Context context;
    EditText nombre,telefono,email,descripcion,fecha;
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        nombre=(EditText) findViewById(R.id.nombre);
        telefono=(EditText) findViewById(R.id.telefono);
        email=(EditText) findViewById(R.id.email);
        descripcion=(EditText) findViewById(R.id.descripcion);
        fecha=(EditText) findViewById(R.id.fecha);
        siguiente=(Button) findViewById(R.id.button);
        editText();
        button();
    }

    public void button(){

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i =new Intent(context,ConfirmacionDatos.class);
                i.putExtra("nombre",nombre.getText().toString());
                i.putExtra("telefono",telefono.getText().toString());
                i.putExtra("email",email.getText().toString());
                i.putExtra("descripcion",descripcion.getText().toString());
                i.putExtra("fecha",fecha.getText().toString());
                startActivity(i);
            }
        });


    }

    public void editText(){
        fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog(v);
            }
        });

    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment(v);
        newFragment.show(getFragmentManager(), "datePicker");

    }


}
