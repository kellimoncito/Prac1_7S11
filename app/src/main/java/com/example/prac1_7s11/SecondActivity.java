package com.example.prac1_7s11;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Asegúrate que esta línea esté correcta
        tvResultado = findViewById(R.id.tvResultado);

        // Recibir los datos del Intent
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String correo = intent.getStringExtra("correo");
        String telefono = intent.getStringExtra("telefono");

        // Mostrar los datos
        String resultado = "Datos ingresados:\n\n" +
                "Nombre: " + nombre + "\n" +
                "Correo: " + correo + "\n" +
                "Teléfono: " + telefono;

        tvResultado.setText(resultado);
    }
}