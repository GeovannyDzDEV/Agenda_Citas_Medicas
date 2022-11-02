package com.example.agenda_citas_medicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fnbutton1(View view) {
        Intent lanzar1 = new Intent(this, login.class);
        startActivity(lanzar1);


    }

    public void fnbutton2(View view) {
        Intent lanzar2 = new Intent(this, menu_paciente.class);
        startActivity(lanzar2);


    }
}