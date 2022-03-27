package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistraionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registraion);
    }

    public void signin(View view) {
        startActivity(new Intent(RegistraionActivity.this,LoginActivity.class));
    }

    public void signup(View view) {
        startActivity(new Intent(RegistraionActivity.this,MainActivity.class));
    }
}