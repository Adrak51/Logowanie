package com.example.logowanie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String login = "adraczek123";
    private String haslo = "fortnite123";
    private Button zaloguj;
    private EditText loginPole, hasloPole;
    private TextView blad;

    private boolean zgoda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zaloguj = findViewById(R.id.zaloguj);
        loginPole = findViewById(R.id.login);
        hasloPole = findViewById(R.id.haslo);
        blad = findViewById(R.id.blad);

        zaloguj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blad.setTextColor(Color.RED);
                String loginTekst = loginPole.getText().toString();
                String hasloTekst = hasloPole.getText().toString();
                if(loginTekst.equals(login) && hasloTekst.equals(haslo))
                {
                    zaloguj();
                } else if (!loginTekst.equals(login) || !hasloTekst.equals(haslo)) {
                    blad.setText("Podane nieprawidłowe dane");
                }
            }
        });

    }

    public void zaloguj() {
        Intent intent = new Intent(this, MainActivityZalogowano.class);
        startActivity(intent);
        onBackPressed();
    }
}