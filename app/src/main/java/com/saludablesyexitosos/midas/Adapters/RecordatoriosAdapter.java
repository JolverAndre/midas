package com.saludablesyexitosos.midas.Adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.saludablesyexitosos.midas.Models.Recordatorio;
import com.saludablesyexitosos.midas.R;

import java.util.List;

public class RecordatoriosAdapter extends BaseAdapter {
    int layout;
    Context contexto;
    List<Recordatorio> listado;
    Bundle savedInstanceState;

    public RecordatoriosAdapter(int layout, Context contexto, List<Recordatorio> listado, Bundle savedInstanceState) {
        this.layout = layout;
        this.contexto = contexto;
        this.listado = listado;
        this.savedInstanceState = savedInstanceState;
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
        MapView mapview=view.findViewById(R.id.mapView);
        mapview.onCreate(savedInstanceState);
        mapview.onResume();
        mapview.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                Toast.makeText(contexto, "comenzo?", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
