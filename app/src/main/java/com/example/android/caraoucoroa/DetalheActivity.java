package com.example.android.caraoucoroa;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView botaoVoltar;
    private ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        botaoVoltar = (ImageView) findViewById(R.id.botaoVoltarId);
        imagem = (ImageView) findViewById(R.id.moedaId);

        botaoVoltar.setOnClickListener(this);

        Bundle extra = getIntent().getExtras();

        if(extra != null){
            String opcaoEscolhida = extra.getString("opcao");

            if(opcaoEscolhida.equals("cara")){
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else{
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if(id == R.id.botaoVoltarId){

            finish();
        }
    }
}
