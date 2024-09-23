package com.jc.supermercado;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCadastro = findViewById(R.id.btn_cadastro);
        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CicloVida", "MainActivity.onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CicloVida", "MainActivity.onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CicloVida", "MainActivity.onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CicloVida", "MainActivity.onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CicloVida", "MainActivity.onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("CicloVida", "MainActivity.onRestart()");
    }
}



