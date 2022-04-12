package br.edu.utfpr.martins.jean;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listViewExerciciosPeito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewExerciciosPeito = findViewById(R.id.listViewExerciciosPeito);

        popularListViewExercicioPeito();
    }

    private void popularListViewExercicioPeito(){

        String[] exercicio = getResources().getStringArray(R.array.exercicios);
        int[]    repeticoes = getResources().getIntArray(R.array.repeticoes);
        int[]    series     = getResources().getIntArray(R.array.series);
        int[]    peso       = getResources().getIntArray(R.array.peso);
        int[]    repouso    = getResources().getIntArray(R.array.repouso);

        ArrayList<Exercicio> exerciciosPeito = new ArrayList<>();

        for (int cont = 0; cont< exercicio.length; cont ++){
            exerciciosPeito.add(new Exercicio
                    (exercicio[cont], repeticoes[cont], series[cont], peso[cont], repouso[cont]));
        }

        ArrayAdapter<Exercicio> adapter =
                new ArrayAdapter(this, android.R.layout.simple_list_item_1, exerciciosPeito);

        listViewExerciciosPeito.setAdapter(adapter);

    }

}