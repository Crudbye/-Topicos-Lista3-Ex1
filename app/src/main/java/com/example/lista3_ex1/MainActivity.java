package com.example.lista3_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity implements View.OnClickListener{

    private EditText et1;
    private EditText et2;
    private Button bt2;
    private String usuario;
    private String senha;
    private static final String us = "Admin";
    private static final String pss = "123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        bt2 = (Button) findViewById(R.id.bt2);

       if(savedInstanceState!=null){
           usuario = savedInstanceState.getString("us");
           senha = savedInstanceState.getString("pss");
       }
    else {
        usuario = "Sem User";
        senha = "Sem senha";
       }

        bt2.setOnClickListener(this);

    }
    protected void onSaveInstanceState(Bundle dados){
        super.onSaveInstanceState(dados);
        dados.putString("us", usuario);
        dados.putString("pss", senha);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.bt2){
            String usuario = et1.getText().toString();
            String senha = et2.getText().toString();

            if(usuario.equals(us) && senha.equals(pss)) {
                Intent intent = new Intent(this, BemVindoActivity.class);
                Bundle params = new Bundle();
                params.putString("us", usuario);
                intent.putExtras(params);
                startActivity(intent);
            }
            else if(usuario!=us){
                Toast.makeText(getApplicationContext(), "Úsuario Incorreto", Toast.LENGTH_LONG).show();
            }
            else if(senha!=pss){
                Toast.makeText(getApplicationContext(), "Senha Incorreta", Toast.LENGTH_LONG).show();
            }
            else if(usuario!=us && senha!=pss){
                Toast.makeText(getApplicationContext(), "Úsuario e Senha Incorretos", Toast.LENGTH_LONG).show();
            }
        }
    }
}