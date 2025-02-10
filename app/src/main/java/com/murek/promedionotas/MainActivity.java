package com.murek.promedionotas;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.murek.promedionotas.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    public void evaluar(View view) {
        String num1 = binding.etNumero1.getText().toString();
        String num2 = binding.etNumero2.getText().toString();
        String num3 = binding.etNumero3.getText().toString();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);

        int res = (n1 + n2 + n3)/3;

        if (res >= 7){
            binding.tvResultado.setText("Aprobado");
        } else {
            binding.tvResultado.setText("Reprobado");
        }
    }
}