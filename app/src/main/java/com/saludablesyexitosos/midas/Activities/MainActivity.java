package com.saludablesyexitosos.midas.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.saludablesyexitosos.midas.Adapters.RecordatoriosAdapter;
import com.saludablesyexitosos.midas.Models.Recordatorio;
import com.saludablesyexitosos.midas.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lucifer.org.snackbartest.Icon;
import lucifer.org.snackbartest.MySnack;

public class MainActivity extends AppCompatActivity {
    ListView listViewRecordatorios;
    RecordatoriosAdapter adapter;
    List<Recordatorio> listado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listViewRecordatorios=findViewById(R.id.lvrecordatorios_activitymain);
        listado= new ArrayList<>();
        listado.add(new Recordatorio(1,1," asd asda sda sdasd asd asd asd","lugar muy lejano",10,20,new Date()));
        listado.add(new Recordatorio(1,1," asd asda sda sdasd asd asd asd","lugar muy lejano",10,20,new Date()));
        listado.add(new Recordatorio(1,1," asd asda sda sdasd asd asd asd","lugar muy lejano",10,20,new Date()));
        listado.add(new Recordatorio(1,1," asd asda sda sdasd asd asd asd","lugar muy lejano",10,20,new Date()));
        listado.add(new Recordatorio(1,1," asd asda sda sdasd asd asd asd","lugar muy lejano",10,20,new Date()));
        listado.add(new Recordatorio(1,1," asd asda sda sdasd asd asd asd","lugar muy lejano",10,20,new Date()));
        listado.add(new Recordatorio(1,1," asd asda sda sdasd asd asd asd","lugar muy lejano",10,20,new Date()));
        listado.add(new Recordatorio(1,1," asd asda sda sdasd asd asd asd","lugar muy lejano",10,20,new Date()));
        listado.add(new Recordatorio(1,1," asd asda sda sdasd asd asd asd","lugar muy lejano",10,20,new Date()));
        listado.add(new Recordatorio(1,1," asd asda sda sdasd asd asd asd","lugar muy lejano",10,20,new Date()));
        listado.add(new Recordatorio(1,1," asd asda sda sdasd asd asd asd","lugar muy lejano",10,20,new Date()));


        adapter=new RecordatoriosAdapter(R.layout.item_recordatorios,getApplicationContext(),listado,savedInstanceState);
        listViewRecordatorios.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MySnack.SnackBuilder(findViewById(R.id.activity_main))
                        .setText("Nueva cita?")
                        .setTextColor("#ffffff")
                        .setTextSize(20)
                        .setBgColor("#FFC107")
                        .setDurationInSeconds(10)
                        .setActionBtnColor("#f44336")
                        .setIcon(Icon.WARNING)
                        .setActionListener("Ok", new View.OnClickListener() {  //optional
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(getApplicationContext(),"done",Toast.LENGTH_LONG).show();
                            }
                        })
                        .build();
            }
        });


    }

}
