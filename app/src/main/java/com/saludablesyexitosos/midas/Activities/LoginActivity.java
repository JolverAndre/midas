package com.saludablesyexitosos.midas.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.saludablesyexitosos.midas.R;

public class LoginActivity extends AppCompatActivity {
    TextView tvTitulo;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/kaushanscriptregular.ttf");
        tvTitulo = findViewById(R.id.tvTitle_activitylogin);
        tvTitulo.setTypeface(typeface);
        btnlogin = findViewById(R.id.btnlogin_activitylogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }
}
