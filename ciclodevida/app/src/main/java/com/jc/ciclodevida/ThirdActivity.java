package com.jc.ciclodevida;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("CicloVida", "ThirdActivity.onCreate()");
        setContentView(R.layout.third);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CicloVida", "ThirdActivity.onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CicloVida", "ThirdActivity.onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CicloVida", "ThirdActivity.onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CicloVida", "ThirdActivity.onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CicloVida", "ThirdActivity.onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("CicloVida", "ThirdActivity.onRestart()");
    }
}
