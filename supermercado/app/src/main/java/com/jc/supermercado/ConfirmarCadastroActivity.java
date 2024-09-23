package com.jc.supermercado;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ConfirmarCadastroActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_cadastro);

        TextView tvResumoCadastro = findViewById(R.id.tv_resumo_cadastro);

        // Recebendo dados da intent
        String nomeProduto = getIntent().getStringExtra("NOME_PRODUTO");
        String valorProduto = getIntent().getStringExtra("VALOR_PRODUTO");
        String descricaoProduto = getIntent().getStringExtra("DESCRICAO_PRODUTO");

        // Mostrando os dados
        tvResumoCadastro.setText("Produto: " + nomeProduto + "\nValor: R$" + valorProduto + "\nDescrição: " + descricaoProduto);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CicloVida", "ConfirmaCadastro.onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CicloVida", "ConfirmaCadastro.onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CicloVida", "ConfirmaCadastro.onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CicloVida", "ConfirmaCadastro.onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CicloVida", "ConfirmaCadastro.onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("CicloVida", "ConfirmaCadastro.onRestart()");
    }
}
