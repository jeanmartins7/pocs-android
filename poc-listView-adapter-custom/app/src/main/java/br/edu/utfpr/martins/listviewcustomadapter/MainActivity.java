package br.edu.utfpr.martins.listviewcustomadapter;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Exercicio> exercicioList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exercicioList = new ArrayList<>();

        String[]    allExercicios = getResources().getStringArray(R.array.exercicio);
        String[]    allRepeticoes = getResources().getStringArray(R.array.repeticoes);
        String[]    allSeries     = getResources().getStringArray(R.array.series);
        String[]    allPesos      = getResources().getStringArray(R.array.peso);
        String[]    allRepousos   = getResources().getStringArray(R.array.repouso);

        popularListViewExercicio(allExercicios, allRepeticoes, allSeries, allPesos, allRepousos);

        ExercicioAdapter  adapter = new ExercicioAdapter(getApplicationContext(), R.layout.list_exercicio, exercicioList);

        ListView listView = findViewById(R.id.exercicios_list);

        listView.setAdapter(adapter);
    }

    public void popularListViewExercicio(String[] allExercicios, String[] allRepeticoes, String[] allSeries, String[] allPesos, String[] allRepousos){


        exercicioList.add(new Exercicio
                (allExercicios[0], allRepeticoes[0], allSeries[0], allPesos[0], allRepousos[0], R.drawable.peck_deck));

        exercicioList.add(new Exercicio
                (allExercicios[1], allRepeticoes[1], allSeries[1], allPesos[1], allRepousos[1], R.drawable.push_up));

        exercicioList.add(new Exercicio
                (allExercicios[2], allRepeticoes[2], allSeries[2], allPesos[3], allRepousos[4], R.drawable.barbell_bench_press));
        exercicioList.add(new Exercicio
                (allExercicios[3], allRepeticoes[3], allSeries[3], allPesos[3], allRepousos[3], R.drawable.incline_barbell_bench_press));
        exercicioList.add(new Exercicio
                (allExercicios[4], allRepeticoes[4], allSeries[4], allPesos[4], allRepousos[4], R.drawable.standing_cable_crossover));
        exercicioList.add(new Exercicio
                (allExercicios[5], allRepeticoes[5], allSeries[5], allPesos[5], allRepousos[5], R.drawable.flat_bench_dumbbell_fly));
    }
}