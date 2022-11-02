package com.example.agenda_citas_medicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_paciente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_paciente);
    }

    public void fnbutton7(View view) {
        Intent lanzar1 = new Intent(this, form_agenda_cita.class);
        startActivity(lanzar1);
    }

    public void fnbutton8(View view) {
        Intent lanzar2 = new Intent(this, buscar_mi_receta.class);
        startActivity(lanzar2);
    }

    public void fnbuttonir(View view) {
        Intent lanzar = new Intent(this, calificanos.class);
        startActivity(lanzar);
    }
}