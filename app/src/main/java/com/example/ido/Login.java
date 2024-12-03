package com.example.ido;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button btnForgotThePassword;
    Button btnAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnForgotThePassword = (Button) findViewById(R.id.btnForgetThePassword);
        btnForgotThePassword.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intenet = new Intent(Login.this, AccountRecovery.class);
                startActivity(intenet);
            }
        });
        btnAccept = (Button) findViewById(R.id.btnAccept);
        btnAccept.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intenet = new Intent(Login.this, InviteFriend.class);
                startActivity(intenet);
            }
        });
    }
}