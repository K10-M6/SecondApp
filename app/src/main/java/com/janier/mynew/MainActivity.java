package com.janier.mynew;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AlertaOk(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Advertencia");
        builder.setMessage("Selecciona aceptar o cancelar.");
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Toast de corta duración", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("cancelar", new DialogInterface.OnClickListener() {
        @Override
            public void onClick(DialogInterface dialog, int which){
            Toast.makeText(MainActivity.this, "Usted presionó este botón.", Toast.LENGTH_LONG).show();

        }
        });
        builder.show();
    }
    public void crearAlertDialog(View view) {
        Toast.makeText(MainActivity.this, "Toast de corta duración", Toast.LENGTH_SHORT).show();
    }

    public void crearAlertDialog2(View view) {
        Toast.makeText(MainActivity.this, "Toast de larga duración", Toast.LENGTH_LONG).show();
    }
}