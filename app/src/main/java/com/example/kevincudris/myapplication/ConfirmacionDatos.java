package com.example.kevincudris.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ConfirmacionDatos extends AppCompatActivity {

    Context context;
    Bundle bundle;
    String nombre,fecha,telefono,email,descripcion;
    TextView txtNombre,txtFecha,txtTelefono,txtEmail,txtDescripcion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_datos);
        context=this;
        bundle=getIntent().getExtras();
        nombre=bundle.getString("nombre");
        fecha=bundle.getString("fecha");
        telefono=bundle.getString("telefono");
        email=bundle.getString("email");
        descripcion=bundle.getString("descripcion");
        inicializarView();

        Log.e("activity2",""+ nombre+fecha+telefono+email+descripcion);

    }

    public void inicializarView(){
        txtNombre=(TextView)findViewById(R.id.nombre);
        txtFecha=(TextView)findViewById(R.id.fecha);
        txtTelefono=(TextView)findViewById(R.id.telefono);
        txtEmail=(TextView)findViewById(R.id.email);
        txtDescripcion=(TextView)findViewById(R.id.descripcion);

        txtNombre.setText("Nombre: "+nombre);
        txtFecha.setText("Fecha Nacimiento: "+fecha);
        txtTelefono.setText("Telefono: "+telefono);
        txtEmail.setText("Email: "+email);
        txtDescripcion.setText("Descripcion: "+descripcion);

    }

    public void editarDatos(View v){

       onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
