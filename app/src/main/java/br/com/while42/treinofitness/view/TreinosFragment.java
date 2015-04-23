package br.com.while42.treinofitness.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.while42.treinofitness.R;
import br.com.while42.treinofitness.model.Exercicio;
import br.com.while42.treinofitness.model.Treino;


public class TreinosFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_treinos, container, false);
        final List<Treino> treinos = getTreinos();

        ListView listaTreinos = (ListView) view.findViewById(R.id.lista_treinos);
        ListaTreinosAdapter adapter = new ListaTreinosAdapter(treinos, getActivity());
        listaTreinos.setAdapter(adapter);

        listaTreinos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Bundle args =  new Bundle();
                args.putSerializable("exercicios", (java.io.Serializable) treinos.get(position).getExercicios());

                MainActivity mainActivity = (MainActivity) getActivity();
                ExerciciosFragment exerciciosFragment = new ExerciciosFragment();
                exerciciosFragment.setArguments(args);

                exerciciosFragment.setArguments(args);
                mainActivity.goTo(exerciciosFragment);
            }
        });

        return view;
    }

    private List<Treino> getTreinos() {
        List<Treino> treinos = new ArrayList<Treino>();

        // Treino A
        List<Exercicio> exercicios1 = new ArrayList<Exercicio>();
        exercicios1.add(new Exercicio("Flexoes", 3, 10));
        exercicios1.add(new Exercicio("Abdominais", 5, 20));

        Treino treino1 = new Treino("Treino A");
        treino1.setExercicios(exercicios1);


        // Treino B
        List<Exercicio> exercicios2 = new ArrayList<Exercicio>();
        exercicios2.add(new Exercicio("Flexoes", 3, 10));
        exercicios2.add(new Exercicio("Abdominais", 5, 20));

        Treino treino2 = new Treino("Treino B");
        treino2.setExercicios(exercicios2);


        treinos = Arrays.asList(treino1, treino2);
        return treinos;
    }
}
