package com.example.logowanie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityZalogowano extends AppCompatActivity {

    private Button wyloguj;
    private TextView witaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_zalogowano);

        Intent intent = getIntent();
        String login = intent.getStringExtra("login");

        wyloguj = findViewById(R.id.wyloguj);
        witaj = findViewById(R.id.textWitaj);

        witaj.setText("Witaj " + login + "!");
        wyloguj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wyloguj();
            }
        });

    }

    public void wyloguj() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}