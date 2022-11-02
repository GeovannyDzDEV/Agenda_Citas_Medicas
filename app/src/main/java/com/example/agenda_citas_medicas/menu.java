package com.example.agenda_citas_medicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void fnbutton3(View view) {
        Intent lanzar3 = new Intent(this, buscar_paciente.class);
        startActivity(lanzar3);
    }
    public void fnbutton4(View view) {
        Intent lanzar3 = new Intent(this, buscar_receta.class);
        startActivity(lanzar3);
    }
    public void fnbutton5(View view) {
        Intent lanzar = new Intent(this, citas_agendadas.class);
        startActivity(lanzar);
    }
    public void fnbutton6(View view) {
        Intent lanzar3 = new Intent(this, calendario.class);
        startActivity(lanzar3);
    }
}