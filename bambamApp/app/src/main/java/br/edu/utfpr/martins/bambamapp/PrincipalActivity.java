package br.edu.utfpr.martins.bambamapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.edu.utfpr.martins.bambamapp.pessoas.CadastroActivity;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

    }

    public void aboutActivity(View view){

        Intent intentAbout = new Intent(this, AboutActivity.class);

        startActivity(intentAbout);
    }

    public void cadastrarAlunoActivity(View view){

        Intent intentCadastro  = new Intent(this, CadastroActivity.class);

        startActivity(intentCadastro);
    }


}