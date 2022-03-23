package com.example.lista3_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BemVindoActivity extends AppCompatActivity {
    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);
        getSupportActionBar().setTitle("Home");

        t = (TextView) findViewById(R.id.tvNovaTela);

        Bundle args = getIntent().getExtras();
        String usuario = args.getString("us");

        t.setText("Seja bem-vindo " + usuario);
}
}