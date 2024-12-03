package com.example.ido;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {
    Button btnLogin;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnLogin =(Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v)
            {
                Intent intenet = new Intent(Home.this, Login.class);
                startActivity(intenet);
            }
        });
        btnRegister =(Button)findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v)
            {
                Intent intenet = new Intent(Home.this, Register.class);
                startActivity(intenet);
            }
        });


    }
}