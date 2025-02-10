package com.murek.promedionotas;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.etNumero1);
        et2 = findViewById(R.id.etNumero2);
        et3 = findViewById(R.id.etNumero3);
        tvResult = findViewById(R.id.tvResultado);

    }

    public void evaluar(View view) {
        String num1 = et1.getText().toString();
        String num2 = et2.getText().toString();
        String num3 = et3.getText().toString();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);

        int res = (n1 + n2 + n3)/3;

        if (res >= 7){
            tvResult.setText("Aprobado");
        } else {
            tvResult.setText("Reprobado");
        }
    }
}