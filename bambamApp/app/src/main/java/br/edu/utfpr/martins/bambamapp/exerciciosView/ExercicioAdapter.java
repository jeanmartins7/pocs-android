package br.edu.utfpr.martins.bambamapp.exerciciosView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import br.edu.utfpr.martins.bambamapp.R;

public class ExercicioAdapter extends ArrayAdapter<Exercicio>{
    private ArrayList<Exercicio> exerciciosList;

    public ExercicioAdapter(@NonNull Context context, int resource, ArrayList<Exercicio> exerciciosList) {
        super(context, 0, exerciciosList);
        this.exerciciosList = exerciciosList;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int phraseIndex = position;
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_exercicio,
                    parent, false);
        }
        ImageView   exercicioImage  = convertView.findViewById(R.id.exercicio_image);
        TextView    title_exercicio = convertView.findViewById(R.id.exercicio_nome);
        TextView    serie           = convertView.findViewById(R.id.exercicio_serie);
        TextView    repeticoes           = convertView.findViewById(R.id.exercicio_repeticoes);
        TextView    peso           = convertView.findViewById(R.id.exercicio_repouso);
        TextView    repouso           = convertView.findViewById(R.id.exercicio_peso);

        exercicioImage.setImageResource(exerciciosList.get(position).getExercicioImageId());
        title_exercicio.setText(exerciciosList.get(position).getExercicio());
        serie.setText(exerciciosList.get(position).getnSeries());
        repeticoes.setText(exerciciosList.get(position).getnRepeticoes());
        peso.setText(exerciciosList.get(position).getPeso());
        repouso.setText(exerciciosList.get(position).getRepouso());

        return convertView;
    }
}