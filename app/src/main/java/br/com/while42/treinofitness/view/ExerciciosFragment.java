package br.com.while42.treinofitness.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.while42.treinofitness.R;
import br.com.while42.treinofitness.model.Exercicio;


public class ExerciciosFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exercicios, container, false);

        List<Exercicio> exercicios = (List<Exercicio>)getArguments().getSerializable("exercicios");

        ListView listaExercicios = (ListView)view.findViewById(R.id.lista_exercicio);
        ListaExercicioAdapter adapter = new ListaExercicioAdapter(exercicios, getActivity());

        listaExercicios.setAdapter(adapter);

        return view;
    }


}
