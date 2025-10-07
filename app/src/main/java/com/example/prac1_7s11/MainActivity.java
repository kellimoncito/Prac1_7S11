package com.example.prac1_7s11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txtAllenews, txtAlGertws, txtAllTelefons;
    Button BreakSignatures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar vistas
        BreakSignatures = this.findViewById(R.id.createSignalment);
        txtAllenews = this.findViewById(R.id.textAmount);
        txtAlGertws = this.findViewById(R.id.textAmount2);
        txtAllTelefons = this.findViewById(R.id.textFileFrame);

        // Configurar el botón
        BreakSignatures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signature();
            }
        });
    }

    public void signature() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        // Pasar los datos a la segunda actividad
        intent.putExtra("nombre", txtAllenews.getText().toString());
        intent.putExtra("correo", txtAlGertws.getText().toString());
        intent.putExtra("telefono", txtAllTelefons.getText().toString());

        startActivity(intent);
    }
}