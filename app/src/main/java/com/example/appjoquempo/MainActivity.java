package com.example.appjoquempo;

import androidx.annotation.ColorInt;
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
        TextView textResultado = findViewById(R.id.textResultado);

        int opcaoApp = new Random().nextInt(3);

        switch (opcaoApp){
            case 0:
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case 1:
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case 2:
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if(
                (opcaoApp == 2 && opcaoUsuario == 1) ||
                (opcaoApp == 1 && opcaoUsuario == 0) ||
                (opcaoApp == 0 && opcaoUsuario == 2)
        ) { // Logica quando o App ganha
            textResultado.setText("Você perdeu :(");
            textResultado.setTextColor(getResources().getColor(R.color.red));
        } else if(
                (opcaoUsuario == 2 && opcaoApp == 1) ||
                (opcaoUsuario == 1 && opcaoApp == 0) ||
                (opcaoUsuario == 0 && opcaoApp == 2)
        ) { // Logica quando o usuario ganha
            textResultado.setText("Você ganhou :)");
            textResultado.setTextColor(getResources().getColor(R.color.verde));
        } else { // logica quando haver empate
            textResultado.setText("Empatou ;)");
            textResultado.setTextColor(getResources().getColor(R.color.black));
        }

    }

}