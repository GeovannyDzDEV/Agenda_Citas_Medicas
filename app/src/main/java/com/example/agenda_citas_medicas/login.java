package com.example.agenda_citas_medicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void fnir(View view) {
        Intent lanzar1 = new Intent(this, progressbar.class);
        startActivity(lanzar1);
    }
}