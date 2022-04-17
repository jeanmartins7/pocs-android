package br.edu.utfpr.martins.transientactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
    private Autor autor;
    private TextView textViewAutor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        textViewAutor = findViewById(R.id.textViewAutor);

        Intent intent = getIntent();

        autor = (Autor) intent.getSerializableExtra("autor");

        String nome = "Autor: " + autor.getNome() + " " + autor.getSobrenome();

        textViewAutor.setText(nome);

    }
}