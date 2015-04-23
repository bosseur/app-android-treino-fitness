package br.com.while42.treinofitness.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.while42.treinofitness.R;
import br.com.while42.treinofitness.model.Exercicio;

public class ListaExercicioAdapter extends BaseAdapter {

    private List<Exercicio> exercicios;
    private Context context;


    public ListaExercicioAdapter(List<Exercicio> exercicios, Context context) {
        this.context = context;
        this.exercicios = exercicios;
    }

    @Override
    public int getCount() {
        return exercicios.size();
    }

    @Override
    public Exercicio getItem(int position) {
        return exercicios.get(position);
    }

    @Override
    public long getItemId(int position) {
        return exercicios.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Exercicio exercicio = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_exercicio, parent, false);
            ViewHolder holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        ViewHolder holder = (ViewHolder) convertView.getTag();
        holder.txtNome.setText(exercicio.getNome());
        holder.txtRepeticoes.setText(exercicio.getRepeticao()
                +" x " + exercicio.getSerie()
                +" - (" + exercicio.getIntervalo() + ")");

        return convertView;
    }

    class ViewHolder {
        TextView txtNome;
        TextView txtRepeticoes;

        ViewHolder(View view) {
            txtNome = (TextView) view.findViewById(R.id.nome);
            txtRepeticoes = (TextView) view.findViewById(R.id.repeticoes);
        }
    }
}
