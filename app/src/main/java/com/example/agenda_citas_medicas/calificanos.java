package com.example.agenda_citas_medicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class calificanos extends AppCompatActivity {
    RatingBar ratingBar;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificanos);
        ratingBar = (RatingBar) findViewById(R.id.raiting);
        boton = (Button) findViewById(R.id.raitingbutton);
        boton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String rating = String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_SHORT).show();
            }
        });
    }
}