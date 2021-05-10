package com.example.exercicio10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //1euro = 6,4 reais;
    //1euro = 1,20 dolar;
    //1euro = 785,14 kwanzas;
    EditText txteuros;

    public  void kwanza (View view){
        txteuros = findViewById(R.id.txteuros);
        double valork = Double.parseDouble(txteuros.getText().toString());


        double kwanza = 785.14;
        double k = valork * kwanza;
        Toast.makeText(MainActivity.this, + k + " Kzs" , Toast.LENGTH_LONG).show();

    }

    public void real (View view){
        txteuros = findViewById(R.id.txteuros);
        double valorR = Double.parseDouble(txteuros.getText().toString());


        double real = 6.4;
        double r = valorR * real;
        Toast.makeText(MainActivity.this, + r + " Reais", Toast.LENGTH_LONG).show();

    }

    public void dolar (View view){
        txteuros = findViewById(R.id.txteuros);
        double valorD = Double.parseDouble(txteuros.getText().toString());

        double dolar = 1.20;
        double d = valorD * dolar;
        Toast.makeText(MainActivity.this, + d + "$", Toast.LENGTH_LONG).show();
    }

}