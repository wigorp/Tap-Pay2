package br.com.TapPay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.TapPay.nfccardread.R;


public class Cobrar extends AppCompatActivity {

    long Cobrar = 0;
    boolean ultimoClickIgual= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobrar);
    }

    public void clickbtnCancelar (View view){
        TextView display = findViewById(R.id.etCobranca);
        display.setText("");


    }

    public void ExibirNaTela (int digito){
        TextView display = findViewById(R.id.etCobranca);
        String TelaAnterior = display.getText().toString();
        if((TelaAnterior=="0")||(TelaAnterior=="")||ultimoClickIgual)
        {
            if (digito!=0)
                display.setText(""+digito);
            else display.setText("0");
        }
        else
        {
            String digitosDisplay = TelaAnterior + digito;
            display.setText(digitosDisplay);}
        ultimoClickIgual=false;
    }

    public void actualizaResultado (int digito)
    {
        Cobrar = (Cobrar*10) + digito;
    }


    public void clickbtnUm (View view){
        ExibirNaTela(1);
        actualizaResultado (1);
    }
    public void clickbtnDois (View view){
        ExibirNaTela(2);
        actualizaResultado (2);
    }
    public void clickbtnTres (View view){
        ExibirNaTela(3);
        actualizaResultado (3);
    }
    public void clickbtnQuatro (View view){
        ExibirNaTela(4);
        actualizaResultado (4);
    }
    public void clickbtnCinco (View view){
        ExibirNaTela(5);
        actualizaResultado (5);
    }
    public void clickbtnSeis (View view){
        ExibirNaTela(6);
        actualizaResultado (6);
    }
    public void clickbtnSete (View view){
        ExibirNaTela(7);
        actualizaResultado (7);
    }
    public void clickbtnOito (View view){
        ExibirNaTela(8);
        actualizaResultado (8);
    }
    public void clickbtnNove (View view){
        ExibirNaTela(9);
        actualizaResultado (9);
    }
    public void clickbtnZero (View view){
        ExibirNaTela(0);
        actualizaResultado (0);
    }

    public void clickbtnConfirmar (View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }


}



