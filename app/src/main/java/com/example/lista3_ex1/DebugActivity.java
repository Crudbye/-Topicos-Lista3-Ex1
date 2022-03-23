package com.example.lista3_ex1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class DebugActivity  extends Activity {
    protected static final String TAG = "filtro";

    protected void onCreate(Bundle icicle){
        super.onCreate(icicle);
        Log.i(TAG, "onCreate Chamado");
    }
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart Chamado");
    }
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart Chamado");
    }
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume Chamado");
    }
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause Chamado");
    }
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState chamado");
    }
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop chamado");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy chamado");
    }
}
