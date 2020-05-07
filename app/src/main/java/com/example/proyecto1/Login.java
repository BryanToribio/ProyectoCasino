package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button btn_ir_registrarse,iniciar_sesión;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        btn_ir_registrarse=findViewById(R.id.btn_ir_registrarse);
        iniciar_sesión=findViewById(R.id.iniciar_sesion);

        btn_ir_registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this,SignUp.class));
                finish();
            }
        });

        iniciar_sesión.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Login.this, "Bienvendio Usuario:", Toast.LENGTH_SHORT).show();
                //Aquí codigo
            }
        });
    }
}