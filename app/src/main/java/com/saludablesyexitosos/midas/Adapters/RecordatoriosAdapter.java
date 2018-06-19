package com.saludablesyexitosos.midas.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.saludablesyexitosos.midas.Models.Recordatorio;

import java.util.List;

public class RecordatoriosAdapter extends BaseAdapter {
    int layout;
    Context contexto;
    List<Recordatorio> listado;

    public RecordatoriosAdapter(int layout, Context contexto, List<Recordatorio> listado) {
        this.layout = layout;
        this.contexto = contexto;
        this.listado = listado;
    }

    @Override
    public int getCount() {
        return listado.size();
    }

    @Override
    public Object getItem(int i) {
        return listado.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listado.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(contexto).inflate(layout, viewGroup, false);
        }



        return view;
    }
}
