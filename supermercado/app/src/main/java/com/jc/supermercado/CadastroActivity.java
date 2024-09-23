package com.jc.supermercado;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class CadastroActivity extends Activity {

    private EditText etNomeProduto, etValorProduto, etDescricaoProduto;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etNomeProduto = findViewById(R.id.et_nome_produto);
        etValorProduto = findViewById(R.id.et_valor_produto);
        etDescricaoProduto = findViewById(R.id.et_descricao_produto);

        Button btnConfirmar = findViewById(R.id.btn_confirmar_cadastro);
        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CadastroActivity.this, ConfirmarCadastroActivity.class);
                intent.putExtra("NOME_PRODUTO", etNomeProduto.getText().toString());
                intent.putExtra("VALOR_PRODUTO", etValorProduto.getText().toString());
                intent.putExtra("DESCRICAO_PRODUTO", etDescricaoProduto.getText().toString());
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CicloVida", "Cadastro.onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CicloVida", "Cadastro.onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CicloVida", "Cadastro.onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CicloVida", "Cadastro.onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CicloVida", "Cadastro.onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("CicloVida", "Cadastro.onRestart()");
    }
}
