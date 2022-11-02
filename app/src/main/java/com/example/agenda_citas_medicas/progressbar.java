package com.example.agenda_citas_medicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class progressbar extends AppCompatActivity implements View.OnClickListener {
    Button b;
    ProgressBar p;
    TextView t;
    Handler h = new Handler();
    boolean isActivo=false;
    int i= 0;
    Intent x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);
        p=(ProgressBar)findViewById(R.id.progressBar);
        b=(Button) findViewById(R.id.buttonprog);
        t=(TextView) findViewById(R.id.textprocentaje);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.buttonprog){
            if(!isActivo){
                Thread hilo = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (i<=100){
                            h.post(new Runnable() {
                                @Override
                                public void run() {
                                    t.setText(i+" %");
                                    p.setProgress(i);
                                }
                            });
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            if (i==100){
                                x=new Intent(progressbar.this, menu.class);
                                startActivity(x);
                            }
                            i++;
                            isActivo = true;
                        }
                    }
                });
                hilo.start();
            }
        }
    }
}