package com.example.ido;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AccountRecovery extends AppCompatActivity {
    Button btnAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_recovery);
        btnAccept = (Button) findViewById(R.id.btnAccept);
        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenet = new Intent(AccountRecovery.this, PasswordRecovery.class);
                startActivity(intenet);
            }
        });
    }
}