package br.com.while42.treinofitness.view;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.while42.treinofitness.R;
import br.com.while42.treinofitness.model.Exercicio;
import br.com.while42.treinofitness.model.Treino;

public class ListaTreinosAdapter extends BaseAdapter {


    private List<Treino> treinos;
    private Context context;

    public ListaTreinosAdapter(List<Treino> treinos, Context context) {
        this.treinos = treinos;
        this.context = context;
    }


    @Override
    public int getCount() {
        return treinos.size();
    }

    @Override
    public Treino getItem(int position) {
        return treinos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return treinos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Treino treino = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_treino, parent, false);
            ViewHolder holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        ViewHolder holder = (ViewHolder) convertView.getTag();
        holder.txtNome.setText(treino.getNome());

        return convertView;
    }

    class ViewHolder {
        TextView txtNome;

        ViewHolder(View view) {
            txtNome = (TextView) view.findViewById(R.id.nome);
        }
    }

}
