package br.com.TapPay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

import com.TapPay.nfccardread.R;

public class Cobrar extends AppCompatActivity {



    Button btnUm, btnDois, btnTres, btnQuatro, btnCinco, btnSeis, btnSete, btnOito,
            btnNove, btnZero,btnConfimar, btnCancelar;

    EditText etCobranca, etConcatenar;

    double numero1;
    String operador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobrar);

        btnUm = (Button)findViewById(R.id.btnUm);
        btnDois = (Button)findViewById(R.id.btnDois);
        btnTres = (Button)findViewById(R.id.btnTres);
        btnQuatro = (Button)findViewById(R.id.btnQuatro);
        btnCinco = (Button)findViewById(R.id.btnCinco);
        btnSeis = (Button)findViewById(R.id.btnSeis);
        btnSete = (Button)findViewById(R.id.btnSete);
        btnOito = (Button)findViewById(R.id.btnOito);
        btnNove = (Button)findViewById(R.id.btnNove);
        btnZero = (Button)findViewById(R.id.btnZero);
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
        btnConfimar = (Button)findViewById(R.id.btnConfirmar);


        btnUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etCobranca);
                etCobranca.setText(etConcatenar.getText().toString() + "1");
            }
        });

        btnDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etCobranca);
                etCobranca.setText(etConcatenar.getText().toString() + "2");
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etCobranca);
                etCobranca.setText(etConcatenar.getText().toString() + "3");
            }
        });

        btnQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etCobranca);
                etCobranca.setText(etConcatenar.getText().toString() + "4");
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etCobranca);
                etCobranca.setText(etConcatenar.getText().toString() + "5");
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etCobranca);
                etCobranca.setText(etConcatenar.getText().toString() + "6");
            }
        });

        btnSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etCobranca);
                etCobranca.setText(etConcatenar.getText().toString() + "7");
            }
        });

        btnOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etCobranca);
                etCobranca.setText(etConcatenar.getText().toString() + "8");
            }
        });

        btnNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etCobranca);
                etCobranca.setText(etConcatenar.getText().toString() + "9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etCobranca);
                etCobranca.setText(etConcatenar.getText().toString() + "0");
            }
        });

        btnConfimar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Cobrar.class);
                startActivity(intent);

            }
        });




    }
}


