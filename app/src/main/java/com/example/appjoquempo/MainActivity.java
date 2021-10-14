package com.example.appjoquempo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    Pedra = 0
    Papel = 1
    Tesoura = 2
     */

    public void selecionadoPedra(View view){
        this.opcaoSelecionado(0);
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionado(1);
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionado(2);
    }

    public void opcaoSelecionado(int opcaoUsuario){
        ImageView imageResultado = findViewById(R.id.imageResultado);
        TextView textView = findViewById(R.id.textResultado);

        int opcaoApp = new Random().nextInt(3);
    }

}